package day13.Q4;

public class Test {

    static class SharedData {

        int value;
        boolean available = false;

        synchronized void produce(int value) {

            this.value = value;
            available = true;

            System.out.println("Produced: " + value);

            notify();
        }

        synchronized void consume() {

            while (!available) {
                try {
                    System.out.println("Consumer waiting...");
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("Consumed: " + value);
            available = false;
        }

        synchronized void notifyAllThreads() {
            notifyAll();
        }
    }

    public static void main(String[] args) {

        SharedData data = new SharedData();

        Thread consumer = new Thread(() -> {
            data.consume();
        });

        Thread producer = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            data.produce(100);
        });

        consumer.start();
        producer.start();
    }
}
