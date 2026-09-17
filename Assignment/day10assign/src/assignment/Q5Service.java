package assignment;

import java.util.Scanner;

class Q5Service {

    void start() {

        Scanner sc = new Scanner(System.in);
        Q5Calculator cal = new Q5Calculator();

        while (true) {

            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.println("Enter Choice:");

            try {

                int choice = Integer.parseInt(sc.nextLine());

                if (choice == 5) {
                    break;
                }

                System.out.println("Enter First Number:");
                int a = Integer.parseInt(sc.nextLine());

                System.out.println("Enter Second Number:");
                int b = Integer.parseInt(sc.nextLine());

                switch (choice) {

                    case 1:
                        System.out.println("Result = " + cal.addition(a, b));
                        break;

                    case 2:
                        System.out.println("Result = " + cal.subtraction(a, b));
                        break;

                    case 3:
                        System.out.println("Result = " + cal.multiplication(a, b));
                        break;

                    case 4:
                        System.out.println("Result = " + cal.division(a, b));
                        break;

                    default:
                        System.out.println("Invalid Choice");
                }

            } catch (NumberFormatException e) {

                System.out.println("Please enter numbers only");

            } finally {

                System.out.println("Operation completed");
            }
        }

        sc.close();
    }
}