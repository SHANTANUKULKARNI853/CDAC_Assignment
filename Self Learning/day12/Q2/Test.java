package day12.Q2;

/*
Use Predicate, Function, Consumer, and Supplier
interfaces in a program.
*/

import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Test {

    public static void main(String[] args) {

        Predicate<Integer> checkEven =
                number -> number % 2 == 0;

        Function<Integer, Integer> square =
                number -> number * number;

        Consumer<String> display =
                name -> System.out.println(
                        "Student Name: " + name);

        Supplier<String> message =
                () -> "Welcome to Student Management System";

        System.out.println(
                "Is 10 even? "
                + checkEven.test(10));

        System.out.println(
                "Square of 5: "
                + square.apply(5));

        display.accept("Rahul");

        System.out.println(
                message.get());
    }
}
