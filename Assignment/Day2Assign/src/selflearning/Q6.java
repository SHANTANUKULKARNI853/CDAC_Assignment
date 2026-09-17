package selflearning;

//6. Write a program to accept N numbers into an array and calculate their total sum and average.

import java.util.Scanner;

class Q6 {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     System.out.println("Enter Array Size:");
     int n = sc.nextInt();

     int[] a = new int[n];

     int sum = 0;

     System.out.println("Enter Array Elements:");

     for (int i = 0; i < n; i++) {

         a[i] = sc.nextInt();

         sum = sum + a[i];
     }

     double average = (double) sum / n;

     System.out.println("Sum = " + sum);
     System.out.println("Average = " + average);

     sc.close();
 }
}
