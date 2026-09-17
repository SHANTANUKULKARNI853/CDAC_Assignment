package day14.StudentHashSet.service;


import java.util.Set;

import day14.StudentHashSet.dao.*;
import day14.StudentHashSet.model.*;

public class StudentService {

    private StudentDAO dao = new StudentDAO();

    public boolean addStudent(Student student) {
        return dao.addStudent(student);
    }

    public Student searchStudent(int rollNo) {
        return dao.searchStudent(rollNo);
    }

    public boolean updateStudent(int rollNo, String name, String department) {

        Student student = dao.searchStudent(rollNo);

        if (student != null) {

            student.setName(name);
            student.setDepartment(department);

            return true;
        }

        return false;
    }

    public boolean deleteStudent(int rollNo) {
        return dao.deleteStudent(rollNo);
    }

    public Set<Student> getAllStudents() {
        return dao.getAllStudents();
    }

    public boolean studentExists(int rollNo) {

        Student student = new Student(rollNo, "", "");

        return dao.containsStudent(student);
    }
}
