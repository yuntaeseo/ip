import java.util.ArrayList;
import java.util.Scanner;

public class Jinwoo {

    protected static ArrayList<Task> todoList = new ArrayList<>();

    public static void echo() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                String input = scanner.nextLine();
                System.out.println("________________________________________");
                if (input.equals("bye")) {
                    System.out.println("Bye Hunter ???. Hope to see you again soon.");
                    return;
                } else if (input.startsWith("delete")) {
                    int taskNum = Integer.parseInt(input.split(" ")[1]);
                    Task task = todoList.remove(taskNum - 1);
                    System.out.println("Noted. I've removed this task:");
                    System.out.println(task);
                    System.out.println("Now you have " + todoList.size() + " tasks in the list.");
                } else if (input.startsWith("mark")) {
                    int taskNum = Integer.parseInt(input.split(" ")[1]);
                    Task task = todoList.get(taskNum - 1);
                    task.mark();
                    System.out.println("Nice! I've marked this task as done:");
                    System.out.println(task);
                } else if (input.startsWith("unmark")) {
                    int taskNum = Integer.parseInt(input.split(" ")[1]);
                    Task task = todoList.get(taskNum - 1);
                    task.unmark();
                    System.out.println("OK, I've marked this task as not done yet:");
                    System.out.println(task);
                } else if (input.equals("list")) {
                    System.out.println("Here are the tasks in your list:");
                    todoList.forEach(task -> System.out.printf("%d.%s\n", todoList.indexOf(task) + 1, task));
                } else {
                    if (input.startsWith("todo")) {
                        String description = input.replaceFirst("todo", "").trim();
                        Task task = new Todo(description);
                        todoList.add(task);
                        System.out.println("Got it. I've added this task:");
                        System.out.println(task);
                    } else if (input.startsWith("deadline")) {
                        input = input.replaceFirst("deadline", "").trim();
                        String description = input.split(" /by ")[0];
                        String by = input.split(" /by ")[1];
                        Task task = new Deadline(description, by);
                        todoList.add(task);
                        System.out.println("Got it. I've added this task:");
                        System.out.println(task);
                    } else if (input.startsWith("event")) {
                        input = input.replaceFirst("event", "").trim();
                        String description = input.split(" /from ")[0];
                        String from = input.split(" /from ")[1].split(" /to ")[0];
                        String to = input.split(" /to ")[1];
                        Task task = new Event(description, from, to);
                        todoList.add(task);
                        System.out.println("Got it. I've added this task:");
                        System.out.println(task);
                    } else {
                        throw new DukeException("????? : You kidding me");
                    }
                    System.out.println("Now you have " + todoList.size() + " tasks in the list.");
                }
            } catch (DukeException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("________________________________________");
            }
        }
    }


    public static void main(String[] args) {
        String logo = """
                      _ ___ _  ___      _____   ___ \s
                  _ | |_ _| \\| \\ \\    / / _ \\ / _ \\\s
                 | || || || .` |\\ \\/\\/ / (_) | (_) |
                  \\__/|___|_|\\_| \\_/\\_/ \\___/ \\___/ \
                """;
        System.out.println(logo);
        System.out.println("________________________________________");
        System.out.println("Hello! I'm Jinwoo, the Shadow Monarch\nWhat can I do for you?");
        System.out.println("________________________________________");
        echo();

    }
}
