package selflearning;

//3. Write a program to check whether a given number is prime or not.

import java.util.Scanner;

class Q3 {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     System.out.println("Enter Number:");
     int n = sc.nextInt();

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
         System.out.println("Prime Number");
     } else {
         System.out.println("Not Prime Number");
     }

     sc.close();
 }
}