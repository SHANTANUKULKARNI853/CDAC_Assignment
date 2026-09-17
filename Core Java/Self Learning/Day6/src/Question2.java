package Day6.src;//2.  Regular Inner Class – Bank Account 
//Create a class BankAccount containing account number, account holder name, and balance. 
//Create a regular inner class named AccountDetails that displays the account 

//information by accessing the private members of BankAccount. 
//Write a program to demonstrate: 
// Creation of the outer class object. 
//Object Oriented Programming with Java_SELF_LEARNING_ASSIGNMENT 
// 
// Creation of the inner class object. 
// Accessing outer-class private data through the inner class. 


public class Question2 {
	
	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount(565454, "Abuzar", 50000);
		BankAccount.AccountDetails accDetail = acc1.new  AccountDetails();
		accDetail.display();
				
	}

}
