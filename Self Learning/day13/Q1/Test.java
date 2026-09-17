package day13.Q1;

public class Test {

    static class MyThread extends Thread {

        String name;

        MyThread(String name) {
            this.name = name;
        }

        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(name + " : " + i);
            }
        }
    }


    static class MyRunnable implements Runnable {

        String name;

        MyRunnable(String name) {
            this.name = name;
        }

        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(name + " : " + i);
            }
        }
    }


    public static void main(String[] args) {

        MyThread t1 = new MyThread("Thread-1");
        MyThread t2 = new MyThread("Thread-2");

        MyRunnable r1 = new MyRunnable("Runnable-1");
        MyRunnable r2 = new MyRunnable("Runnable-2");

        Thread t3 = new Thread(r1);
        Thread t4 = new Thread(r2);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
