//check the System.gc() working 
package Assignment;

class Q1Test {

    protected void finalize() {
        System.out.println("Garbage Collector called");
    }

    public static void main(String[] args) {

        Q1Test t1 = new Q1Test();
        Q1Test t2 = new Q1Test();
        Q1Test t3 = new Q1Test();

        t1 = null;
        t2 = null;
        t3 = null;

        System.gc();

        System.out.println("End of main");
    }
}
