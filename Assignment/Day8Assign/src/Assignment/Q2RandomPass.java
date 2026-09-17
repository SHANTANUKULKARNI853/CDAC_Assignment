/*using Math.random() method write code to generate Random Password with 8 characters 

password can contain A-Z a-z 0-9 */

package Assignment;

import java.util.Scanner;

class Q2RandomPass {

    @SuppressWarnings("resource")
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter password length:");
//        int length = sc.nextInt();
        int length = 12;

        if (length < 8) {
            System.out.println("Password length must be at least 8");
            return;
        }

        String capital = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";

        String password = "";

        int index = (int)(Math.random() * capital.length());

        password = password + capital.charAt(index);

        for (int i = 1; i < length; i++) {

            index = (int)(Math.random() * characters.length());

            password = password + characters.charAt(index);
        }

        System.out.println("Random Password = " + password);

        sc.close();
    }
}
