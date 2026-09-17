package day13.Q6;

import java.lang.reflect.Method;

public class Test {

    static class Student {

        private void showMessage() {
            System.out.println("Private method called successfully");
        }

        private void displayStudent(String name) {
            System.out.println("Student Name: " + name);
        }
    }

    public static void main(String[] args) {

        try {

            Student student = new Student();

            Method method1 = Student.class.getDeclaredMethod("showMessage");

            method1.setAccessible(true);

            method1.invoke(student);


            Method method2 =
                    Student.class.getDeclaredMethod("displayStudent", String.class);

            method2.setAccessible(true);

            method2.invoke(student, "Rahul");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
