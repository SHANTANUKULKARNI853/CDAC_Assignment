/*Accept 2 numbers from user as a command line (String type) 

Convert String type data in Integer type and Display addition 

Convert String type data in int Type and Display multiplication */


package Assignment;

//import java.util.Scanner;

class Q4Test {

    public static void main(String[] args) {

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        System.out.println("Addition = " + (num1 + num2));

        System.out.println("Multiplication = " + (num1 * num2));
    }
}