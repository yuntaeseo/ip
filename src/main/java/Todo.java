/**
 * A Todo task is a simple task without any date or time constraints.
 */
public class Todo extends Task {
    /**
     * Constructs a Todo task with the given description.
     *
     * @throws DukeException if the description is empty.
     */
    public Todo(String description) throws DukeException {
        super(description);
        if (description.isBlank()) {
            throw new DukeException("Warning ??? : the description of a todo cannot be empty.");
        }
    }
    @Override
    public String toString() {
        return " [T]" + super.toString();
    }
}
