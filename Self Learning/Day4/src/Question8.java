package Day4.src;//8. Create programs demonstrating:
//i. append()
//ii. insert()
//iii. delete()
//iv. replace()
//v. reverse()

public class Question8 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");

        // append()
        sb.append(" Java");

        System.out.println("append()  : " + sb);


        // insert()
        sb.insert(6, "World ");

        System.out.println("insert()  : " + sb);


        // delete()
        sb.delete(6, 12);

        System.out.println("delete()  : " + sb);


        // replace()
        sb.replace(0, 5, "Hi");

        System.out.println("replace() : " + sb);


        // reverse()
        sb.reverse();

        System.out.println("reverse() : " + sb);
    }
}
