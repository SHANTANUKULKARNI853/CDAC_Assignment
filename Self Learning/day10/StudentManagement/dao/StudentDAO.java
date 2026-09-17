package day10.StudentManagement.dao;



import java.util.ArrayList;

import day10.StudentManagement.model.*;

public class StudentDAO {

    ArrayList<Student> studentList =
            new ArrayList<Student>();

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public Student searchStudent(int rollNo) {

        for (Student student : studentList) {

            if (student.getRollNo() == rollNo) {
                return student;
            }
        }

        return null;
    }

    public void deleteStudent(Student student) {
        studentList.remove(student);
    }

    public ArrayList<Student> getAllStudents() {
        return studentList;
    }
}
