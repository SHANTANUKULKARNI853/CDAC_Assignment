package day10.TaskManagement.test;

/*
Implement a Task Management System

i. Use a LinkedList to maintain tasks.
ii. Add task
iii. Remove task
iv. Mark task as completed
v. Display pending tasks
*/

import java.util.Scanner;

import day10.TaskManagement.model.*;
import day10.TaskManagement.service.*;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TaskService service =
                new TaskService();

        while (true) {

            System.out.println("\n1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Display Pending Tasks");
            System.out.println("5. Exit");

            System.out.println("Enter choice:");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

            case 1:

                System.out.println(
                        "Enter Task ID:");
                int taskId = sc.nextInt();
                sc.nextLine();

                System.out.println(
                        "Enter Task Name:");
                String taskName = sc.nextLine();

                Task task =
                        new Task(taskId, taskName);

                service.addTask(task);

                break;

            case 2:

                System.out.println(
                        "Enter Task ID:");
                taskId = sc.nextInt();

                service.removeTask(taskId);

                break;

            case 3:

                System.out.println(
                        "Enter Task ID:");
                taskId = sc.nextInt();

                service.markCompleted(taskId);

                break;

            case 4:

                service.displayPendingTasks();

                break;

            case 5:

                System.out.println(
                        "Program ended.");

                sc.close();
                return;

            default:

                System.out.println(
                        "Invalid choice.");
            }
        }
    }
}
