package Day2.src;

//8. Transpose of a Matrix
//Write a program to accept a matrix and print its transpose.
//Example: Rows become columns and columns become rows.
import java.util.Scanner;

public class Question8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Matrix:");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println("Transpose Matrix:");

        for (int i = 0; i < cols; i++) {

            for (int j = 0; j < rows; j++) {
                System.out.print(arr[j][i] + " ");
            }

            System.out.println();
        }
    }
}
