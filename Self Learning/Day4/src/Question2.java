package Day4.src;//2. Demonstrate autoboxing and auto-unboxing

public class Question2 {

    public static void main(String[] args) {

        int num = 20;

        // Autoboxing
        Integer obj = num;

        System.out.println("Autoboxed value = " + obj);

        // Auto-unboxing
        int value = obj;

        System.out.println("Auto-unboxed value = " + value);
    }
}
