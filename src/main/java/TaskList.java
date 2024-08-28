import java.util.ArrayList;

public class TaskList {
    private ArrayList<Task> taskList;

    public TaskList() {
        this.taskList = new ArrayList<>();
    }

    public ArrayList<Task> getTaskList() {
        return this.taskList;
    }

    public Task get(int idx) throws IndexOutOfBoundsException {
        return this.taskList.get(idx);
    }

    public Task removeTask(int idx) throws IndexOutOfBoundsException {
        return this.taskList.remove(idx);
    }

    public void addTask(Task t) {
        this.taskList.add(t);
    }

    public int size() {
        return this.taskList.size();
    }
}