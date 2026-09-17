package assignment;

import java.util.Scanner;

class Q6Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Q6Account account = new Q6Account(101, 5000);

        System.out.println("Enter amount to withdraw:");
        double amount = sc.nextDouble();

        try {

            account.withdraw(amount);

        } catch (Exception e) {

            System.out.println(e.getMessage());

        } finally {

            System.out.println("Transaction completed");
        }

        sc.close();
    }
}