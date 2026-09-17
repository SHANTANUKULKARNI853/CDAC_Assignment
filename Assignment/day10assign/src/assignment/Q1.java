package assignment;

class Q1 {

    private static Q1 obj;

    private Q1() {
    }

    static Q1 getInstance() {

        if (obj == null) {
            obj = new Q1();
        }

        return obj;
    }

    void showData() {
        System.out.println("Single object created");
    }
}
