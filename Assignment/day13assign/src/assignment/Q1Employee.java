package assignment;

import java.io.Serializable;

class Q1Employee implements Serializable {

    int id;
    String name;
    double salary;

    static String company = "ABC Company";

    transient String password;

    Q1Employee(int id, String name, double salary, String password) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.password = password;
    }

    void display() {
        System.out.println("ID = " + id);
        System.out.println("Name = " + name);
        System.out.println("Salary = " + salary);
        System.out.println("Company = " + company);
        System.out.println("Password = " + password);
    }
}
