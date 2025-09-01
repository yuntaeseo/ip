package tasks;

import java.util.ArrayList;

/**
 * TaskList class to manage a list of tasks.
 */
public class TaskList {

    private ArrayList<Task> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    public TaskList(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }
    public Task getTasks(int taskNum) {
        return tasks.get(taskNum);
    }

    /**
     * Get size
     */
    public int getSize() {
        return tasks.size();
    }

    /**
     * Mark
     *
     * @param taskNum
     */
    public void markTask(int taskNum) {
        tasks.get(taskNum).mark();
    }

    /**
     * Unmark
     *
     * @param taskNum
     */
    public void unmarkTask(int taskNum) {
        tasks.get(taskNum).unmark();
    }
    /**
     * Delete task
     */
    public Task deleteTask(int taskNum) {
        return tasks.remove(taskNum);
    }
    /**
     * Add task
     */
    public void addTask(Task task) {
        tasks.add(task);
    }

}
