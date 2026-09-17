package Day4.src;//7. Perform operations using:
//i. length()
//ii. charAt()
//iii. substring()
//iv. indexOf()
//v. contains()
//vi. replace()
//vii. split()
//viii. toUpperCase()
//ix. toLowerCase()
//x. trim()

public class Question7 {

    public static void main(String[] args) {

        String str = "  Hello Java World  ";

        // length()
        System.out.println("length = " + str.length());


        // charAt()
        System.out.println("charAt(2) = " + str.charAt(2));


        // substring()
        System.out.println("substring = " + str.substring(2, 7));


        // indexOf()
        System.out.println("indexOf = " + str.indexOf("Java"));


        // contains()
        System.out.println("contains = " + str.contains("Java"));


        // replace()
        System.out.println("replace = " + str.replace("Java", "Python"));


        // split()
        String names = "Ali,John,Rahul";

        String[] arr = names.split(",");

        System.out.println("split:");

        for (String name : arr) {
            System.out.println(name);
        }


        // toUpperCase()
        System.out.println("Uppercase = " + str.toUpperCase());


        // toLowerCase()
        System.out.println("Lowercase = " + str.toLowerCase());


        // trim()
        System.out.println("Trim = " + str.trim());
    }
}
