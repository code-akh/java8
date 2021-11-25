package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsFind {

    //ifPresent returns Optional
    //isPresent returns boolean

    public static void main(String args[]) {

        List<Integer> intList = Arrays.asList(7, 6, 1, 9, 8);

        Optional<Integer> firstItem = intList.stream().findFirst();
        if(firstItem.isPresent()) {                             //Traditional if check
            System.out.println(firstItem.get());
        }

        intList.stream().findFirst().ifPresent(firstElement -> System.out.println(firstElement));  // lambda expn
        intList.stream().findFirst().ifPresent(System.out::println);                         // Method reference

        System.out.println("***********");

        Optional<Integer> anyItem = intList.stream().findAny();
        System.out.println(anyItem.orElse(0));      // Functional style instead of Traditional If Check

        intList.stream().findAny().ifPresent(anyElement -> System.out.println(anyElement));  // lambda expn
        intList.stream().findAny().ifPresent(System.out::println);                           // Method reference

        System.out.println("***********");

        System.out.println(intList.stream().findAny().isPresent());     // sPresent returns boolean
    }
}
