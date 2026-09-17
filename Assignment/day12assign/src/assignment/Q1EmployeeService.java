package assignment;

import java.io.*;

class Q1EmployeeService {

    void saveEmployee(Q1Employee[] employees) throws IOException {

        ObjectOutputStream oos =
                new ObjectOutputStream(
                        new FileOutputStream("Employee.txt"));

        oos.writeObject(employees);

        oos.close();

        System.out.println("Employee data stored successfully");
    }

    void readEmployee() throws IOException, ClassNotFoundException {

        ObjectInputStream ois =
                new ObjectInputStream(
                        new FileInputStream("Employee.txt"));

        Q1Employee[] employees = (Q1Employee[]) ois.readObject();

        ois.close();

        for (Q1Employee e : employees) {
            e.display();
            System.out.println();
        }
    }
}