package tasks;

import exception.DukeException;

/**
 * Represents an event task with a description, start time, and end time.
 */
public class Event extends Task {
    protected String from;
    protected String to;
    /**
     * Constructs an Tasks.Event task with the given description, start time, and end time.
     *
     * @throws DukeException if the description, start time, or end time is empty.
     */
    public Event(String description, String from, String to) throws DukeException {
        super(description);
        this.from = from;
        this.to = to;
        if (description.isBlank()) {
            throw new DukeException("Warning ??? : the description of an event cannot be empty.");
        }
        if (from.isBlank() || to.isBlank()) {
            throw new DukeException("Warning ??? : the time of an event cannot be empty.");
        }
    }

    @Override
    public String getDescription() {
        return description + " (from: " + from + " to: " + to + ")";
    }
    @Override
    public String toString() {
        return " [E]" + super.toString();
    }
}
