package command;

import exception.DukeException;
import storage.Storage;
import tasks.Task;
import tasks.TaskList;
import util.Ui;

/**
 * Delete command
 */
public class DeleteCommand extends Command {

    /**
     * @param fullCommand of single number element
     */
    public DeleteCommand(String[] fullCommand) {
        super(fullCommand);
    }

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) throws DukeException {
        int taskNum = Integer.parseInt(getCommand()[0]) - 1;
        if (taskNum < 0 || taskNum >= tasks.getTasks().size()) {
            throw new DukeException("Warning ???: delete number is invalid.");
        }
        Task deletedTask = tasks.deleteTask(taskNum);
        ui.printDelete(deletedTask, tasks.getSize());
        storage.saveTasks(tasks.getTasks());
    }
}
