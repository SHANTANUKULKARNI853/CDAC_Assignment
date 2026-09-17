/*use calculator class created in previous lab and add MutiCatch block inside that */
package assignment;

import java.util.Scanner;

class Q2Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Q2Calculator c = new Q2Calculator();

        try {

            System.out.println("Enter first number:");
            int a = Integer.parseInt(sc.nextLine());

            System.out.println("Enter second number:");
            int b = Integer.parseInt(sc.nextLine());

            System.out.println("Division = " + c.division(a, b));

        } catch (ArithmeticException | NumberFormatException e) {

            System.out.println("Exception = " + e.getMessage());

        } finally {

            System.out.println("Program completed");
        }

        sc.close();
    }
}
