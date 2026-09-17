//1. Demonstrate boxing and unboxing
package Day4.src;
public class Question1 {

    public static void main(String[] args) {

        int num = 10;

        // Boxing
        Integer obj = Integer.valueOf(num);

        System.out.println("Primitive value = " + num);
        System.out.println("Wrapper object = " + obj);

        // Unboxing
        int value = obj.intValue();

        System.out.println("Unboxed value = " + value);
    }
}
