package day8.BankingApplication.test;


/*
Develop a simple banking application that:
i. Validates account operations
ii. Uses custom checked exceptions for insufficient balance
iii. Uses custom unchecked exceptions for invalid input
iv. Demonstrates exception propagation
v. Uses throw, throws, try-catch-finally, and multi-catch blocks
*/

import java.util.InputMismatchException;
import java.util.Scanner;

import day8.BankingApplication.exception.*;
//import exception.InvalidInputException;
import day8.BankingApplication.model.*;
import day8.BankingApplication.service.*;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankingService service = new BankingService();

        Account account =
                new Account(101, "Rahul", 50000);

        try {

            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");

            System.out.println("Enter choice:");
            int choice = sc.nextInt();

            System.out.println("Enter amount:");
            double amount = sc.nextDouble();

            if (choice == 1) {

                service.deposit(account, amount);

            } else if (choice == 2) {

                service.withdraw(account, amount);

            } else {

                throw new InvalidInputException(
                        "Invalid operation.");
            }

        } catch (InsufficientBalanceException
                | InvalidInputException
                | InputMismatchException e) {

            System.out.println(
                    "Error: " + e.getMessage());

        } finally {

            System.out.println(
                    "Banking operation completed.");

            sc.close();
        }
    }
}
