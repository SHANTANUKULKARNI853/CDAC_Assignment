package assignment;

import java.util.*;

class Q2EmployeeService {

    HashSet<Employee> employees = new HashSet<>();

    TreeMap<Integer, Employee> employeeMap = new TreeMap<>();

    void addToHashSet(Employee e) {

        if (employees.add(e)) {
            System.out.println("Employee Added");
        } else {
            System.out.println("Duplicate Employee ID");
        }
    }

    void displayHashSet() {

        for (Employee e : employees) {
            e.display();
            System.out.println();
        }
    }

    void addToTreeMap(Employee e) {

        if (employeeMap.containsKey(e.id)) {
            System.out.println("Duplicate Employee ID");
        } else {
            employeeMap.put(e.id, e);
            System.out.println("Employee Added");
        }
    }

    void displayTreeMap() {

        for (Map.Entry<Integer, Employee> entry :
                employeeMap.entrySet()) {

            entry.getValue().display();
            System.out.println();
        }
    }
}
