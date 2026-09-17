package Assignment;

class Q2EvenSum {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i < args.length; i++) {
            int n = Integer.parseInt(args[i]);

            if (n % 2 == 0) {
                sum = sum + n;
            }
        }

        System.out.println("Addition of even numbers = " + sum);
    }
}
