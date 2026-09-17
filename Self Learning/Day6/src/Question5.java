package Day6.src;//5. Static Nested Class – Company and Employee
//Create a class Company containing company name and location.
//Create a static nested class named Employee containing employee ID and
//employee name.
//Write a Java program to:
// Create an object of the static nested Employee class without creating an object
//of Company.

// Display employee details along with company information.
// Demonstrate the difference between accessing static and non-static members
//of the outer class.

public class Question5 {
	
	public static void main(String[] args) {
		Company.Employee eml1;
		eml1 = new Company.Employee(01, "abuzar");
		eml1.dispalyData();

	}

}
