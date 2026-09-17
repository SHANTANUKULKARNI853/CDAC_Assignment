package assignment;

import java.io.*;
import java.util.*;

class Q3EmployeeService {

    Scanner sc = new Scanner(System.in);

    void acceptEmployee() throws IOException {

        FileWriter fw = new FileWriter("Employee.txt", true);

        BufferedWriter bw = new BufferedWriter(fw);

        for (int i = 1; i <= 3; i++) {

            System.out.println("Enter Employee ID:");
            int id = Integer.parseInt(sc.nextLine());

            System.out.println("Enter Employee Name:");
            String name = sc.nextLine();

            System.out.println("Enter Employee Salary:");
            double salary = Double.parseDouble(sc.nextLine());

            Q3Employee e = new Q3Employee(id, salary, name);

            bw.write(e.toString());
            bw.newLine();
        }

        bw.close();
    }

    void displayEmployee() throws IOException {

        BufferedReader br =
                new BufferedReader(new FileReader("Employee.txt"));

        String line;

        while ((line = br.readLine()) != null) {

            String[] data = line.split(",");

            System.out.println("ID = " + data[0]);
            System.out.println("Salary = " + data[1]);
            System.out.println("Name = " + data[2]);

            System.out.println();
        }

        br.close();
    }

    void searchByID(int searchId)
            throws IOException, Q3EmployeeNotFoundException {

        BufferedReader br =
                new BufferedReader(new FileReader("Employee.txt"));

        String line;
        boolean found = false;

        while ((line = br.readLine()) != null) {

            String[] data = line.split(",");

            int id = Integer.parseInt(data[0]);

            if (id == searchId) {

                Q3Employee e = new Q3Employee(
                        Integer.parseInt(data[0]),
                        Double.parseDouble(data[1]),
                        data[2]
                );

                e.display();

                found = true;
                break;
            }
        }

        br.close();

        if (!found) {
            throw new Q3EmployeeNotFoundException(
                    "Employee with ID " + searchId + " not found");
        }
    }
}
