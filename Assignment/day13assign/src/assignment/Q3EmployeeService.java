package assignment;

import java.util.*;

class Q3EmployeeService {

    ArrayList<Q3Employee> employees = new ArrayList<>();

    void addEmployee(Q3Employee e) {
        employees.add(e);
        System.out.println("Employee Added Successfully");
    }

    void deleteById(int id) {

        for (int i = 0; i < employees.size(); i++) {

            if (employees.get(i).id == id) {
                employees.remove(i);
                System.out.println("Employee Deleted");
                return;
            }
        }

        System.out.println("Employee Not Found");
    }

    void updateSalary(int id, double salary) {

        for (Q3Employee e : employees) {

            if (e.id == id) {
                e.salary = salary;
                System.out.println("Salary Updated");
                return;
            }
        }

        System.out.println("Employee Not Found");
    }

    void findById(int id) {

        for (Q3Employee e : employees) {

            if (e.id == id) {
                e.display();
                return;
            }
        }

        System.out.println("Employee Not Found");
    }

    void displayAll() {

        if (employees.size() == 0) {
            System.out.println("No Employees");
            return;
        }

        for (Q3Employee e : employees) {
            e.display();
            System.out.println();
        }
    }

    void sortById() {

        Collections.sort(employees, new Comparator<Q3Employee>() {

            public int compare(Q3Employee e1, Q3Employee e2) {
                return e1.id - e2.id;
            }
        });

        System.out.println("Sorted By ID");
    }

    void sortByName() {

        Collections.sort(employees, new Comparator<Q3Employee>() {

            public int compare(Q3Employee e1, Q3Employee e2) {
                return e1.name.compareTo(e2.name);
            }
        });

        System.out.println("Sorted By Name");
    }

    void sortBySalary() {

        Collections.sort(employees, new Comparator<Q3Employee>() {

            public int compare(Q3Employee e1, Q3Employee e2) {
                return Double.compare(e1.salary, e2.salary);
            }
        });

        System.out.println("Sorted By Salary");
    }
}
