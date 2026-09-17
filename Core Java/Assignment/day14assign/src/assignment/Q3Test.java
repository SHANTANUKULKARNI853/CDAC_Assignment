/* Use Employee class defined in earlier assignment 
and create map salInfo which contains Employee id as key and Empoyee Object  as  a value 

and accept input from user to search employee based on salary 
and display the employee data 

iterate map using Entry Object */

package assignment;

import java.util.*;

class Q3Test {

    public static void main(String[] args) {

        HashMap<Integer, Employee> salInfo = new HashMap<>();

        Employee e1 =
                new Employee(101, "Rahul", 50000, "IT", "Developer");

        Employee e2 =
                new Employee(102, "Amit", 60000, "HR", "Manager");

        Employee e3 =
                new Employee(103, "Pratik", 45000, "IT", "Tester");

        Employee e4 =
                new Employee(104, "Rohan", 60000, "Sales", "Executive");

        salInfo.put(e1.id, e1);
        salInfo.put(e2.id, e2);
        salInfo.put(e3.id, e3);
        salInfo.put(e4.id, e4);

        System.out.println("Employee Details:");

        for (Map.Entry<Integer, Employee> entry :
                salInfo.entrySet()) {

            System.out.println("Key = " + entry.getKey());

            entry.getValue().display();

            System.out.println();
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Salary to Search:");
        double searchSalary = sc.nextDouble();

        boolean found = false;

        for (Map.Entry<Integer, Employee> entry :
                salInfo.entrySet()) {

            Employee e = entry.getValue();

            if (e.sal == searchSalary) {

                e.display();

                System.out.println();

                found = true;
            }
        }

        if (!found) {
            System.out.println("Employee Not Found");
        }

        sc.close();
    }
}
