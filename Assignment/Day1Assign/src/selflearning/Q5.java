//Print different patterns of asterisk (*) using loops (e.g. triangle of *)
package selflearning;

import java.util.Scanner;

class Q5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Rows:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print("* ");
            }

            System.out.println();
        }

        sc.close();
    }
}
