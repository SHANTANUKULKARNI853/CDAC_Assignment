package day14.StudentHashSet.test;



/*
Student Management System using HashSet

Store student details in a HashSet.
Implement:
1. Add Student
2. Search Student
3. Update Student Details
4. Delete Student
5. Display All Students
6. Check whether a student exists
7. Prevent duplicate students using equals() and hashCode()
*/

import java.util.Scanner;

import day14.StudentHashSet.model.*;
import day14.StudentHashSet.service.*;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentService service = new StudentService();

        int choice;

        do {

            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Display All Students");
            System.out.println("6. Check Student Exists");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

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
                        new Student(rollNo, name, department);

                if (service.addStudent(student))
                    System.out.println("Student added successfully.");
                else
                    System.out.println("Duplicate student. Student not added.");

                break;


            case 2:

                System.out.print("Enter Roll No: ");
                int searchRollNo = sc.nextInt();

                Student foundStudent =
                        service.searchStudent(searchRollNo);

                if (foundStudent != null)
                    System.out.println(foundStudent);
                else
                    System.out.println("Student not found.");

                break;


            case 3:

                System.out.print("Enter Roll No: ");
                int updateRollNo = sc.nextInt();

                sc.nextLine();

                System.out.print("Enter New Name: ");
                String newName = sc.nextLine();

                System.out.print("Enter New Department: ");
                String newDepartment = sc.nextLine();

                if (service.updateStudent(
                        updateRollNo,
                        newName,
                        newDepartment))
                    System.out.println("Student updated successfully.");
                else
                    System.out.println("Student not found.");

                break;


            case 4:

                System.out.print("Enter Roll No: ");
                int deleteRollNo = sc.nextInt();

                if (service.deleteStudent(deleteRollNo))
                    System.out.println("Student deleted successfully.");
                else
                    System.out.println("Student not found.");

                break;


            case 5:

                System.out.println("\nAll Students:");

                for (Student s : service.getAllStudents())
                    System.out.println(s);

                break;


            case 6:

                System.out.print("Enter Roll No: ");
                int checkRollNo = sc.nextInt();

                if (service.studentExists(checkRollNo))
                    System.out.println("Student exists.");
                else
                    System.out.println("Student does not exist.");

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
