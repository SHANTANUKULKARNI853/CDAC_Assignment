package Day5.src;//2. Write a program to check number is positive , negative or zero.
import java.util.*;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num");
		int num =  sc.nextInt();
		
		if (num > 0 ) {
			System.out.println("the number is positive");
		}
		else if (num < 0 ) {
			System.out.println("the number is negative");
		}
		else {
			System.out.println("the number is zero");
		}
		sc.close();
	}

}
