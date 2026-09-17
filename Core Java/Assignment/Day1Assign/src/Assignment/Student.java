package Assignment;

public class Student {
	int studentId;
    String studentName;
    int marks1;
    int marks2;
    int marks3;

    void printData() {
        int total = marks1 + marks2 + marks3;
        double average = total / 3.0;

        System.out.println("Student ID = " + studentId);
        System.out.println("Student Name = " + studentName);
        System.out.println("Marks 1 = " + marks1);
        System.out.println("Marks 2 = " + marks2);
        System.out.println("Marks 3 = " + marks3);
        System.out.println("Average Marks = " + average);
    }

    public static void main(String[] args) {
        Student s = new Student();

        s.studentId = Integer.parseInt(args[0]);
        s.studentName = args[1];
        s.marks1 = Integer.parseInt(args[2]);
        s.marks2 = Integer.parseInt(args[3]);
        s.marks3 = Integer.parseInt(args[4]);

        s.printData();
    }
}
