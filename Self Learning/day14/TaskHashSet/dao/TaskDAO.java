package day14.TaskHashSet.dao;


import java.util.HashSet;
import java.util.Set;

import day14.TaskHashSet.model.*;

public class TaskDAO {

    private Set<Task> tasks = new HashSet<>();

    public boolean addTask(Task task) {
        return tasks.add(task);
    }

    public boolean removeTask(int taskId) {

        Task task = searchTask(taskId);

        if (task != null) {
            tasks.remove(task);
            return true;
        }

        return false;
    }

    public Task searchTask(int taskId) {

        for (Task task : tasks) {

            if (task.getTaskId() == taskId)
                return task;
        }

        return null;
    }

    public Set<Task> getAllTasks() {
        return tasks;
    }
}
