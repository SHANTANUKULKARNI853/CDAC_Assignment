package Day2.src;

//5. Find Largest and Smallest Element in an Array
//Write a program to accept N integers into an array and find the largest
//and smallest elements without using built-in sorting methods.

import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest) {
                largest = arr[i];
            }

            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Largest = " + largest);
        System.out.println("Smallest = " + smallest);
    }
}