package day12.Q5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {

        // Stream from Collection
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        Stream<Integer> collectionStream = numbers.stream();

        System.out.println("Stream from Collection:");
        collectionStream.forEach(n -> System.out.println(n));


        // Stream from Array
        int[] marks = {70, 80, 90, 85, 95};

        Stream<Integer> arrayStream = Arrays.stream(marks)
                                             .boxed();

        System.out.println("Stream from Array:");
        arrayStream.forEach(n -> System.out.println(n));
    }
}
