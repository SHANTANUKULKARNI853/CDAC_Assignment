package Day1.src;
//6. Write a program to find principal diagonal sum of a matrix.
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[3][3];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = i;
				System.out.print(arr[i][j]);
			}System.out.println();
		}
		
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i][i];
		}
		System.out.println("diagonal sum " + sum);
	}

}
