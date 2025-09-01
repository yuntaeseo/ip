package jinwoo;

import jinwoo.command.Command;
import jinwoo.exception.DukeException;
import jinwoo.storage.Storage;
import jinwoo.tasks.TaskList;
import jinwoo.util.Parser;
import jinwoo.util.Ui;

/**
 * A chatbot to manage user tasks.
 * Named after Sung Jinwoo, the Shadow Monarch from Solo Leveling.
 *
 * @author yuntae seo
 */
public class Jinwoo {

    private final Ui ui;
    private final Storage storage;
    private final TaskList tasks;

    /**
     * Constructor for Jinwoo chatbot.
     * Initializes the UI, Storage, and TaskList components.
     * Loads Tasks initially
     */
    public Jinwoo(String filePath) {
        ui = new Ui();
        storage = new Storage(filePath);
        tasks = new TaskList(storage.loadTasks());
    }

    public static void main(String[] args) {
        new Jinwoo("./data/save.txt").run();
    }

    /**
     * Runs the Jinwoo chatbot.
     */
    public void run() {
        ui.hello();
        //noinspection InfiniteLoopStatement
        while (true) {
            try {
                String fullCommand = ui.readCommand();
                ui.printLine();
                Command c = Parser.parseCommand(fullCommand);
                c.execute(tasks, ui, storage);
            } catch (DukeException e) {
                ui.showError(e.getMessage());
            } finally {
                ui.printLine();
            }
        }
    }
}
