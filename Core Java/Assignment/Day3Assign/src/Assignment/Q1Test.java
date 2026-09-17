/*Create number array -  length need to accept from user 
accept data for array , Display Data of an array 

then write a Menu Deriven Program to perform Opertations on Array 

    1 findMax
    2 findMin
    3 search a number
    4 find the occurance of a number 
    5 display addition of array elements 
    6 display sqaure of even numbers from an array 
*/

package Assignment;

import java.util.Scanner;

class Q1Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int choice;

        do {
            System.out.println("\n\n1. Find Maximum");
            System.out.println("2. Find Minimum");
            System.out.println("3. Search a Number");
            System.out.println("4. Find Occurrence");
            System.out.println("5. Addition of Array Elements");
            System.out.println("6. Square of Even Numbers");
            System.out.println("7. Exit");

            System.out.println("Enter your choice:");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Maximum = " + Q1ArrayOperations.findMax(arr));
                    break;

                case 2:
                    System.out.println("Minimum = " + Q1ArrayOperations.findMin(arr));
                    break;

                case 3:
                    System.out.println("Enter number to search:");
                    int search = sc.nextInt();
                    Q1ArrayOperations.searchNumber(arr, search);
                    break;

                case 4:
                    System.out.println("Enter number:");
                    int num = sc.nextInt();
                    System.out.println("Occurrence = " + Q1ArrayOperations.findOccurrence(arr, num));
                    break;

                case 5:
                    System.out.println("Addition = " + Q1ArrayOperations.addition(arr));
                    break;

                case 6:
                    System.out.println("Square of even numbers:");
                    Q1ArrayOperations.squareOfEvenNumbers(arr);
                    break;

                case 7:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 7);

        sc.close();
    }
}
