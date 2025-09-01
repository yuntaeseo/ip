package command;

import exception.DukeException;
import storage.Storage;
import tasks.TaskList;
import util.Ui;

/**
 * Abstract Command class to represent user commands.
 */
public abstract class Command {

    private String[] fullCommand;
    private TaskList tasks;
    private Ui ui;
    private Storage storage;

    public Command(String[] fullCommand) {
        this.fullCommand = fullCommand;
    }

    protected Command() {
    }

    public String[] getCommand() {
        return fullCommand;
    }
    public abstract void execute(TaskList tasks, Ui ui, Storage storage) throws DukeException;
}
