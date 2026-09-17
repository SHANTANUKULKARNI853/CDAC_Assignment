package day14.TaskHashSet.model;


import java.util.Objects;

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

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (!(obj instanceof Task))
            return false;

        Task t = (Task) obj;

        return taskId == t.taskId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId);
    }

    @Override
    public String toString() {

        return "Task ID: " + taskId +
                ", Task: " + taskName +
                ", Status: " +
                (completed ? "Completed" : "Pending");
    }
}
