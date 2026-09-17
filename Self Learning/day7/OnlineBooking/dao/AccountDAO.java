package day7.OnlineBooking.dao;

import java.util.ArrayList;
import day7.OnlineBooking.model.*;

public class AccountDAO {

    ArrayList<Account> accountList = new ArrayList<Account>();

    public void addAccount(Account account) {
        accountList.add(account);
    }

    public Account findAccount(int accountNumber) {

        for (Account account : accountList) {

            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }

        return null;
    }

    public ArrayList<Account> getAccounts() {
        return accountList;
    }
}
