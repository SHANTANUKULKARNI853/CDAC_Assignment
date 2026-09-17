/*Understand the Concept of File , and operations on that 

a) write a program to understand simple class FileInputStream and FileOutputStream  on File 

b)  accept sentence from user and write and read that on File  Data.txt using FileInputStream and FileOutputStream 

C) do same thing with BufferedInputStream and BufferedOutputStream claases 

D) create and Employee class with variables Id , salary , name 

Write a service class for accepting data for Employee and Display Employee Data 

Accpet Data from user for ३ employees and insert Employee Data inside Employee.txt file 

Write a function to searchByID function and display the particular Employee and if Employee not present then Throw EmployeeNotFound Exception*/

package assignment;

import java.io.*;

class Q3Test {

    public static void main(String[] args) {

        Q3EmployeeService service = new Q3EmployeeService();

        try {

            service.acceptEmployee();

            System.out.println("Employee data stored successfully");

            service.displayEmployee();

            System.out.println("Enter ID to search:");

            int id = service.sc.nextInt();

            service.searchByID(id);

        } catch (Q3EmployeeNotFoundException e) {

            System.out.println(e.getMessage());

        } catch (IOException e) {

            System.out.println("File Error: " + e.getMessage());

        } catch (NumberFormatException e) {

            System.out.println("Enter valid number");

        }
    }
}
