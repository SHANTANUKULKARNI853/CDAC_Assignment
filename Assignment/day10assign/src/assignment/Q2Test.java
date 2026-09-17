/*Create an Employee class with variables 

Emp id , basic salary , joining date ( String) 

Display experience of an Employer use LocalDate class */

package assignment;

import java.util.Scanner;

class Q2Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee ID:");
        int id = sc.nextInt();

        System.out.println("Enter Basic Salary:");
        double salary = sc.nextDouble();

        System.out.println("Enter Joining Date (YYYY-MM-DD):");
        String date = sc.next();

        Q2Employee e = new Q2Employee(id, salary, date);

        e.displayExperience();

        sc.close();
    }
}
