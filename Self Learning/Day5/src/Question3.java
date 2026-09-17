package Day5.src;//3. Write a program to reverse given String. 

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello";
		char[] strChar = str.toCharArray();
		String reverse = "";
		for(int i=strChar.length - 1; i>=0; i-- ) {
			reverse += strChar[i];
		}
		System.out.println(reverse);
	}

}
