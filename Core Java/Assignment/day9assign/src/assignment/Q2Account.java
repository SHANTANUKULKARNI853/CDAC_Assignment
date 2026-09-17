package assignment;

class Q2Account {

    int accId;
    String holderName;
    double balance;

    Q2Account(int accId, String holderName, double balance) {
        this.accId = accId;
        this.holderName = holderName;
        this.balance = balance;
    }

    class Locker {

        int lockerId;
        int duration;

        Locker(int lockerId, int duration) {
            this.lockerId = lockerId;
            this.duration = duration;
        }

        void showData() {

            System.out.println("Account ID = " + accId);
            System.out.println("Holder Name = " + holderName);
            System.out.println("Balance = " + balance);

            System.out.println("Locker ID = " + lockerId);
            System.out.println("Duration = " + duration);
        }
    }
}