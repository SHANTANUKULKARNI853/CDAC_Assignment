/*Create 2D array with [3][3]
	write a menu driven program 
	1) accept data
	2) display data
	3) rowwise sum
	4) columnwise sum 
	5) displayMax
	6)displayMin
	7)display rowwise max
	8)display columwise max*/

package Assignment;

import java.util.Scanner;

class Q3Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][3];

        int choice;

        do {
            System.out.println("\n1. Accept Data");
            System.out.println("2. Display Data");
            System.out.println("3. Rowwise Sum");
            System.out.println("4. Columnwise Sum");
            System.out.println("5. Display Max");
            System.out.println("6. Display Min");
            System.out.println("7. Display Rowwise Max");
            System.out.println("8. Display Columnwise Max");
            System.out.println("9. Exit");

            System.out.println("Enter your choice:");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter 9 elements:");

                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[i].length; j++) {
                            arr[i][j] = sc.nextInt();
                        }
                    }

                    break;

                case 2:
                    Q3Array2DOperations.displayData(arr);
                    break;

                case 3:
                    Q3Array2DOperations.rowWiseSum(arr);
                    break;

                case 4:
                    Q3Array2DOperations.columnWiseSum(arr);
                    break;

                case 5:
                    System.out.println("Maximum = " + Q3Array2DOperations.displayMax(arr));
                    break;

                case 6:
                    System.out.println("Minimum = " + Q3Array2DOperations.displayMin(arr));
                    break;

                case 7:
                    Q3Array2DOperations.rowWiseMax(arr);
                    break;

                case 8:
                    Q3Array2DOperations.columnWiseMax(arr);
                    break;

                case 9:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 9);

        sc.close();
    }
}
