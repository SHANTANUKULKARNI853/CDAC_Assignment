package day7.OnlineBooking.service;


import day7.OnlineBooking.dao.*;
import day7.OnlineBooking.exception.*;
import day7.OnlineBooking.exception.*;
import day7.OnlineBooking.exception.*;
import day7.OnlineBooking.model.*;

public class BankingService {

    AccountDAO dao = new AccountDAO();

    public void addAccount(Account account) {
        dao.addAccount(account);
    }

    public void withdraw(int accountNumber, double amount)
            throws InvalidAccountException,
            InvalidAmountException,
            InsufficientBalanceException {

        Account account = dao.findAccount(accountNumber);

        if (account == null) {
            throw new InvalidAccountException(
                    "Invalid account number.");
        }

        if (amount <= 0) {
            throw new InvalidAmountException(
                    "Amount must be greater than zero.");
        }

        if (amount > account.getBalance()) {
            throw new InsufficientBalanceException(
                    "Insufficient balance.");
        }

        account.setBalance(account.getBalance() - amount);

        System.out.println("Withdrawal successful.");
        System.out.println("Remaining balance: "
                + account.getBalance());
    }

    public void transfer(int fromAccount,
                         int toAccount,
                         double amount)
            throws InvalidAccountException,
            InvalidAmountException,
            InsufficientBalanceException {

        Account sender = dao.findAccount(fromAccount);
        Account receiver = dao.findAccount(toAccount);

        if (sender == null) {
            throw new InvalidAccountException(
                    "Invalid sender account number.");
        }

        if (receiver == null) {
            throw new InvalidAccountException(
                    "Invalid receiver account number.");
        }

        if (amount <= 0) {
            throw new InvalidAmountException(
                    "Amount must be greater than zero.");
        }

        if (amount > sender.getBalance()) {
            throw new InsufficientBalanceException(
                    "Insufficient funds for transfer.");
        }

        sender.setBalance(sender.getBalance() - amount);
        receiver.setBalance(receiver.getBalance() + amount);

        System.out.println("Transfer successful.");
        System.out.println("Remaining balance: "
                + sender.getBalance());
    }

    public void displayAccounts() {

        for (Account account : dao.getAccounts()) {
            account.display();
            System.out.println("-------------------");
        }
    }
}
