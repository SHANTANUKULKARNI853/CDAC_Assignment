/*
1) add 
getObject( Object O) 
method inside Employee and Salaried Employee class and call 
that from main function to understand covariance return type */


package Assignment;

class Q1Test {

    public static void main(String[] args) {

        Q1Employee e = new Q1Employee(101, "Shantanu");

        Q1Employee e1 = e.getObject(e);

        e1.display();

        System.out.println();

        Q1Salaried s = new Q1Salaried(102, "Rahul", 50000);

        Q1Salaried s1 = s.getObject(s);

        s1.display();
    }
}