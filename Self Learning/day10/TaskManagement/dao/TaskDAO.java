package day10.TaskManagement.dao;



import java.util.LinkedList;

import day10.TaskManagement.model.*;

public class TaskDAO {

    LinkedList<Task> taskList =
            new LinkedList<Task>();

    public void addTask(Task task) {
        taskList.add(task);
    }

    public Task searchTask(int taskId) {

        for (Task task : taskList) {

            if (task.getTaskId() == taskId) {
                return task;
            }
        }

        return null;
    }

    public void removeTask(Task task) {
        taskList.remove(task);
    }

    public LinkedList<Task> getAllTasks() {
        return taskList;
    }
}