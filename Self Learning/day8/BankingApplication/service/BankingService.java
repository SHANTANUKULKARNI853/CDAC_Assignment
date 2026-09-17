package day8.BankingApplication.service;

import day8.BankingApplication.exception.*;
//import exception.InvalidInputException;
import day8.BankingApplication.model.*;

public class BankingService {

    public void validateAccount(Account account) {

        if (account == null) {
            throw new InvalidInputException(
                    "Account cannot be null.");
        }

        if (account.getAccountNumber() <= 0) {
            throw new InvalidInputException(
                    "Invalid account number.");
        }

        if (account.getName() == null
                || account.getName().trim().isEmpty()) {
            throw new InvalidInputException(
                    "Invalid account name.");
        }
    }

    public void withdraw(Account account, double amount)
            throws InsufficientBalanceException {

        validateAccount(account);

        if (amount <= 0) {
            throw new InvalidInputException(
                    "Amount must be greater than zero.");
        }

        if (amount > account.getBalance()) {
            throw new InsufficientBalanceException(
                    "Insufficient balance.");
        }

        account.setBalance(
                account.getBalance() - amount);

        System.out.println("Withdrawal successful.");
        System.out.println(
                "Remaining balance: "
                + account.getBalance());
    }

    public void deposit(Account account, double amount) {

        validateAccount(account);

        if (amount <= 0) {
            throw new InvalidInputException(
                    "Amount must be greater than zero.");
        }

        account.setBalance(
                account.getBalance() + amount);

        System.out.println("Deposit successful.");
        System.out.println(
                "Current balance: "
                + account.getBalance());
    }
}
