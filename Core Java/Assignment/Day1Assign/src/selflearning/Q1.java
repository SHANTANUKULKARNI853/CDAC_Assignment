/*Write a program to calculate the total bill amount after applying a
discount based
on the purchase amount.*/
package selflearning;

import java.util.Scanner;

class Q1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Purchase Amount:");
        double amount = sc.nextDouble();

        double discount;

        if (amount >= 10000) {
            discount = amount * 20 / 100;
        } else if (amount >= 5000) {
            discount = amount * 10 / 100;
        } else {
            discount = amount * 5 / 100;
        }

        double bill = amount - discount;

        System.out.println("Discount = " + discount);
        System.out.println("Total Bill = " + bill);

        sc.close();
    }
}
