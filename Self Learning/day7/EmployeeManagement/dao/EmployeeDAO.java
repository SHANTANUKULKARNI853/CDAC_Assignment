package day7.EmployeeManagement.dao;

import java.util.ArrayList;
import day7.EmployeeManagement.model.Employee;

public class EmployeeDAO {

    ArrayList<Employee> employeeList = new ArrayList<Employee>();

    public void addEmployee(Employee e) {
        employeeList.add(e);
    }

    public ArrayList<Employee> getEmployees() {
        return employeeList;
    }
}
