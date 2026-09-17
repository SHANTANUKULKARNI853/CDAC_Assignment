/* 
5) Accept String from user and Display number of vowels present in that String 

Also display count of each vowel 

E.g. My name is Dilip 

Vowel count 5 

a - 1
e - 1
i - 3*/

package Assignment;

import java.util.Scanner;

class Q5VowelCount {

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

        System.out.println("Vowel count = " + total);

        System.out.println("a - " + a);
        System.out.println("e - " + e);
        System.out.println("i - " + i);
        System.out.println("o - " + o);
        System.out.println("u - " + u);

        sc.close();
    }
}
