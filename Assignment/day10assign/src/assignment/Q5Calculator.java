/*create Calculator class which contains 4 methods to perform addition , subtraction , division and multiplication 

Write a Service class which accept data from user and menu driven program to accept a choice from user for operation 

While entering data if user enter other than number then handle the NumberFormatException

Inside division method handle ArithmeticException 

Explore Try , catch , finally and throws */
package assignment;

class Q5Calculator {

    int addition(int a, int b) {
        return a + b;
    }

    int subtraction(int a, int b) {
        return a - b;
    }

    int multiplication(int a, int b) {
        return a * b;
    }

    int division(int a, int b) throws ArithmeticException {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
    }
}
