package selflearning;

//2. Print Pascal's triangle.

import java.util.Scanner;

class Q2 {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     System.out.println("Enter Number of Rows:");
     int n = sc.nextInt();

     for (int i = 0; i < n; i++) {

         int number = 1;

         // Spaces
         for (int j = 0; j < n - i; j++) {
             System.out.print(" ");
         }

         for (int j = 0; j <= i; j++) {

             System.out.print(number + " ");

             number = number * (i - j) / (j + 1);
         }

         System.out.println();
     }

     sc.close();
 }
}
