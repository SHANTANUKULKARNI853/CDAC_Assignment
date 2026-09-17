package day7.OnlineBooking.test;

/*
Online Banking System

Develop a Java program for an Online Banking System that allows users to
withdraw and transfer money.

The program should handle the following exceptions:
Attempting to withdraw an amount greater than the available balance.
Entering a negative or zero amount.
Entering an invalid account number.
Attempting to transfer money when the account has insufficient funds.

Create and use custom exceptions where appropriate.
*/

import java.util.Scanner;

import day7.OnlineBooking.exception.*;
//import exception.InvalidAccountException;
//import exception.InvalidAmountException;
import day7.OnlineBooking.model.*;
import day7.OnlineBooking.service.*;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankingService service = new BankingService();

        service.addAccount(
                new Account(101, "Rahul", 50000));

        service.addAccount(
                new Account(102, "Amit", 30000));

        while (true) {

            System.out.println("\n1. Display Accounts");
            System.out.println("2. Withdraw");
            System.out.println("3. Transfer");
            System.out.println("4. Exit");

            System.out.println("Enter choice:");
            int choice = sc.nextInt();

            try {

                switch (choice) {

                case 1:

                    service.displayAccounts();
                    break;

                case 2:

                    System.out.println("Enter account number:");
                    int accountNumber = sc.nextInt();

                    System.out.println("Enter amount:");
                    double amount = sc.nextDouble();

                    service.withdraw(accountNumber, amount);

                    break;

                case 3:

                    System.out.println("Enter sender account:");
                    int sender = sc.nextInt();

                    System.out.println("Enter receiver account:");
                    int receiver = sc.nextInt();

                    System.out.println("Enter amount:");
                    amount = sc.nextDouble();

                    service.transfer(
                            sender,
                            receiver,
                            amount);

                    break;

                case 4:

                    System.out.println("Program ended.");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid choice.");
                }

            } catch (InvalidAccountException e) {

                System.out.println(e.getMessage());

            } catch (InvalidAmountException e) {

                System.out.println(e.getMessage());

            } catch (InsufficientBalanceException e) {

                System.out.println(e.getMessage());

            } catch (Exception e) {

                System.out.println("Invalid input.");
                sc.nextLine();
            }
        }
    }
}
