package Assignment;

class Circle extends Q3Shape implements Printable {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public void print() {
        System.out.println("Circle");
        System.out.println("Radius = " + radius);
        System.out.println("Area = " + (3.14 * radius * radius));
    }
}
