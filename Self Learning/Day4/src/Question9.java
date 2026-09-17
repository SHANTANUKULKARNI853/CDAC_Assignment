package Day4.src;//9. Compare the behavior of String, StringBuffer, and StringBuilder.

public class Question9 {

    public static void main(String[] args) {

        // String
        String str = "Hello";

        str = str + " Java";

        System.out.println("String       : " + str);


        // StringBuffer
        StringBuffer sbf = new StringBuffer("Hello");

        sbf.append(" Java");

        System.out.println("StringBuffer : " + sbf);


        // StringBuilder
        StringBuilder sbd = new StringBuilder("Hello");

        sbd.append(" Java");

        System.out.println("StringBuilder: " + sbd);
    }
}
