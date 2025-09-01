import java.util.ArrayList;

import command.Command;
import exception.DukeException;
import storage.Storage;
import tasks.Task;
import tasks.TaskList;
import util.Parser;
import util.Ui;

/**
 * A chatbot to manage user tasks.
 * Named after Sung Jinwoo, the Shadow Monarch from Solo Leveling.
 *
 * @author yuntae seo
 */
public class Jinwoo {

    private static Ui ui;
    private static ArrayList<Task> todoList = new ArrayList<>();
    private Storage storage;
    private TaskList tasks;

    /**
     * Constructor for Jinwoo chatbot.
     * Initializes the UI, Storage, and TaskList components.
     * Loads tasks initially
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
