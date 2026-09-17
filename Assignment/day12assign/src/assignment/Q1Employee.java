package assignment;

import java.io.Serializable;

class Q1Employee implements Serializable {

    int id;
    double salary;
    String name;

    Q1Employee(int id, double salary, String name) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    void display() {
        System.out.println("ID = " + id);
        System.out.println("Name = " + name);
        System.out.println("Salary = " + salary);
    }
}
