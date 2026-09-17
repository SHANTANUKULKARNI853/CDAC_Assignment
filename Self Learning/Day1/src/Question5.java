package Day1.src;
//5. Print different patterns of asterisk (*) using loops (e.g. triangle of *)
public class Question5 {
	
	public static void main(String[] args) {
		int rows = 4;
		for (int i=0; i<=rows; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}System.out.println();
		}
		
		System.out.println();
		
		for (int i=rows; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}System.out.println();
		}
		
	}

}
