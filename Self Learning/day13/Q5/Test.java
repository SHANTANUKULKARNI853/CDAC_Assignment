package day13.Q5;

public class Test {

    static InheritableThreadLocal<String> user =
            new InheritableThreadLocal<String>();

    public static void main(String[] args) {

        user.set("Rahul");

        System.out.println("Main Thread: " + user.get());

        Thread t1 = new Thread(() -> {

            System.out.println("Child Thread: " + user.get());

            user.set("Amit");

            System.out.println("Child Thread after change: " + user.get());
        });

        t1.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main Thread after child change: " + user.get());
    }
}
