package Day6.src;//3.  Method-Local Inner Class – Student Grade 
//Create a class Student containing student name, roll number, and marks. 

//Define a method calculateGrade() inside the Student class. Within this method, create 
//a method-local inner class named Grade that determines the student's grade based 
//on the marks: 
// 90–100 → A 
// 75–89 → B 
// 60–74 → C 
// 40–59 → D 
// Below 40 → F 
//Display the student's details and grade.

public class Question3 {

	public static void main(String[] args) {
		Student s1 = new Student("abuzar", 01, 90);
		s1.calculateGrade();
		s1.diplay();

	}

}
