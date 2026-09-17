package day10.TaskManagement.model;



public class Task {

    private int taskId;
    private String taskName;
    private boolean completed;

    public Task(int taskId, String taskName) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.completed = false;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public void display() {
        System.out.println(
                "Task ID: " + taskId);
        System.out.println(
                "Task Name: " + taskName);
        System.out.println(
                "Status: "
                + (completed ? "Completed" : "Pending"));
        System.out.println("--------------------");
    }
}
