public class Todo extends Task {

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
