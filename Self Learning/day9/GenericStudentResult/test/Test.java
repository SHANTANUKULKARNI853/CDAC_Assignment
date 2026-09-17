package day9.GenericStudentResult.test;

/*
Problem Statement: Generic Student Result Management System

Develop a Java application for managing student academic results using Generics.
The application should demonstrate the use of generic classes, generic methods,
and bounded wildcards (upper and lower bounds).

Create a Student<T> generic class where T represents the type of marks obtained
by a student.

The class should contain:
Student ID
Student name
A collection of marks of type T
Methods to add marks and display student details.

Tasks:
1. Generic Class
2. Generic Methods
3. Upper-Bounded Wildcard
4. Lower-Bounded Wildcard
*/

import java.util.ArrayList;
import java.util.List;

import day9.GenericStudentResult.model.Student;

public class Test {

    public static void main(String[] args) {

        Student<Integer> s1 =
                new Student<Integer>(101, "Rahul");

        s1.addMarks(78);
        s1.addMarks(85);
        s1.addMarks(91);

        Student<Double> s2 =
                new Student<Double>(102, "Priya");

        s2.addMarks(82.5);
        s2.addMarks(88.0);
        s2.addMarks(91.5);

        s1.displayDetails();

        System.out.println();

        s2.displayDetails();

        System.out.println();

        System.out.println(
                "Integer Marks Total: "
                + (int) calculateTotal(s1.getMarks()));

        System.out.println(
                "Double Marks Total: "
                + calculateTotal(s2.getMarks()));

        System.out.println(
                "Maximum Integer Mark: "
                + findMaximum(s1.getMarks()));

        displayMarks(s1.getMarks());

        displayMarks(s2.getMarks());

        List<Integer> integerMarks =
                new ArrayList<Integer>();

        addDefaultMarks(integerMarks);

        List<Number> numberMarks =
                new ArrayList<Number>();

        addDefaultMarks(numberMarks);

        List<Object> objectMarks =
                new ArrayList<Object>();

        addDefaultMarks(objectMarks);

        System.out.println(
                "Default marks added successfully.");
    }

    public static <T> void displayMarks(List<T> marks) {

        System.out.println("Marks: " + marks);
    }

    public static <T extends Comparable<T>>
            T findMaximum(List<T> marks) {

        T max = marks.get(0);

        for (T mark : marks) {

            if (mark.compareTo(max) > 0) {
                max = mark;
            }
        }

        return max;
    }

    public static double calculateTotal(
            List<? extends Number> marks) {

        double total = 0;

        for (Number mark : marks) {

            total = total + mark.doubleValue();
        }

        return total;
    }

    public static void addDefaultMarks(
            List<? super Integer> marks) {

        marks.add(50);
        marks.add(60);
        marks.add(70);
    }
}