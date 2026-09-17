package day7.StudentResultSystem.service;


import day7.StudentResultSystem.exception.*;
//import exception.InvalidStudentException;
import day7.StudentResultSystem.model.*;

public class ResultService {

    public void validateStudent(Student student)
            throws InvalidStudentException {

        if (student == null) {
            throw new InvalidStudentException(
                    "Student information is missing.");
        }

        if (student.getRollNo() <= 0) {
            throw new InvalidStudentException(
                    "Invalid roll number.");
        }

        if (student.getName() == null
                || student.getName().trim().isEmpty()) {
            throw new InvalidStudentException(
                    "Student name is missing.");
        }

        if (student.getMarks() == null
                || student.getMarks().length == 0) {
            throw new InvalidStudentException(
                    "Marks are missing.");
        }
    }

    public void validateMarks(int[] marks)
            throws InvalidMarksException {

        for (int mark : marks) {

            if (mark < 0 || mark > 100) {
                throw new InvalidMarksException(
                        "Invalid marks. Marks must be between 0 and 100.");
            }
        }
    }

    public int calculateTotal(Student student) {

        int total = 0;

        for (int mark : student.getMarks()) {
            total = total + mark;
        }

        return total;
    }

    public double calculateAverage(Student student) {

        if (student.getMarks().length == 0) {
            throw new ArithmeticException(
                    "Cannot calculate average. No subjects found.");
        }

        int total = calculateTotal(student);

        return (double) total / student.getMarks().length;
    }

    public String calculateGrade(double average) {

        if (average >= 90) {
            return "A";
        } else if (average >= 75) {
            return "B";
        } else if (average >= 60) {
            return "C";
        } else if (average >= 40) {
            return "D";
        } else {
            return "F";
        }
    }
}