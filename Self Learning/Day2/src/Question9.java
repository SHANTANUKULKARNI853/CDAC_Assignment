package Day2.src;
//9. Find Sum of Each Row and Column in a Matrix
//Write a program to accept a matrix and calculate the sum of every
//individual row and every individual column.

import java.util.Scanner;

public class Question9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Print matrix
        System.out.println("Matrix:");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

        // Row Sum
        for (int i = 0; i < rows; i++) {

            int sum = 0;

            for (int j = 0; j < cols; j++) {
                sum = sum + arr[i][j];
            }

            System.out.println("Sum of Row " + (i + 1) + " = " + sum);
        }

        // Column Sum
        for (int j = 0; j < cols; j++) {

            int sum = 0;

            for (int i = 0; i < rows; i++) {
                sum = sum + arr[i][j];
            }

            System.out.println("Sum of Column " + (j + 1) + " = " + sum);
        }
    }
}
