/*
Use account class create in the previous lab  use user defined exception class */

package assignment;

import java.util.Scanner;

class Q1Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Q1Account account = new Q1Account(101, 5000);

        System.out.println("Enter amount to withdraw:");
        double amount = sc.nextDouble();

        try {

            account.withdraw(amount);

        } catch (MinimumBalanceException e) {

            System.out.println(e.getMessage());

        } finally {

            System.out.println("Transaction completed");
        }

        sc.close();
    }
}
