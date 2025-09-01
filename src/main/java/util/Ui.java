package util;

import java.util.ArrayList;
import java.util.Scanner;

import tasks.Task;
import tasks.TaskList;

/**
 * Ui class for handling user interactions
 */
public class Ui {

    private Scanner scanner;

    /**
     * Initialize scanner and read input
     *
     * @return user input command
     */
    public String readCommand() {
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
        return scanner.nextLine();
    }

    /**
     * Prints the opening message and logo
     */
    public void hello() {
        String logo = """
                     _ ___ _   ___        _____   ___
                    | |_ _| \\ | \\ \\      / / _ \\ / _ \\
                 _  | || ||  \\| |\\ \\ /\\ / / | | | | | |
                | |_| || || |\\  | \\ V  V /| |_| | |_| |
                 \\___/|___|_| \\_|  \\_/\\_/  \\___/ \\___/""";
        System.out.println(logo);
        System.out.println("________________________________________");
        System.out.println("Hello! I'm Jinwoo, the Shadow Monarch\nWhat can I do for you?");
        System.out.println("________________________________________");
    }

    public void printLine() {
        System.out.println("________________________________________");
    }

    /**
     * Error message
     */
    public void showError(String message) {
        System.out.println(message);
    }
    /**
     * Prints a task according to task's toString()
     */
    public void printTask(TaskList tasks, int taskNum) {
        System.out.println(tasks.getTasks(taskNum));
    }

    /**
     * List message
     */
    public void printList(TaskList tasks) {
        ArrayList<Task> taskList = tasks.getTasks();
        taskList.forEach(task ->
                System.out.printf("%d.%s\n", taskList.indexOf(task) + 1, task));
    }
    /**
     * Delete message
     */
    public void printDelete(Task task, int size) {
        System.out.println("Noted. I've removed this task:");
        System.out.println(task);
        System.out.printf("Now you have %d tasks in the list.\n", size);
    }
    /**
     * Add message
     */
    public void printAdd(Task task, int size) {
        System.out.println("Got it. I've added this task:");
        System.out.println(task);
        System.out.printf("Now you have %d tasks in the list.\n", size);
    }
}
