package Day1.src;
//4. Write a program to generate the Fibonacci series up to N terms.
public class Question4 {
	
	public static void Fibonacci(int n) {
		int first = 0;
		int second = 1;

		for (int i=1; i <=n; i++) {
			System.out.println(first);
			int third = first + second;
			
			first = second;
			second = third;
		}
	}
	
	public static void main(String[] args) {
		Fibonacci(10);
		
	}

}
