import java.util.ArrayList;
import java.util.Scanner;

public class Jinwoo {

    protected static ArrayList<Task> todoList = new ArrayList<>();

    public static void echo() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            System.out.println("________________________________________");
            if (input.equals("bye")) {
                System.out.println("Bye Hunter ???. Hope to see you again soon.");
                return;
            } else if (input.startsWith("mark")) {
                int taskNum = Integer.parseInt(input.split(" ")[1]);
                Task task = todoList.get(taskNum - 1);
                task.mark();
                System.out.println("Nice! I've marked this task as done:");
                System.out.printf("[%s] %s\n", task.getStatusIcon(), task.getDescription());
            } else if (input.startsWith("unmark")) {
                int taskNum = Integer.parseInt(input.split(" ")[1]);
                Task task = todoList.get(taskNum - 1);
                task.unmark();
                System.out.println("OK, I've marked this task as not done yet:");
                System.out.printf("[%s] %s\n", task.getStatusIcon(), task.getDescription());
            } else if (input.equals("list")) {
                System.out.println("Here are the tasks in your list:");
                todoList.forEach(task -> System.out.printf("%d.[%s] %s\n", todoList.indexOf(task) + 1, task.getStatusIcon(), task.getDescription()));
            } else {
                Task task = new Task(input);
                todoList.add(task);
                System.out.printf("added: %s\n", task.getDescription());
            }
            System.out.println("________________________________________");
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

