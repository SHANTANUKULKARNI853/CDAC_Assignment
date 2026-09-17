/*Use Student Class created in Previous assignment 
    create Student array of 5 elements 
     accept the data for 5 Students
     display the data 
	
	search the Student byName */

package Assignment;

import java.util.Scanner;

class Q3Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Q3Student[] students = new Q3Student[5];

        for (int i = 0; i < students.length; i++) {

            System.out.println("Enter Student Name:");
            String name = sc.next();

            System.out.println("Enter Marks 1:");
            int mks1 = sc.nextInt();

            System.out.println("Enter Marks 2:");
            int mks2 = sc.nextInt();

            System.out.println("Enter Marks 3:");
            int mks3 = sc.nextInt();

            students[i] = new Q3Student(name, mks1, mks2, mks3);
        }

        System.out.println("\nStudent Details");

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
            System.out.println();
        }

        System.out.println("Enter name to search:");
        String searchName = sc.next();

        boolean found = false;

        for (int i = 0; i < students.length; i++) {

            if (students[i].getName().equalsIgnoreCase(searchName)) {
                System.out.println("\nStudent Found:");
                System.out.println(students[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Student not found");
        }

        sc.close();
    }
}
