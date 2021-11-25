package com.streams;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamsAggregate {

    // min, max, count

    public static void main(String args[]) {

        Stream<Integer> stream = Stream.of(7, 8, 4, 5, 1, 2, 9, 6, 3);
        System.out.println(stream.count());

        Integer min = Stream.of(7, 8, 4, 5, 1, 2, 9, 6, 3).min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(min);

        Integer max = Stream.of(7, 8, 4, 5, 1, 2, 9, 6, 3).max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(max);

    }
}
