package Day5.src;//4. Write a program to find out duplicate character. 

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Programming";
		for(int i=0; i<str.length(); i++) {
			for(int j=i+1; j<str.length(); j++) {
				if(str.charAt(i) == str.charAt(j)) {
					System.out.println(str.charAt(i));
				}
			}
		}
	}

}
