package Assignment;

class Rectangle extends Q3Shape {
    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void showData() {
        System.out.println("Rectangle");
        System.out.println("Length = " + length);
        System.out.println("Breadth = " + breadth);
        System.out.println("Area = " + (length * breadth));
    }
}
