package selflearning;

//1. Write a program to reverse the digits of a given number using a loop.
//Example: 12345 → 54321

import java.util.Scanner;

class Q1 {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     System.out.println("Enter Number:");
     int n = sc.nextInt();

     int reverse = 0;

     while (n != 0) {

         int digit = n % 10;

         reverse = reverse * 10 + digit;

         n = n / 10;
     }

     System.out.println("Reverse = " + reverse);

     sc.close();
 }
}
