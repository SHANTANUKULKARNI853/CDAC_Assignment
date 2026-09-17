package Day4.src;//3. Use wrapper utility methods such as:
//i. parseInt()
//ii. parseDouble()
//iii. valueOf()
//iv. toString()
//v. compareTo()

public class Question3 {

    public static void main(String[] args) {

        // parseInt()
        String str1 = "100";
        int num = Integer.parseInt(str1);

        System.out.println("parseInt() = " + num);


        // parseDouble()
        String str2 = "25.50";
        double d = Double.parseDouble(str2);

        System.out.println("parseDouble() = " + d);


        // valueOf()
        Integer obj = Integer.valueOf("200");

        System.out.println("valueOf() = " + obj);


        // toString()
        String str3 = obj.toString();

        System.out.println("toString() = " + str3);


        // compareTo()
        Integer a = 10;
        Integer b = 20;

        System.out.println("compareTo() = " + a.compareTo(b));
    }
}