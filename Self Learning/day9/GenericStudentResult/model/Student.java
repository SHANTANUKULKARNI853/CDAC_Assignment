package day9.GenericStudentResult.model;


import java.util.ArrayList;
import java.util.List;

public class Student<T> {

    private int studentId;
    private String studentName;
    private List<T> marks;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.marks = new ArrayList<T>();
    }

    public void addMarks(T mark) {
        marks.add(mark);
    }

    public List<T> getMarks() {
        return marks;
    }

    public void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Marks: " + marks);
    }
}
