package day12.Q3;

/*
Implement sorting and searching using Lambda Expressions.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test {

    static class Student {

        int rollNo;
        String name;
        double marks;

        Student(int rollNo, String name, double marks) {
            this.rollNo = rollNo;
            this.name = name;
            this.marks = marks;
        }

        void display() {
            System.out.println(
                    rollNo + " " + name + " " + marks);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Student> list =
                new ArrayList<Student>();

        list.add(new Student(103, "Rahul", 85));
        list.add(new Student(101, "Amit", 92));
        list.add(new Student(105, "Priya", 78));
        list.add(new Student(102, "Neha", 95));

        System.out.println("Original List:");

        for (Student s : list) {
            s.display();
        }

        Collections.sort(list,
                (s1, s2) -> s1.rollNo - s2.rollNo);

        System.out.println("\nSorted by Roll Number:");

        for (Student s : list) {
            s.display();
        }

        Collections.sort(list,
                (s1, s2) -> s1.name.compareTo(s2.name));

        System.out.println("\nSorted by Name:");

        for (Student s : list) {
            s.display();
        }

        Collections.sort(list,
                (s1, s2) -> Double.compare(
                        s2.marks, s1.marks));

        System.out.println("\nSorted by Marks Descending:");

        for (Student s : list) {
            s.display();
        }

        System.out.println("\nEnter Roll Number to search:");

        int rollNo = sc.nextInt();

        boolean found = false;

        for (Student s : list) {

            if (s.rollNo == rollNo) {

                System.out.println("Student Found:");
                s.display();

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }

        sc.close();
    }
}
