package day11.StudentMeritList.service;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import day11.StudentMeritList.dao.*;
import day11.StudentMeritList.model.*;

public class StudentService {

    StudentDAO dao = new StudentDAO();

    public void addStudent(Student student) {
        dao.addStudent(student);
    }

    public void displayStudents(
            ArrayList<Student> studentList) {

        for (Student student : studentList) {
            student.display();
        }
    }

    public void sortByRollNo() {

        ArrayList<Student> list =
                new ArrayList<Student>(dao.getStudents());

        Collections.sort(list,
                Comparator.comparingInt(
                        Student::getRollNo));

        displayStudents(list);
    }

    public void sortByName() {

        ArrayList<Student> list =
                new ArrayList<Student>(dao.getStudents());

        Collections.sort(list,
                Comparator.comparing(
                        Student::getName));

        displayStudents(list);
    }

    public void meritList() {

        ArrayList<Student> list =
                new ArrayList<Student>(dao.getStudents());

        Collections.sort(list,
                Comparator.comparingDouble(
                        Student::getMarks).reversed());

        displayStudents(list);
    }

    public void sortByDepartmentAndName() {

        ArrayList<Student> list =
                new ArrayList<Student>(dao.getStudents());

        Collections.sort(list,
                Comparator.comparing(
                        Student::getDepartment)
                .thenComparing(
                        Student::getName));

        displayStudents(list);
    }

    public void sortByDepartmentAndMarks() {

        ArrayList<Student> list =
                new ArrayList<Student>(dao.getStudents());

        Collections.sort(list,
                Comparator.comparing(
                        Student::getDepartment)
                .thenComparing(
                        Comparator.comparingDouble(
                                Student::getMarks)
                        .reversed()));

        displayStudents(list);
    }

    public void sortByMarksAndRollNo() {

        ArrayList<Student> list =
                new ArrayList<Student>(dao.getStudents());

        Collections.sort(list,
                Comparator.comparingDouble(
                        Student::getMarks)
                .reversed()
                .thenComparingInt(
                        Student::getRollNo));

        displayStudents(list);
    }

    public void sortByDepartmentMarksName() {

        ArrayList<Student> list =
                new ArrayList<Student>(dao.getStudents());

        Collections.sort(list,
                Comparator.comparing(
                        Student::getDepartment)
                .thenComparing(
                        Comparator.comparingDouble(
                                Student::getMarks)
                        .reversed())
                .thenComparing(
                        Student::getName));

        displayStudents(list);
    }
}
