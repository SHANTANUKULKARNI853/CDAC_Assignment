//write a class to create single instance of that class
package assignment;

class Q1Test {

    public static void main(String[] args) {

        Q1 s1 = Q1.getInstance();
        Q1 s2 = Q1.getInstance();

        s1.showData();

        if (s1 == s2) {
            System.out.println("Both objects are same");
        }
    }
}
