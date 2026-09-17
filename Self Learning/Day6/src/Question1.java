package Day6.src;//1.  Enumeration – Employee Department 
//Create an enum named Department with the values HR, IT, FINANCE, SALES, and MARKETING. 
//Create an Employee class containing employee ID, name, and department. Write a Java program to: 
// Create employee objects. 
// Display their details. 
// Use the enum to display the department. 
// Use switch to display a suitable message for each department.

public class Question1 {
	
	public enum Department{HR, IT, FINANCE, SALES, MARKETING}

	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "jon", Department.MARKETING);
		emp1.display();
		
		Employee emp2 = new Employee(2, "unmesh", Department.IT);
		emp2.display();
		
		Employee emp3 = new Employee(3, "bob", Department.FINANCE);
		emp3.display();

	}

}
