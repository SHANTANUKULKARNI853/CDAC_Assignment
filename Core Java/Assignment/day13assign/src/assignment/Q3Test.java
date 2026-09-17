/*
3) Create Person -> Employee 

	Employee ->SalariedEmployee & ContractEmployee
hirarchy as discuseed in class 

using Layer architecture write Menu Driven Program for Employee Mgmt System 

to perform following operations 
1. add new employee
2. delete by id
 3. update salary
4. find by id
5. display all
6. sort by id
7. sort by name
8. sort by sal
9 exit*/

package assignment;

import java.util.Scanner;

class Q3Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Q3EmployeeService service = new Q3EmployeeService();

        while (true) {

            System.out.println("\n----- Employee Management System -----");
            System.out.println("1. Add New Employee");
            System.out.println("2. Delete By ID");
            System.out.println("3. Update Salary");
            System.out.println("4. Find By ID");
            System.out.println("5. Display All");
            System.out.println("6. Sort By ID");
            System.out.println("7. Sort By Name");
            System.out.println("8. Sort By Salary");
            System.out.println("9. Exit");

            System.out.println("Enter Choice:");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.println("Enter Employee Type:");
                    System.out.println("1. Salaried Employee");
                    System.out.println("2. Contract Employee");

                    int type = sc.nextInt();

                    System.out.println("Enter ID:");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.println("Enter Name:");
                    String name = sc.nextLine();

                    System.out.println("Enter Mobile:");
                    String mobile = sc.nextLine();

                    System.out.println("Enter Email:");
                    String email = sc.nextLine();

                    System.out.println("Enter Salary:");
                    double salary = sc.nextDouble();

                    if (type == 1) {

                        Q3SalariedEmployee se =
                                new Q3SalariedEmployee(
                                        id, name, mobile, email, salary);

                        service.addEmployee(se);

                    } else if (type == 2) {

                        Q3ContractEmployee ce =
                                new Q3ContractEmployee(
                                        id, name, mobile, email, salary);

                        service.addEmployee(ce);

                    } else {

                        System.out.println("Invalid Employee Type");
                    }

                    break;

                case 2:

                    System.out.println("Enter Employee ID:");
                    int deleteId = sc.nextInt();

                    service.deleteById(deleteId);

                    break;

                case 3:

                    System.out.println("Enter Employee ID:");
                    int updateId = sc.nextInt();

                    System.out.println("Enter New Salary:");
                    double newSalary = sc.nextDouble();

                    service.updateSalary(updateId, newSalary);

                    break;

                case 4:

                    System.out.println("Enter Employee ID:");
                    int searchId = sc.nextInt();

                    service.findById(searchId);

                    break;

                case 5:

                    service.displayAll();

                    break;

                case 6:

                    service.sortById();

                    service.displayAll();

                    break;

                case 7:

                    service.sortByName();

                    service.displayAll();

                    break;

                case 8:

                    service.sortBySalary();

                    service.displayAll();

                    break;

                case 9:

                    System.out.println("Program Ended");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}
