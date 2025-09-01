package command;

import storage.Storage;
import tasks.TaskList;
import util.Ui;

/**
 * Bye command.
 */
public class ExitCommand extends Command {

    /**
     * Exit() method to terminate the program.
     */
    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        System.out.println("Bye Hunter ???. Hope to see you again soon.");
        ui.printLine();
        System.exit(0);
    }
}
