package jinwoo.command;

import jinwoo.exception.DukeException;
import jinwoo.storage.Storage;
import jinwoo.tasks.TaskList;
import jinwoo.util.Ui;

/**
 * Abstract Command class to represent user commands.
 */
public abstract class Command {

    private String[] fullCommand;

    public Command(String[] fullCommand) {
        this.fullCommand = fullCommand;
    }

    protected Command() {
    }

    public String[] getCommand() {
        return fullCommand;
    }

    /**
     * Abstract method ovrridden by subclasses to execute specific commands.
     * @param tasks
     * @param ui
     * @param storage
     * @throws DukeException
     */
    public abstract void execute(TaskList tasks, Ui ui, Storage storage) throws DukeException;
}
