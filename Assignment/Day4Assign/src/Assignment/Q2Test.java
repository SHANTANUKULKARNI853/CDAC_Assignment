/*Use Student Class created in Previous LAB
    create Student array of 5 elements 
     accept the data for 5 Students
     display the data 
	
	add menu driven program 
		1) find byID
		2) find byName
		3) delete byID*/

package Assignment;

import java.util.Scanner;

class Q2Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Q2Student[] students = new Q2Student[5];

        for (int i = 0; i < students.length; i++) {

            System.out.println("Enter Student Name:");
            String name = sc.next();

            System.out.println("Enter Marks 1:");
            int mks1 = sc.nextInt();

            System.out.println("Enter Marks 2:");
            int mks2 = sc.nextInt();

            System.out.println("Enter Marks 3:");
            int mks3 = sc.nextInt();

            students[i] = new Q2Student(name, mks1, mks2, mks3);
        }

        int choice;

        do {
            System.out.println("\n1. Find by ID");
            System.out.println("2. Find by Name");
            System.out.println("3. Delete by ID");
            System.out.println("4. Display All");
            System.out.println("5. Exit");

            System.out.println("Enter your choice:");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter Student ID:");
                    int id = sc.nextInt();

                    boolean foundId = false;

                    for (int i = 0; i < students.length; i++) {

                        if (students[i] != null && students[i].getStudentId() == id) {
                            System.out.println(students[i]);
                            foundId = true;
                            break;
                        }
                    }

                    if (!foundId) {
                        System.out.println("Student not found");
                    }

                    break;

                case 2:
                    System.out.println("Enter Student Name:");
                    String name = sc.next();

                    boolean foundName = false;

                    for (int i = 0; i < students.length; i++) {

                        if (students[i] != null && students[i].getName().equalsIgnoreCase(name)) {
                            System.out.println(students[i]);
                            foundName = true;
                        }
                    }

                    if (!foundName) {
                        System.out.println("Student not found");
                    }

                    break;

                case 3:
                    System.out.println("Enter Student ID to delete:");
                    int deleteId = sc.nextInt();

                    boolean deleted = false;

                    for (int i = 0; i < students.length; i++) {

                        if (students[i] != null && students[i].getStudentId() == deleteId) {
                            students[i] = null;
                            deleted = true;
                            System.out.println("Student deleted");
                            break;
                        }
                    }

                    if (!deleted) {
                        System.out.println("Student not found");
                    }

                    break;

                case 4:
                    for (int i = 0; i < students.length; i++) {
                        if (students[i] != null) {
                            System.out.println(students[i]);
                            System.out.println();
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);

        sc.close();
    }
}
