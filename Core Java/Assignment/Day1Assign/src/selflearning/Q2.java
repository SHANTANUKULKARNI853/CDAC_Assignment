/*Write a program to find the factorial of a number using a loop.*/

package selflearning;

import java.util.Scanner;

class Q2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number:");
        int n = sc.nextInt();

        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial = " + fact);

        sc.close();
    }
}