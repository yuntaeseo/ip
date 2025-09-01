package command;

import exception.DukeException;
import storage.Storage;
import tasks.Deadline;
import tasks.Event;
import tasks.Task;
import tasks.TaskList;
import tasks.Todo;
import util.Ui;

/**
 * Add command for all task types.
 */
public class AddCommand extends Command {

    public AddCommand(String[] fullCommand) {
        super(fullCommand);
    }

    /**
     * Executes the add command based on the task type.
     */
    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) throws DukeException {
        String description;
        Task task;
        String by;
        String from;
        String to;
        switch (getCommand()[0]) {
        case "todo":
            description = getCommand()[1];
            task = new Todo(description);
            tasks.addTask(task);
            ui.printAdd(task, tasks.getSize());
            storage.saveTasks(tasks.getTasks());
            break;
        case "deadline":
            description = getCommand()[1];
            by = getCommand()[2];
            task = new Deadline(description, by);
            tasks.addTask(task);
            ui.printAdd(task, tasks.getSize());
            storage.saveTasks(tasks.getTasks());
            break;
        case "event":
            description = getCommand()[1];
            from = getCommand()[2];
            to = getCommand()[3];
            task = new Event(description, from, to);
            tasks.addTask(task);
            ui.printAdd(task, tasks.getSize());
            storage.saveTasks(tasks.getTasks());
            break;
        default:
            throw new DukeException("Warning ??? : Invalid add type.");
        }
    }
}
