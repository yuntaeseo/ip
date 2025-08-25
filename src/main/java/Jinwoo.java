import java.util.ArrayList;
import java.util.Scanner;

public class Jinwoo {

    public static ArrayList<String> todoList = new ArrayList<>();

    public static void echo() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            System.out.println("________________________________________");
            if (input.equals("bye")) {
                System.out.println("Bye Hunter ???. Hope to see you again soon.");
                return;
            } else if (input.equals("list")) {
                todoList.forEach(task -> System.out.printf("%d. %s\n", todoList.indexOf(task) + 1, task));
            } else {
                todoList.add(input);
                System.out.printf("added: %s\n", input);
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

