package day11.StudentMeritList.dao;


import java.util.ArrayList;
import day11.StudentMeritList.model.*;

public class StudentDAO {

    ArrayList<Student> studentList =
            new ArrayList<Student>();

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public ArrayList<Student> getStudents() {
        return studentList;
    }
}