package Day1.src;
//3. Write a program to check whether a number is an Armstrong number. 153
public class Question3 {
	public static void armstrong(int num) {
		int originalNum = num;
		double sum = 0;
		while(num != 0) {
			int temp = num % 10;
			sum += Math.pow(temp, 3);
			num = num / 10;
		}
		if(originalNum == sum) {
			System.out.println("the num is Armstrong " + originalNum);
		}else {
			System.out.println("the num is not Armstrong " + originalNum);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		armstrong(153);
	}

}
