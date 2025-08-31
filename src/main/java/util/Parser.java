package util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;

/**
 * A utility class for Parsing.
 */
public class Parser {

    /**
     * Parses a string into a LocalDate object.
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
}
