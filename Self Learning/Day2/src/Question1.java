package Day2.src;
//1. Reverse a Number
//Write a program to reverse the digits of a given number using a loop.
//Example: 12345 → 54321

import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int rev = 0;

        while (num != 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }

        System.out.println("Reverse = " + rev);
    }
}
