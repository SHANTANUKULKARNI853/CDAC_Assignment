//use static and transient variable inside class and check persistence of object on file 

package assignment;

import java.io.*;

class Q1Test {

    public static void main(String[] args) {

        Q1Employee e1 =
                new Q1Employee(101, "Rahul", 50000, "abc123");

        try {

            ObjectOutputStream oos =
                    new ObjectOutputStream(
                            new FileOutputStream("Employee.txt"));

            oos.writeObject(e1);

            oos.close();

            System.out.println("Before Serialization:");

            e1.display();

            ObjectInputStream ois =
                    new ObjectInputStream(
                            new FileInputStream("Employee.txt"));

            Q1Employee e2 = (Q1Employee) ois.readObject();

            ois.close();

            System.out.println("\nAfter Deserialization:");

            e2.display();

        } catch (IOException | ClassNotFoundException e) {

            System.out.println(e.getMessage());
        }
    }
}
