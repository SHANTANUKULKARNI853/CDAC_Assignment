package Day2.src;

//7. Count Even and Odd Numbers in an Array
//Write a program to accept an array of integers and count how many
//elements are even and how many are odd.

import java.util.Scanner;

public class Question7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        int even = 0;
        int odd = 0;

        System.out.println("Enter array elements:");

        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();

            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even numbers = " + even);
        System.out.println("Odd numbers = " + odd);
    }
}
