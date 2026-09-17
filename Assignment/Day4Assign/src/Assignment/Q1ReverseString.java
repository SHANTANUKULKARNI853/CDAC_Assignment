/*Accept String Data from 
 * user and display in Reverse order*/


package Assignment;

import java.util.Scanner;

class Q1ReverseString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String:");
        String str = sc.nextLine();

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        System.out.println("Reverse String = " + reverse);

        sc.close();
    }
}
