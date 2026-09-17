package day11.StudentMeritList.test;



/*
In Student Merit List System, Generate the following reports:

i. Sort by Roll Number (Ascending)
ii. Sort by Name (Ascending)
iii. Generate a Merit List by Marks (Descending).
iv. Sort by Department (Ascending) and then Name (Ascending)
v. Sort by Department (Ascending) and then Marks (Descending)
vi. Sort by Marks (Descending) and then Roll Number (Ascending)
vii. Sort by Department (Ascending), Marks (Descending), and then Name
(Ascending)
*/

import java.util.Scanner;

import day11.StudentMeritList.model.*;
import day11.StudentMeritList.service.*;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentService service =
                new StudentService();

        service.addStudent(
                new Student(103, "Rahul",
                        "Computer", 85));

        service.addStudent(
                new Student(101, "Amit",
                        "IT", 92));

        service.addStudent(
                new Student(105, "Priya",
                        "Computer", 92));

        service.addStudent(
                new Student(102, "Neha",
                        "IT", 78));

        service.addStudent(
                new Student(104, "Karan",
                        "Computer", 85));

        while (true) {

            System.out.println("\n1. Sort by Roll Number");
            System.out.println("2. Sort by Name");
            System.out.println("3. Merit List by Marks");
            System.out.println("4. Department and Name");
            System.out.println("5. Department and Marks");
            System.out.println("6. Marks and Roll Number");
            System.out.println(
                    "7. Department, Marks and Name");
            System.out.println("8. Exit");

            System.out.println("Enter choice:");
            int choice = sc.nextInt();

            switch (choice) {

            case 1:
                service.sortByRollNo();
                break;

            case 2:
                service.sortByName();
                break;

            case 3:
                service.meritList();
                break;

            case 4:
                service.sortByDepartmentAndName();
                break;

            case 5:
                service.sortByDepartmentAndMarks();
                break;

            case 6:
                service.sortByMarksAndRollNo();
                break;

            case 7:
                service.sortByDepartmentMarksName();
                break;

            case 8:
                System.out.println("Program ended.");
                sc.close();
                return;

            default:
                System.out.println("Invalid choice.");
            }
        }
    }
}
