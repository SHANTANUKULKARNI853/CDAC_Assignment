package selflearning;

//10. Write a program to accept N integers into an array and find how many times each element occurs.
//Example: 2 3 2 5 3 2 → 2: 3 times, 3: 2 times, 5: 1 time

import java.util.Scanner;

class Q10 {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     System.out.println("Enter Array Size:");
     int n = sc.nextInt();

     int[] a = new int[n];

     System.out.println("Enter Array Elements:");

     for (int i = 0; i < n; i++) {
         a[i] = sc.nextInt();
     }

     for (int i = 0; i < n; i++) {

         boolean alreadyCounted = false;

         for (int j = 0; j < i; j++) {

             if (a[i] == a[j]) {
                 alreadyCounted = true;
                 break;
             }
         }

         if (alreadyCounted) {
             continue;
         }

         int count = 0;

         for (int j = 0; j < n; j++) {

             if (a[i] == a[j]) {
                 count++;
             }
         }

         System.out.println(a[i] + " : " + count + " times");
     }

     sc.close();
 }
}
