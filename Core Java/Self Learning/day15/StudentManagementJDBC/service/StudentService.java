package day15.StudentManagementJDBC.service;


import java.util.ArrayList;

import day15.StudentManagementJDBC.dao.StudentDAO;
import day15.StudentManagementJDBC.model.Student;

public class StudentService {

    private StudentDAO dao = new StudentDAO();

    public void addStudent(Student student) throws Exception {
        dao.addStudent(student);
    }

    public ArrayList<Student> getAllStudents()
            throws Exception {

        return dao.getAllStudents();
    }

    public Student searchStudent(int rollNo)
            throws Exception {

        return dao.searchStudent(rollNo);
    }

    public void updateStudent(Student student)
            throws Exception {

        dao.updateStudent(student);
    }

    public void deleteStudent(int rollNo)
            throws Exception {

        dao.deleteStudent(rollNo);
    }
}
