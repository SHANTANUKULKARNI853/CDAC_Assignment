/*create class Account with variables id , balance 

Write Withdraw method with amount to be withdraw 

If minimum balance is not maitain then throw the Exception from that method*/
package assignment;

class Q6Account {

    int id;
    double balance;

    Q6Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    void withdraw(double amount) throws Exception {

        if (balance - amount < 1000) {
            throw new Exception("Minimum balance must be maintained");
        }

        balance = balance - amount;

        System.out.println("Withdrawal successful");
        System.out.println("Remaining Balance = " + balance);
    }
}
