package day14.TaskHashSet.test;
/*
Implement a Task Management System using HashSet.

Use a HashSet to maintain a unique collection of tasks.

Support:
1. Add Task
2. Remove Task
3. Mark Task as Completed
4. Search Task
5. Display Pending Tasks
6. Display All Tasks
7. Prevent duplicate tasks using equals() and hashCode()
*/

import java.util.Scanner;

import day14.TaskHashSet.model.*;
import day14.TaskHashSet.service.*;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TaskService service = new TaskService();

        int choice;

        do {

            System.out.println("\n===== TASK MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Search Task");
            System.out.println("5. Display Pending Tasks");
            System.out.println("6. Display All Tasks");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

            case 1:

                System.out.print("Enter Task ID: ");
                int taskId = sc.nextInt();

                sc.nextLine();

                System.out.print("Enter Task Name: ");
                String taskName = sc.nextLine();

                Task task = new Task(taskId, taskName);

                if (service.addTask(task))
                    System.out.println("Task added successfully.");
                else
                    System.out.println("Duplicate task. Task not added.");

                break;


            case 2:

                System.out.print("Enter Task ID: ");
                int removeId = sc.nextInt();

                if (service.removeTask(removeId))
                    System.out.println("Task removed successfully.");
                else
                    System.out.println("Task not found.");

                break;


            case 3:

                System.out.print("Enter Task ID: ");
                int completeId = sc.nextInt();

                if (service.markTaskCompleted(completeId))
                    System.out.println("Task marked as completed.");
                else
                    System.out.println("Task not found.");

                break;


            case 4:

                System.out.print("Enter Task ID: ");
                int searchId = sc.nextInt();

                Task foundTask = service.searchTask(searchId);

                if (foundTask != null)
                    System.out.println(foundTask);
                else
                    System.out.println("Task not found.");

                break;


            case 5:

                System.out.println("\nPending Tasks:");

                service.displayPendingTasks();

                break;


            case 6:

                System.out.println("\nAll Tasks:");

                for (Task t : service.getAllTasks())
                    System.out.println(t);

                break;


            case 7:

                System.out.println("Exiting...");
                break;


            default:

                System.out.println("Invalid choice.");
            }

        } while (choice != 7);

        sc.close();
    }
}