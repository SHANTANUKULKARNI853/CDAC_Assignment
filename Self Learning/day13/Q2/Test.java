package day13.Q2;

public class Test {

    static class MyThread extends Thread {

        String task;

        MyThread(String task) {
            this.task = task;
        }

        public void run() {

            if (task.equals("print")) {
                for (int i = 1; i <= 5; i++) {
                    System.out.println(Thread.currentThread().getName()
                            + " printing: " + i);
                }
            }

            if (task.equals("message")) {
                for (int i = 1; i <= 5; i++) {
                    System.out.println(Thread.currentThread().getName()
                            + " showing message");
                }
            }
        }
    }

    public static void main(String[] args) {

        // Same task
        MyThread t1 = new MyThread("print");
        MyThread t2 = new MyThread("print");
        MyThread t3 = new MyThread("print");

        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t3.setName("Thread-3");

        t1.start();
        t2.start();
        t3.start();


        // Different tasks
        MyThread t4 = new MyThread("print");
        MyThread t5 = new MyThread("message");

        t4.setName("Thread-4");
        t5.setName("Thread-5");

        t4.start();
        t5.start();
    }
}
