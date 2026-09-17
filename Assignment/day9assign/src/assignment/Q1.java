//accept email.id from user and check given data is valid email id format or not 
package assignment;

import java.util.Scanner;

class Q1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Email ID:");
        String email = sc.nextLine();

        boolean valid = true;

        if (email.length() == 0) {
            valid = false;
        }

        char first = email.charAt(0);

        if (!Character.isLetter(first)) {
            valid = false;
        }

        int at = email.indexOf('@');

        if (at == -1) {
            valid = false;
        }

        if (email.indexOf('@') != email.lastIndexOf('@')) {
            valid = false;
        }

        if (at == 0 || at == email.length() - 1) {
            valid = false;
        }

        if (email.contains(" ")) {
            valid = false;
        }

        if (!email.endsWith(".com")) {
            valid = false;
        }

        if (email.indexOf(".com") < at) {
            valid = false;
        }

        if (valid) {
            System.out.println("Valid Email ID");
        } else {
            System.out.println("Invalid Email ID");
        }

        sc.close();
    }
}
