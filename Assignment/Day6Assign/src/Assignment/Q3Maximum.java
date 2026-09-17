//2) Accept 3 number from user and display Maximum number from that 

package Assignment;

import java.util.Scanner;

class Q3Maximum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 numbers:");

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int max = n1;

        if (n2 > max) {
            max = n2;
        }

        if (n3 > max) {
            max = n3;
        }

        System.out.println("Maximum = " + max);

        sc.close();
    }
}
