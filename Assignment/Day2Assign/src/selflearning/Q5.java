package selflearning;

//5. Write a program to accept N integers into an array and find the largest and smallest elements without using built-in sorting methods.

import java.util.Scanner;

class Q5 {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     System.out.println("Enter Array Size:");
     int n = sc.nextInt();

     int[] a = new int[n];

     System.out.println("Enter Array Elements:");

     for (int i = 0; i < n; i++) {
         a[i] = sc.nextInt();
     }

     int max = a[0];
     int min = a[0];

     for (int i = 1; i < n; i++) {

         if (a[i] > max) {
             max = a[i];
         }

         if (a[i] < min) {
             min = a[i];
         }
     }

     System.out.println("Largest = " + max);
     System.out.println("Smallest = " + min);

     sc.close();
 }
}