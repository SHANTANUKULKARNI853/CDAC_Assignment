package selflearning;

//4. Print butterfly pattern.

import java.util.Scanner;

class Q4 {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     System.out.println("Enter Number of Rows:");
     int n = sc.nextInt();

     // Upper half section for the butterfly
     for (int i = 1; i <= n; i++) {

         // Left stars
         for (int j = 1; j <= i; j++) {
             System.out.print("*");
         }

         // Spaces
         for (int j = 1; j <= 2 * (n - i); j++) {
             System.out.print(" ");
         }

         // Right stars
         for (int j = 1; j <= i; j++) {
             System.out.print("*");
         }

         System.out.println();
     }

     // Lower half section for the butterfly
     for (int i = n - 1; i >= 1; i--) {

         // Left stars
         for (int j = 1; j <= i; j++) {
             System.out.print("*");
         }

         // Spaces
         for (int j = 1; j <= 2 * (n - i); j++) {
             System.out.print(" ");
         }

         // Right stars
         for (int j = 1; j <= i; j++) {
             System.out.print("*");
         }

         System.out.println();
     }

     sc.close();
 }
}
