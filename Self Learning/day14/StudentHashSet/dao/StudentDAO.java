package day14.StudentHashSet.dao;


import java.util.HashSet;
import java.util.Set;

import day14.StudentHashSet.model.*;

public class StudentDAO {

    private Set<Student> students = new HashSet<>();

    public boolean addStudent(Student student) {
        return students.add(student);
    }

    public Student searchStudent(int rollNo) {

        for (Student student : students) {

            if (student.getRollNo() == rollNo)
                return student;
        }

        return null;
    }

    public boolean deleteStudent(int rollNo) {

        Student student = searchStudent(rollNo);

        if (student != null) {
            students.remove(student);
            return true;
        }

        return false;
    }

    public Set<Student> getAllStudents() {
        return students;
    }

    public boolean containsStudent(Student student) {
        return students.contains(student);
    }
}
