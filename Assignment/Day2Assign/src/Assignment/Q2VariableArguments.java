/*Use Ellipses Parameter and 
	1) Display addition of numbers 
	2) Display addition of Even numbers 
	3) Display addition of Odd numbers */
package Assignment;

class Q2VariableArguments {

    static void addition(int... numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        System.out.println("Addition = " + sum);
    }

    static void additionEven(int... numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum = sum + numbers[i];
            }
        }

        System.out.println("Addition of Even Numbers = " + sum);
    }

    static void additionOdd(int... numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                sum = sum + numbers[i];
            }
        }

        System.out.println("Addition of Odd Numbers = " + sum);
    }

    public static void main(String[] args) {

        addition(10, 15, 20, 25, 30, 35);

        additionEven(10, 15, 20, 25, 30, 35);

        additionOdd(10, 15, 20, 25, 30, 35);
    }
}
