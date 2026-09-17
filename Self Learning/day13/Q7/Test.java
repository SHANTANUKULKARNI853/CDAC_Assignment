package day13.Q7;

public class Test {

    public static void main(String[] args) {

        Thread t1 = new Thread() {

            public void run() {

                for (int i = 1; i <= 5; i++) {
                    System.out.println("Thread 1: " + i);
                }
            }
        };


        Thread t2 = new Thread() {

            public void run() {

                for (int i = 1; i <= 5; i++) {
                    System.out.println("Thread 2: " + i);
                }
            }
        };


        Thread t3 = new Thread() {

            public void run() {

                for (int i = 1; i <= 5; i++) {
                    System.out.println("Thread 3: " + i);
                }
            }
        };


        t1.start();
        t2.start();
        t3.start();
    }
}
