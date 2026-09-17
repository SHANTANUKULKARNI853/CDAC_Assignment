package day7.EmployeeManagement.service;

import java.util.ArrayList;

import day7.EmployeeManagement.dao.*;
import day7.EmployeeManagement.model.*;
import day7.EmployeeManagement.model.*;
import day7.EmployeeManagement.*;

public class EmployeeService {

    EmployeeDAO dao = new EmployeeDAO();

    public void addEmployee(Employee e) {
        dao.addEmployee(e);
    }

    public void displayEmployees() {

        ArrayList<Employee> employeeList = dao.getEmployees();

        for (Employee e : employeeList) {

            if (e instanceof Manager m) {

                System.out.println("Manager");
                System.out.println("ID: " + m.getId());
                System.out.println("Name: " + m.getName());
                System.out.println("Salary: " + m.getSalary());
                System.out.println("Bonus: " + m.getBonus());

            } else if (e instanceof Developer d) {

                System.out.println("Developer");
                System.out.println("ID: " + d.getId());
                System.out.println("Name: " + d.getName());
                System.out.println("Salary: " + d.getSalary());
                System.out.println("Language: " + d.getLanguage());

            } else {

                System.out.println("Employee");
                System.out.println("ID: " + e.getId());
                System.out.println("Name: " + e.getName());
                System.out.println("Salary: " + e.getSalary());
            }

            System.out.println("--------------------");
        }
    }
}