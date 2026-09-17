package day10.TaskManagement.service;


import java.util.LinkedList;

import day10.TaskManagement.dao.*;
import day10.TaskManagement.model.*;

public class TaskService {

    TaskDAO dao = new TaskDAO();

    public void addTask(Task task) {

        dao.addTask(task);

        System.out.println(
                "Task added successfully.");
    }

    public void removeTask(int taskId) {

        Task task = dao.searchTask(taskId);

        if (task != null) {

            dao.removeTask(task);

            System.out.println(
                    "Task removed successfully.");

        } else {

            System.out.println(
                    "Task not found.");
        }
    }

    public void markCompleted(int taskId) {

        Task task = dao.searchTask(taskId);

        if (task != null) {

            task.setCompleted(true);

            System.out.println(
                    "Task marked as completed.");

        } else {

            System.out.println(
                    "Task not found.");
        }
    }

    public void displayPendingTasks() {

        LinkedList<Task> taskList =
                dao.getAllTasks();

        boolean found = false;

        for (Task task : taskList) {

            if (!task.isCompleted()) {

                task.display();
                found = true;
            }
        }

        if (!found) {

            System.out.println(
                    "No pending tasks.");
        }
    }
}
