package day14.TaskHashSet.service;


import java.util.Set;

import day14.TaskHashSet.dao.*;
import day14.TaskHashSet.model.*;

public class TaskService {

    private TaskDAO dao = new TaskDAO();

    public boolean addTask(Task task) {
        return dao.addTask(task);
    }

    public boolean removeTask(int taskId) {
        return dao.removeTask(taskId);
    }

    public Task searchTask(int taskId) {
        return dao.searchTask(taskId);
    }

    public boolean markTaskCompleted(int taskId) {

        Task task = dao.searchTask(taskId);

        if (task != null) {

            task.setCompleted(true);

            return true;
        }

        return false;
    }

    public Set<Task> getAllTasks() {
        return dao.getAllTasks();
    }

    public void displayPendingTasks() {

        for (Task task : dao.getAllTasks()) {

            if (!task.isCompleted())
                System.out.println(task);
        }
    }
}