package Day2.src;

//6. Calculate Sum and Average of Array Elements
//Write a program to accept N numbers into an array and calculate their
//total sum and average.

import java.util.Scanner;

public class Question6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        int sum = 0;

        System.out.println("Enter array elements:");

        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();

            sum = sum + arr[i];
        }

        double average = (double) sum / n;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}
