package day7.StudentResultSystem.test;


/*
Student Examination and Result System

Develop a Java application that accepts student marks for multiple
subjects and calculates the total, average, and grade.

The program should handle:
Invalid marks such as values below 0 or above 100.
Non-numeric input entered by the user.
Division-by-zero errors when calculating the average.
Missing or invalid student information.

Implement appropriate built-in and user-defined exceptions and demonstrate
the use of try, catch, finally, throw, and throws.
*/

import java.util.Scanner;

import day7.StudentResultSystem.exception.*;
//import exception.InvalidStudentException;
import day7.StudentResultSystem.model.*;
import day7.StudentResultSystem.service.*;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ResultService service = new ResultService();

        try {

            System.out.println("Enter Roll Number:");
            int rollNo = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Student Name:");
            String name = sc.nextLine();

            System.out.println("Enter number of subjects:");
            int n = sc.nextInt();

            int[] marks = new int[n];

            for (int i = 0; i < n; i++) {

                System.out.println(
                        "Enter marks for subject " + (i + 1) + ":");

                marks[i] = sc.nextInt();
            }

            Student student = new Student(
                    rollNo,
                    name,
                    marks);

            service.validateStudent(student);

            service.validateMarks(marks);

            int total = service.calculateTotal(student);

            double average = service.calculateAverage(student);

            String grade = service.calculateGrade(average);

            System.out.println("\n----- RESULT -----");
            System.out.println("Roll Number: " + student.getRollNo());
            System.out.println("Name: " + student.getName());
            System.out.println("Total: " + total);
            System.out.println("Average: " + average);
            System.out.println("Grade: " + grade);

        } catch (InvalidMarksException e) {

            System.out.println("Error: " + e.getMessage());

        } catch (InvalidStudentException e) {

            System.out.println("Error: " + e.getMessage());

        } catch (ArithmeticException e) {

            System.out.println("Error: " + e.getMessage());

        } catch (Exception e) {

            System.out.println(
                    "Invalid input. Please enter numeric values.");

        } finally {

            System.out.println("Result processing completed.");
            sc.close();
        }
    }
}
