package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsSort {

    public static void main(String args[]) {

        List<String> list = Arrays.asList("Mango", "Apple", "Kiwi", "Banana");

        List<String> ascList = list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        ascList.forEach(System.out::println);

        System.out.println("**********");

        list.stream().sorted((o1, o2) -> o1.compareTo(o2)).forEach(System.out::println);

        System.out.println("**********");

        List<String> descList = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        descList.forEach(System.out::println);

        System.out.println("**********");

        list.stream().sorted((o1, o2) -> o2.compareTo(o1)).forEach(System.out::println);

        System.out.println("**********");

        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(5, "Fifth", 33, 33000f));
        empList.add(new Employee(2, "Second", 25, 25000f));
        empList.add(new Employee(4, "Fourth", 30, 30000f));
        empList.add(new Employee(3, "Third", 28, 28000f));
        empList.add(new Employee(1, "First", 20, 20000f));

        List<Employee> sortedList = empList.stream().sorted(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int)(o1.getSalary() - o2.getSalary());
            }
        }).collect(Collectors.toList());
        sortedList.forEach(System.out::println);

        System.out.println("**********");

        List<Employee> sortList = empList.stream()
                .sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary()))
                .collect(Collectors.toList());
        sortList.forEach(System.out::println);

        System.out.println("**********");

        List<Employee> sortList1 = empList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary))
                .collect(Collectors.toList());
        sortList1.forEach(System.out::println);

        System.out.println("**********");

        List<Employee> sortList2 = empList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .collect(Collectors.toList());
        sortList2.forEach(System.out::println);

        System.out.println("**********");

        List<Employee> sortList3 = empList.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());
        sortList3.forEach(System.out::println);
    }
}
