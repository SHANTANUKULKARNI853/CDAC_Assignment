package Assignment;

class Q3Array2DOperations {

    static void displayData(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void rowWiseSum(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;

            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }

            System.out.println("Row " + (i + 1) + " Sum = " + sum);
        }
    }

    static void columnWiseSum(int[][] arr) {
        for (int j = 0; j < arr[0].length; j++) {
            int sum = 0;

            for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i][j];
            }

            System.out.println("Column " + (j + 1) + " Sum = " + sum);
        }
    }

    static int displayMax(int[][] arr) {
        int max = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }

        return max;
    }

    static int displayMin(int[][] arr) {
        int min = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }

        return min;
    }

    static void rowWiseMax(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int max = arr[i][0];

            for (int j = 1; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }

            System.out.println("Row " + (i + 1) + " Max = " + max);
        }
    }

    static void columnWiseMax(int[][] arr) {
        for (int j = 0; j < arr[0].length; j++) {
            int max = arr[0][j];

            for (int i = 1; i < arr.length; i++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }

            System.out.println("Column " + (j + 1) + " Max = " + max);
        }
    }
}
