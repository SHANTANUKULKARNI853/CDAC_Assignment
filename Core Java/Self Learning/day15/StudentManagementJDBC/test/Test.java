package day15.StudentManagementJDBC.test;


/*
Perform Database CRUD operations using JDBC Classes.

C - Create Student
R - Read Students
U - Update Student
D - Delete Student
*/

import java.util.ArrayList;
import java.util.Scanner;

import day15.StudentManagementJDBC.model.*;
import day15.StudentManagementJDBC.service.*;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentService service =
                new StudentService();

        int choice;

        do {

            System.out.println("\n===== STUDENT DATABASE SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            try {

                switch (choice) {

                case 1:

                    System.out.print("Enter Roll No: ");
                    int rollNo = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Department: ");
                    String department = sc.nextLine();

                    Student student =
                            new Student(
                                    rollNo,
                                    name,
                                    department
                            );

                    service.addStudent(student);

                    System.out.println(
                            "Student added successfully.");

                    break;


                case 2:

                    ArrayList<Student> students =
                            service.getAllStudents();

                    System.out.println("\nStudents:");

                    for (Student s : students)
                        System.out.println(s);

                    break;


                case 3:

                    System.out.print(
                            "Enter Roll No to search: ");

                    int searchRollNo = sc.nextInt();

                    Student foundStudent =
                            service.searchStudent(searchRollNo);

                    if (foundStudent != null)
                        System.out.println(foundStudent);
                    else
                        System.out.println(
                                "Student not found.");

                    break;


                case 4:

                    System.out.print(
                            "Enter Roll No to update: ");

                    int updateRollNo = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();

                    System.out.print(
                            "Enter New Department: ");

                    String newDepartment =
                            sc.nextLine();

                    Student updatedStudent =
                            new Student(
                                    updateRollNo,
                                    newName,
                                    newDepartment
                            );

                    service.updateStudent(
                            updatedStudent);

                    System.out.println(
                            "Student updated successfully.");

                    break;


                case 5:

                    System.out.print(
                            "Enter Roll No to delete: ");

                    int deleteRollNo = sc.nextInt();

                    service.deleteStudent(deleteRollNo);

                    System.out.println(
                            "Student deleted successfully.");

                    break;


                case 6:

                    System.out.println("Exiting...");
                    break;


                default:

                    System.out.println(
                            "Invalid choice.");
                }

            } catch (Exception e) {

                System.out.println(
                        "Database Error: " + e.getMessage());
            }

        } while (choice != 6);

        sc.close();
    }
}
