package selflearning;

//4. Write a program to accept two numbers and print all prime numbers between them.

import java.util.Scanner;

class Q4 {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     System.out.println("Enter Starting Number:");
     int start = sc.nextInt();

     System.out.println("Enter Ending Number:");
     int end = sc.nextInt();

     for (int n = start; n <= end; n++) {

         boolean prime = true;

         if (n <= 1) {
             prime = false;
         }

         for (int i = 2; i < n; i++) {

             if (n % i == 0) {
                 prime = false;
                 break;
             }
         }

         if (prime) {
             System.out.print(n + " ");
         }
     }

     sc.close();
 }
}
