package Day2.src;

//10.Count Frequency of Each Element in an Array
//Write a program to accept N integers into an array and find how many
//times each element occurs.
//Example: 2 3 2 5 3 2 → 2: 3 times, 3: 2 times, 5: 1 time
import java.util.Scanner;

public class Question10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {

            int count = 1;

            // Check if this element was already counted
            boolean alreadyCounted = false;

            for (int k = 0; k < i; k++) {

                if (arr[i] == arr[k]) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (alreadyCounted) {
                continue;
            }

            // Count frequency
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            System.out.println(arr[i] + " : " + count + " times");
        }
    }
}
