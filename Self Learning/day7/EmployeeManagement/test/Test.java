package day7.EmployeeManagement.test;

/*
Develop an Employee Management System that:
i. Uses pattern matching to process different employee objects.
*/

import day7.EmployeeManagement.model.Developer;
import day7.EmployeeManagement.model.Employee;
import day7.EmployeeManagement.model.Manager;
import day7.EmployeeManagement.service.EmployeeService;

public class Test {

    public static void main(String[] args) {

        EmployeeService service = new EmployeeService();

        Employee e1 = new Manager(101, "Rahul", 50000, 10000);
        Employee e2 = new Developer(102, "Amit", 45000, "Java");
        Employee e3 = new Employee(103, "Neha", 40000);

        service.addEmployee(e1);
        service.addEmployee(e2);
        service.addEmployee(e3);

        service.displayEmployees();
    }
}
