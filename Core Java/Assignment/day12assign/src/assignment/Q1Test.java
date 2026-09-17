/* Create Array of Employee Objects created in Previous Lab Session 
and store data of an Employee in File 

use Serialization concept */

package assignment;

import java.io.*;

class Test {

    public static void main(String[] args) {

        Q1Employee[] employees = new Q1Employee[3];

        employees[0] = new Q1Employee(101, 50000, "Rahul");
        employees[1] = new Q1Employee(102, 60000, "Amit");
        employees[2] = new Q1Employee(103, 45000, "Pratik");

        Q1EmployeeService service = new Q1EmployeeService();

        try {

            service.saveEmployee(employees);

            System.out.println("\nEmployee Data:");

            service.readEmployee();

        } catch (IOException e) {

            System.out.println("File Error: " + e.getMessage());

        } catch (ClassNotFoundException e) {

            System.out.println("Class Not Found");
        }
    }
}
