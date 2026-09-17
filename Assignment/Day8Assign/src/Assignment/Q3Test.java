/*Create Shape Hireachy  
	Shape
Circle         Sqaure    Rectangle 
and use Employee hireachy 
as discussed in class declare Printable interface with print() method and implement in SalariedEmployee , Circle and Sqaure class 
and call from Test class showData method
*/


package Assignment;

class Q3Test {

    static void showData(Printable p) {
        p.print();
    }

    public static void main(String[] args) {

        Q3SalariedEmployee e = new Q3SalariedEmployee(101, "Shantanu", 50000);
        Circle c = new Circle(5);
        Square s = new Square(10);
        Rectangle r = new Rectangle(10, 5);

        showData(e);

        System.out.println();

        showData(c);

        System.out.println();

        showData(s);

        System.out.println();

        r.showData();
    }
}
