package assignment;

class Q1Account {

    int id;
    double balance;

    Q1Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    void withdraw(double amount) throws MinimumBalanceException {

        if (balance - amount < 1000) {
            throw new MinimumBalanceException(
                    "Minimum balance of 1000 must be maintained");
        }

        balance = balance - amount;

        System.out.println("Withdrawal Successful");
        System.out.println("Remaining Balance = " + balance);
    }
}
