

package Assignment;

class Q1ArrayOperations {

    static int findMax(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    static int findMin(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    static void searchNumber(int[] arr, int num) {
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                System.out.println("Number found at index " + i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Number not found");
        }
    }

    static int findOccurrence(int[] arr, int num) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count++;
            }
        }

        return count;
    }

    static int addition(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        return sum;
    }

    static void squareOfEvenNumbers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i] * arr[i]);
            }
        }
    }
}
