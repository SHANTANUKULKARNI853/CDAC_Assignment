package Day6.src;//4. Anonymous Inner Class – Shape
//Create an interface Shape containing a method calculateArea().
//Write a Java program using an anonymous inner class to implement
//the Shape interface for calculating the area of a rectangle.
//Accept the length and breadth from the user and display the calculated area.

import java.util.Scanner;

public class Question4 {

    interface Shape {
        double calculateArea();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double breadth = sc.nextDouble();

        Shape s = new Shape() {

            @Override
            public double calculateArea() {
                return length * breadth;
            }
        };

        double area = s.calculateArea();

        System.out.println("Area of Rectangle = " + area);

        sc.close();
    }
}
