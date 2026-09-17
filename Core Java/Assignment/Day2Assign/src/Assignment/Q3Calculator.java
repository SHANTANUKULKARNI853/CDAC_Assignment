/*create Calculator accept 3 command line arguments and display 
 * appropriate output using Switch case */


package Assignment;

class Q3Calculator {

    public static void main(String[] args) {

        int num1 = Integer.parseInt(args[0]);
        String operator = args[1];
        int num2 = Integer.parseInt(args[2]);

        switch (operator) {

            case "+":
                System.out.println("Addition = " + (num1 + num2));
                break;

            case "-":
                System.out.println("Subtraction = " + (num1 - num2));
                break;

            case "*":
                System.out.println("Multiplication = " + (num1 * num2));
                break;

            case "/":
                System.out.println("Division = " + (num1 / num2));
                break;

            case "%":
                System.out.println("Modulus = " + (num1 % num2));
                break;

            default:
                System.out.println("Invalid Operator");
        }
    }
}