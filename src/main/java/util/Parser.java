package util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;

import command.AddCommand;
import command.Command;
import command.DeleteCommand;
import command.ExitCommand;
import command.ListCommand;
import command.MarksCommand;
import exception.DukeException;

/**
 * A utility class for Parsing.
 */
public class Parser {
    private static final String BYE = "bye";
    private static final String MARK = "mark";
    private static final String UNMARK = "unmark";
    private static final String LIST = "list";
    private static final String DELETE = "delete";
    private static final String TODO = "todo";
    private static final String DEADLINE = "deadline";
    private static final String EVENT = "event";

    /**
     * Parses a string into a LocalDate object.
     *
     * @throws DateTimeParseException if the input string is not in the correct format.
     */
    public static LocalDate parseToDate(String by) {
        try {
            String date = by.trim();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.ENGLISH);
            return (LocalDate.parse(date, formatter));
        } catch (DateTimeParseException e) {
            System.out.println("Warning ??? : Please enter date in the format yyyy-MM-dd.");
            throw new DateTimeParseException("Invalid date format", by, e.getErrorIndex());
        }
    }

    /**
     * Parses a command string into a meaningful Command object
     *
     * @returns fully string array as Command object
     */
    public static Command parseCommand(String input) throws DukeException {
        if (input == null || input.trim().isEmpty()) {
            throw new DukeException("Warning ???: Empty Command");
        }
        // Allow multiple spaces between words and trim it
        String trimmed = input.trim().replaceAll("\\s+", " ");
        // Split only type and the rest
        String[] parts = trimmed.split(" ", 2);
        String type = parts[0];
        try {
            if (type.equals(BYE)) {
                return new ExitCommand();
            } else if (type.equals(MARK)) {
                String taskNum = parts[1];
                return new MarksCommand(new String[]{MARK, taskNum});
            } else if (type.equals(UNMARK)) {
                String taskNum = parts[1];
                return new MarksCommand(new String[]{UNMARK, taskNum});
            } else if (type.equals(LIST)) {
                return new ListCommand();
            } else if (type.equals(DELETE)) {
                String taskNum = parts[1];
                return new DeleteCommand(new String[]{taskNum});
            } else if (type.equals(TODO)) {
                return new AddCommand(new String[]{TODO, parts[1]});
            } else if (type.equals(DEADLINE)) {
                String description = parts[1].split(" /by ")[0];
                String by = parts[1].split(" /by ")[1];
                return new AddCommand(new String[]{DEADLINE, description, by});
            } else if (type.equals(EVENT)) {
                String description = parts[1].split(" /from ")[0];
                String from = parts[1].split(" /from ")[1].split(" /to ")[0];
                String to = parts[1].split(" /to ")[1];
                return new AddCommand(new String[]{EVENT, description, from, to});
            } else {
                throw new DukeException("Warning ??? : Wrong action");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new DukeException("Warning ??? : Missing command input.");
        }
    }

}
