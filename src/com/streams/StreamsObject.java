package com.streams;

import java.util.*;
import java.util.stream.Stream;

public class StreamsObject {

    public static void main(String args[]) {

        Stream<String> stream = Stream.of("a", "b", "c");
        stream.forEach(System.out::println);

        System.out.println("**********");

        Collection<String> collection = Arrays.asList("a", "b", "c");
        Stream<String> stream1 = collection.stream();
        stream1.forEach(System.out::println);

        System.out.println("**********");

        List<String> list = Arrays.asList("bcd", "abc", "cde", "abc");
        Stream<String> stream2 = list.stream();
        stream2.forEach(System.out::println);

        System.out.println("**********");

        Set<String> set = new HashSet<>(list);
        Stream<String> stream3 = set.stream();
        stream3.forEach(System.out::println);

        System.out.println("**********");

        String[] arr = new String[] {"a", "b", "c"};
        Stream<String> stream4 = Stream.of(arr);
        stream4.forEach(System.out::println);

    }
}
