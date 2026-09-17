//3) Accept String from user and display nu of vowels present in that String 
//display count of each vowel 
package Assignment;

import java.util.Scanner;

class Q4VowelCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String:");
        String str = sc.nextLine();

        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;

        for (int j = 0; j < str.length(); j++) {

            char ch = Character.toLowerCase(str.charAt(j));

            if (ch == 'a') {
                a++;
            }
            else if (ch == 'e') {
                e++;
            }
            else if (ch == 'i') {
                i++;
            }
            else if (ch == 'o') {
                o++;
            }
            else if (ch == 'u') {
                u++;
            }
        }

        int total = a + e + i + o + u;

        System.out.println("Total Vowels = " + total);
        System.out.println("A = " + a);
        System.out.println("E = " + e);
        System.out.println("I = " + i);
        System.out.println("O = " + o);
        System.out.println("U = " + u);

        sc.close();
    }
}
