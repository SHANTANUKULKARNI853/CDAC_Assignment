//Accept 3 numbers from user and display Minimum from That
package Assignment;

import java.util.Scanner;

class Q2Minimum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 numbers:");

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int min = n1;

        if (n2 < min) {
            min = n2;
        }

        if (n3 < min) {
            min = n3;
        }

        System.out.println("Minimum = " + min);

        sc.close();
    }
}
