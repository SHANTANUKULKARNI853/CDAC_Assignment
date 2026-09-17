package selflearning;

//1. Design a simple application (ex. Student Management System) using:
//i. Classes and constructors
//ii. Object references
//iii. Association between classes
//iv. Display students details

class Q1Test {

 public static void main(String[] args) {

     Q1Student s1 = new Q1Student(101, "Rahul", 85);

     Q1College c1 = new Q1College("ABC College", s1);

     c1.displayStudentDetails();
 }
}
