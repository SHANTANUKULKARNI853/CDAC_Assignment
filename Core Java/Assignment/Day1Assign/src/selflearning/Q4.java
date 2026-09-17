/*Write a program to generate the Fibonacci series up to N terms.*/
package selflearning;

import java.util.Scanner;

class Q4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Terms:");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        for (int i = 1; i <= n; i++) {

            System.out.print(a + " ");

            int c = a + b;

            a = b;
            b = c;
        }

        sc.close();
    }
}
