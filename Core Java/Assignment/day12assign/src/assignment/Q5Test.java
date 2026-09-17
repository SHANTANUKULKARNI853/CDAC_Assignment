/*Create An Employee class with 
	id , name , sal 
    a) create list of an Employee  which contains 5 Employee Objects 
    b) display all Employee 
    c) accept id of Employee and search the Employee from List 
    d) delete particular employee based on Id */

package assignment;

import java.util.ArrayList;
import java.util.Scanner;

class Q5Test {

    public static void main(String[] args) {

        ArrayList<Q5Employee> employees = new ArrayList<>();

        employees.add(new Q5Employee(101, "Rahul", 50000));
        employees.add(new Q5Employee(102, "Amit", 60000));
        employees.add(new Q5Employee(103, "Pratik", 45000));
        employees.add(new Q5Employee(104, "Rohan", 55000));
        employees.add(new Q5Employee(105, "Akash", 65000));

        System.out.println("All Employees:");

        for (Q5Employee e : employees) {
            e.display();
            System.out.println();
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee ID to Search:");
        int searchId = sc.nextInt();

        boolean found = false;

        for (Q5Employee e : employees) {

            if (e.id == searchId) {
                System.out.println("Employee Found:");
                e.display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee Not Found");
        }

        System.out.println("Enter Employee ID to Delete:");
        int deleteId = sc.nextInt();

        for (int i = 0; i < employees.size(); i++) {

            if (employees.get(i).id == deleteId) {
                employees.remove(i);
                System.out.println("Employee Deleted");
                break;
            }
        }

        System.out.println("\nEmployees After Delete:");

        for (Q5Employee e : employees) {
            e.display();
            System.out.println();
        }

        sc.close();
    }
}
