package jinwoo.command;

import jinwoo.storage.Storage;
import jinwoo.tasks.TaskList;
import jinwoo.util.Ui;

/**
 * List command to list all tasks.
 */
public class ListCommand extends Command {

    /**
     * Lists all tasks in the task list.
     */
    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        System.out.println("Here are the tasks in your list:");
        ui.printList(tasks);
    }
}
