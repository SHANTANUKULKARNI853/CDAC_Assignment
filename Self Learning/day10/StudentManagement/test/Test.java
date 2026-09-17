package day10.StudentManagement.test;



/*
Store student details in an ArrayList.

i. Implement Student Management System:
ii. Add Student
iii. Search Student by Roll Number
iv. Update Student Details
v. Delete Student
vi. Display All Students
*/

import java.util.Scanner;

import day10.StudentManagement.model.*;
import day10.StudentManagement.service.*;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentService service =
                new StudentService();

        while (true) {

            System.out.println("\n1. Add Student");
            System.out.println("2. Search Student");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Display All Students");
            System.out.println("6. Exit");

            System.out.println("Enter choice:");
            int choice = sc.nextInt();

            switch (choice) {

            case 1:

                System.out.println(
                        "Enter Roll Number:");
                int rollNo = sc.nextInt();
                sc.nextLine();

                System.out.println(
                        "Enter Name:");
                String name = sc.nextLine();

                System.out.println(
                        "Enter Course:");
                String course = sc.nextLine();

                System.out.println(
                        "Enter Marks:");
                double marks = sc.nextDouble();

                Student student =
                        new Student(
                                rollNo,
                                name,
                                course,
                                marks);

                service.addStudent(student);

                break;

            case 2:

                System.out.println(
                        "Enter Roll Number:");
                rollNo = sc.nextInt();

                service.searchStudent(rollNo);

                break;

            case 3:

                System.out.println(
                        "Enter Roll Number:");
                rollNo = sc.nextInt();
                sc.nextLine();

                System.out.println(
                        "Enter New Name:");
                name = sc.nextLine();

                System.out.println(
                        "Enter New Course:");
                course = sc.nextLine();

                System.out.println(
                        "Enter New Marks:");
                marks = sc.nextDouble();

                service.updateStudent(
                        rollNo,
                        name,
                        course,
                        marks);

                break;

            case 4:

                System.out.println(
                        "Enter Roll Number:");
                rollNo = sc.nextInt();

                service.deleteStudent(rollNo);

                break;

            case 5:

                service.displayAllStudents();

                break;

            case 6:

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
