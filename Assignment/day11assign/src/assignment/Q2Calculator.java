package assignment;

class Q2Calculator {

    int addition(int a, int b) {
        return a + b;
    }

    int subtraction(int a, int b) {
        return a - b;
    }

    int multiplication(int a, int b) {
        return a * b;
    }

    int division(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
    }
}