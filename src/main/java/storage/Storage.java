package storage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import exception.DukeException;
import tasks.Deadline;
import tasks.Event;
import tasks.Task;
import tasks.Todo;

/**
 * Storage class for handling data input output
 */
public class Storage {
    private static final String PATH = "./data/save.txt";

    /**
     * Load task
     * if the file does not exist, create a new file and return an empty list
     * @throws RuntimeException if there is an error reading the file
     */
    @SuppressWarnings("ResultOfMethodCallIgnored")
    public static ArrayList<Task> loadTasks() {
        ArrayList<Task> todoList = new ArrayList<>();
        try {
            File file = new File(PATH);
            if (!file.exists()) { // Create the file if it does not exist
                file.getParentFile().mkdirs();
                file.createNewFile();
                return todoList;
            }
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String text = scanner.nextLine();
                Task task = parseTaskFromText(text);
                todoList.add(task);
            }
        } catch (IOException e) {
            System.out.println("Error reading save file: " + e.getMessage());
            throw new RuntimeException("Failed to handle save file", e);
        }
        return todoList;
    }

    /**
     * Parse task from text
     * @throws RuntimeException if the text format is invalid
     */
    public static Task parseTaskFromText(String text) {
        String type = null;
        String description = null;
        try {
            String[] texts = text.split(" \\| ");
            type = texts[0];
            boolean isDone = texts[1].equals("1");
            description = texts[2];
            switch (type) {
            case "T":
                Task todo = new Todo(description);
                if (isDone) {
                    todo.mark();
                }
                return todo;
            case "D":
                String by = texts[3];
                Task deadline = new Deadline(description, by);
                if (isDone) {
                    deadline.mark();
                }
                return deadline;
            case "E":
                String from = texts[3];
                String to = texts[4];
                Task event = new Event(description, from, to);
                if (isDone) {
                    event.mark();
                }
                return event;
            default:
                throw new RuntimeException("Please check task type T, D, E");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Argument missing for: " + type + " " + description);
            throw new RuntimeException("Fix save file", e);
        } catch (DukeException e) {
            System.out.println("Fix save file" + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
