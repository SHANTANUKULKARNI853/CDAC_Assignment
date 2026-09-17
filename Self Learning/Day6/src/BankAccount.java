package Day6.src;
public class BankAccount {
	private int accNum;
	private String name;
	private int balance;
	
	public BankAccount(int accNum, String name, int balance) {
		this.accNum = accNum;
		this.name = name;
		this.balance = balance;
	}
	
	class AccountDetails{
		public void display() {
			System.out.println(accNum);
			System.out.println(name);
			System.out.println(balance);
		}
		
	}
}
