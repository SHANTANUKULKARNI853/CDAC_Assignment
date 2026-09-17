package day12.LambdaDemo.test;

/*
Create custom Functional Interfaces and implement them
using Lambda Expressions.
*/



import day12.LambdaDemo.functional.*;
import day12.LambdaDemo.functional.*;
import day12.LambdaDemo.functional.*;

public class Test {

    public static void main(String[] args) {

        Calculator add =
                (a, b) -> a + b;

        Calculator multiply =
                (a, b) -> a * b;

        Message message =
                name -> System.out.println(
                        "Hello " + name);

        CheckNumber even =
                number -> number % 2 == 0;

        System.out.println(
                "Addition: " + add.calculate(10, 20));

        System.out.println(
                "Multiplication: "
                + multiply.calculate(10, 20));

        message.show("Rahul");

        System.out.println(
                "Is 10 even? " + even.check(10));
    }
}
