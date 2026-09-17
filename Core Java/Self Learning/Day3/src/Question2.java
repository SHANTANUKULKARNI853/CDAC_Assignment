package Day3.src;//2. Print Pascal’s triangle.

import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            // Print spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            int value = 1;

            for (int j = 0; j <= i; j++) {

                System.out.print(value + " ");

                value = value * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}
