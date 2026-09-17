package day12.Q4;

/*
Demonstrate Method References and Constructor References.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Test {

    static class Student {

        int rollNo;
        String name;

        Student(int rollNo, String name) {
            this.rollNo = rollNo;
            this.name = name;
        }

        void display() {
            System.out.println(
                    "Roll No: " + rollNo
                    + ", Name: " + name);
        }

        static void showMessage() {
            System.out.println(
                    "Student Management System");
        }
    }

    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();

        students.add(
                new Student(101, "Rahul"));

        students.add(
                new Student(102, "Priya"));

        students.add(
                new Student(103, "Amit"));

        System.out.println("Method Reference:");

        students.forEach(
                Student::display);

        System.out.println();

        Consumer<String> print =
                System.out::println;

        print.accept("Hello Java");

        System.out.println();

        System.out.println("Static Method Reference:");

        Runnable message =
                Student::showMessage;

        message.run();

        System.out.println();

        System.out.println("Constructor Reference:");

        Function<String, Student> createStudent =
                name -> new Student(104, name);

        Student s1 =
                createStudent.apply("Neha");

        s1.display();

        System.out.println();

        Supplier<Student> create =
                () -> new Student(105, "Karan");

        Student s2 =
                create.get();

        s2.display();
    }
}
