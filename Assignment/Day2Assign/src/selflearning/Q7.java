package selflearning;

//7. Write a program to accept an array of integers and count how many elements are even and how many are odd.

import java.util.Scanner;

class Q7 {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     System.out.println("Enter Array Size:");
     int n = sc.nextInt();

     int[] a = new int[n];

     int even = 0;
     int odd = 0;

     System.out.println("Enter Array Elements:");

     for (int i = 0; i < n; i++) {

         a[i] = sc.nextInt();

         if (a[i] % 2 == 0) {
             even++;
         } else {
             odd++;
         }
     }

     System.out.println("Even Numbers = " + even);
     System.out.println("Odd Numbers = " + odd);

     sc.close();
 }
}
