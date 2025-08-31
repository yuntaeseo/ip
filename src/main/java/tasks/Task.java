package tasks;

/**
 * Represents a basic task with a description and completion status.
 */
public class Task {
    protected String description;
    protected boolean isDone;
    /**
     * Constructs a Tasks.Task with the given description and marks it as not done.
     */
    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getStatusIcon() {
        return (isDone ? "X" : " "); // mark done task with X
    }
    public int getIsDone() { return (isDone ? 1 : 0);}
    public String getDescription() {
        return description;
    }
    public String getJustDescription() {
        return description;
    }
    public void mark() {
        isDone = true;
    }
    public void unmark() {
        isDone = false;
    }
    public String toString() {
        return "[" + getStatusIcon() + "] " + getDescription();
    }
    //...
}
