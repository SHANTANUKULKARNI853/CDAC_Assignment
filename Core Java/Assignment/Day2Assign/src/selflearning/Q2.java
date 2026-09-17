package selflearning;

//2. Write a program to check whether a given number is a palindrome.
//Example: 121 → Palindrome, 123 → Not Palindrome

import java.util.Scanner;

class Q2 {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     System.out.println("Enter Number:");
     int n = sc.nextInt();

     int original = n;
     int reverse = 0;

     while (n != 0) {

         int digit = n % 10;

         reverse = reverse * 10 + digit;

         n = n / 10;
     }

     if (original == reverse) {
         System.out.println("Palindrome");
     } else {
         System.out.println("Not Palindrome");
     }

     sc.close();
 }
}
