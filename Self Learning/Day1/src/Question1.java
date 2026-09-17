package Day1.src;
//1. Write a program to calculate the total bill amount after applying a
//discount based on the purchase amount.
public class Question1 {
	
	public static double totalBill(double MRP, double disPercent) {
		double disAmount = (MRP * (disPercent / 100));
		double totalBill = (MRP - disAmount);
		System.out.println(totalBill);
		return totalBill;
	}
	
	public static void main(String[] args) {
		
		totalBill(70, 18);
	}

}
