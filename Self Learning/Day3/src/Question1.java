package Day3.src;//1. Design a simple application (ex. Student Management System) using:
//i. Classes and constructors
//ii. Object references
//iii. Association between classes
//iv. Display students details

public class Question1 {

    public static void main(String[] args) {

        Course c1 = new Course("Java Full Stack", 6);
        Course c2 = new Course("C++", 4);

        Student s1 = new Student(101, "Abuzar", c1);
        Student s2 = new Student(102, "Rahul", c2);

        System.out.println("Student 1");
        s1.displayStudent();

        System.out.println();

        System.out.println("Student 2");
        s2.displayStudent();
    }
}
