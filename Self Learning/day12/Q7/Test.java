package day12.Q7;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Test {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        // reduce() - calculate sum
        int sum = numbers.stream()
                         .reduce(0, (a, b) -> a + b);

        System.out.println("Sum: " + sum);


        // count() - count elements
        long count = numbers.stream()
                            .count();

        System.out.println("Count: " + count);


        // min() - find minimum
        Optional<Integer> min = numbers.stream()
                                       .min((a, b) -> a.compareTo(b));

        System.out.println("Minimum: " + min.get());


        // max() - find maximum
        Optional<Integer> max = numbers.stream()
                                       .max((a, b) -> a.compareTo(b));

        System.out.println("Maximum: " + max.get());
    }
}
