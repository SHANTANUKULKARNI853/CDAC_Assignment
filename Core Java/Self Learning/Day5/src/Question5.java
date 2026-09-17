package Day5.src;//5. Write a program to count special character in a String.

public class Question5 {

	public static void main(String[] args) {
		String specialChar = "!@#$%^&*";
		String str = "Hello@%^&wolrd";
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			for(int j=0; j<specialChar.length(); j++) {
				if(str.charAt(i) == specialChar.charAt(j)) {
					count++;
				}
			}
		} System.out.println(count);
	}

}
