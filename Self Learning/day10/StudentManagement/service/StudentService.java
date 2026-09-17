package day10.StudentManagement.service;


import java.util.ArrayList;

import day10.StudentManagement.dao.*;
import day10.StudentManagement.model.*;

public class StudentService {

    StudentDAO dao = new StudentDAO();

    public void addStudent(Student student) {

        dao.addStudent(student);

        System.out.println(
                "Student added successfully.");
    }

    public void searchStudent(int rollNo) {

        Student student =
                dao.searchStudent(rollNo);

        if (student != null) {

            student.display();

        } else {

            System.out.println(
                    "Student not found.");
        }
    }

    public void updateStudent(
            int rollNo,
            String name,
            String course,
            double marks) {

        Student student =
                dao.searchStudent(rollNo);

        if (student != null) {

            student.setName(name);
            student.setCourse(course);
            student.setMarks(marks);

            System.out.println(
                    "Student updated successfully.");

        } else {

            System.out.println(
                    "Student not found.");
        }
    }

    public void deleteStudent(int rollNo) {

        Student student =
                dao.searchStudent(rollNo);

        if (student != null) {

            dao.deleteStudent(student);

            System.out.println(
                    "Student deleted successfully.");

        } else {

            System.out.println(
                    "Student not found.");
        }
    }

    public void displayAllStudents() {

        ArrayList<Student> studentList =
                dao.getAllStudents();

        if (studentList.size() == 0) {

            System.out.println(
                    "No students available.");

        } else {

            for (Student student : studentList) {
                student.display();
            }
        }
    }
}
