package Assignment;

class Square extends Q3Shape implements Printable {
    double side;

    Square(double side) {
        this.side = side;
    }

    public void print() {
        System.out.println("Square");
        System.out.println("Side = " + side);
        System.out.println("Area = " + (side * side));
    }
}
