package Assignment;

class Q3PrimeNumbers {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            int n = Integer.parseInt(args[i]);
            int count = 0;

            for (int j = 1; j <= n; j++) {
                if (n % j == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println(n);
            }
        }
    }
}
