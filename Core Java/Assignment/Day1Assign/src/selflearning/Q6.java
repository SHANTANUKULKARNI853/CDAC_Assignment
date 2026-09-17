//Write a program to find principal diagonal sum of a matrix.
package selflearning;

import java.util.Scanner;

class Q6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] a = new int[3][3];

        System.out.println("Enter Matrix Elements:");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                a[i][j] = sc.nextInt();
            }
        }

        int sum = 0;

        for (int i = 0; i < 3; i++) {

            sum = sum + a[i][i];
        }

        System.out.println("Principal Diagonal Sum = " + sum);

        sc.close();
    }
}
