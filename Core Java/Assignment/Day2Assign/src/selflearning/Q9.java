package selflearning;

//9. Write a program to accept a matrix and calculate the sum of every individual row and every individual column.

import java.util.Scanner;

class Q9 {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     System.out.println("Enter Rows:");
     int rows = sc.nextInt();

     System.out.println("Enter Columns:");
     int cols = sc.nextInt();

     int[][] a = new int[rows][cols];

     System.out.println("Enter Matrix Elements:");

     for (int i = 0; i < rows; i++) {

         for (int j = 0; j < cols; j++) {

             a[i][j] = sc.nextInt();
         }
     }

     for (int i = 0; i < rows; i++) {

         int sum = 0;

         for (int j = 0; j < cols; j++) {

             sum = sum + a[i][j];
         }

         System.out.println("Row " + (i + 1) + " Sum = " + sum);
     }

     for (int j = 0; j < cols; j++) {

         int sum = 0;

         for (int i = 0; i < rows; i++) {

             sum = sum + a[i][j];
         }

         System.out.println("Column " + (j + 1) + " Sum = " + sum);
     }

     sc.close();
 }
}
