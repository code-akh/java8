package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsMap {
    public static void main(String args[]) {

        List<String> list = Arrays.asList("a", "b", "c");
        List<String> mappedList = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        mappedList.forEach(System.out::println);

        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(5, "Fifth", 33, 33000f));
        empList.add(new Employee(2, "Second", 25, 25000f));
        empList.add(new Employee(4, "Fourth", 30, 30000f));
        empList.add(new Employee(3, "Third", 28, 28000f));
        empList.add(new Employee(1, "First", 20, 20000f));

        List<EmployeeDTO> empDtoList = new ArrayList<>();

        for (Employee emp : empList) {
            empDtoList.add(new EmployeeDTO(emp.getId(), emp.getName(), emp.getAge()));
        }

        empDtoList.forEach(System.out::println);

        System.out.println("**********");

        empList.stream().map(new Function<Employee, EmployeeDTO>() {
            @Override
            public EmployeeDTO apply(Employee emp){
                return new EmployeeDTO(emp.getId(), emp.getName(), emp.getAge());
            }
        }).forEach(empDto -> System.out.println(empDto));

        System.out.println("**********");

        List<EmployeeDTO> dtoList = empList.stream().
                map(emp -> new EmployeeDTO(emp.getId(), emp.getName(), emp.getAge())).
                collect(Collectors.toList());

        dtoList.forEach(System.out::println);
    }
}
