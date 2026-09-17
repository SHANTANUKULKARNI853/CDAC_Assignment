package day12.Q6;

import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35);

        System.out.println("Even Numbers:");

        numbers.stream()
               .filter(n -> n % 2 == 0)
               .forEach(n -> System.out.println(n));


        System.out.println("Squared Numbers:");

        numbers.stream()
               .map(n -> n * n)
               .forEach(n -> System.out.println(n));


        System.out.println("Even Numbers after Squaring:");

        numbers.stream()
               .filter(n -> n % 2 == 0)
               .map(n -> n * n)
               .forEach(n -> System.out.println(n));
    }
}
