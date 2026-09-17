/*
Assignments 
1) Print number 1 to 100 
if number multiple of 3 then print fizz
if number multiple of 5 then print buzz
if number multiple of 3  & 5 then print fizzbuzz

else print number */

package Assignment;

class Q1FizzBuzz {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz");
            }
            else if (i % 3 == 0) {
                System.out.println("fizz");
            }
            else if (i % 5 == 0) {
                System.out.println("buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
