package Day1.src;
//2. Write a program to find the factorial of a number using a loop.
public class Question2 {
	
	public static void factorial(int num) {
		
		int factorial = 1;
		
		for(int i=1; i<=num; i++ ) {
			factorial *= i;
			
			}System.out.println(factorial);

		
	}
	
	public static void main(String[] args) {
		factorial(3);
	}

}
