import java.util.Scanner;

public class Jinwoo {

    public static void echo() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("bye")) {
                return;
            } else {
                System.out.println("________________________________________");
                System.out.println(input);
                System.out.println("\n________________________________________");
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
        System.out.println("________________________________________");
        System.out.println("Bye Hunter ???. Hope to see you again soon.");
        System.out.println("________________________________________");



    }
}

