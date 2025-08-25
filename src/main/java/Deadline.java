public class Deadline extends Task {
    protected String by;

    public Deadline(String description, String by) throws DukeException {
        super(description);
        this.by = by;
        if (description.isBlank()) {
            throw new DukeException("Warning ??? : the description of a deadline cannot be empty.");
        }
        if (by.isBlank()) {
            throw new DukeException("Warning ??? : the deadline of a deadline cannot be empty.");
        }
    }

    @Override
    public String getDescription() {
        return description + " (by: " + by + ")";
    }
    @Override
    public String toString() {
        return " [D]" + super.toString();
    }
}
