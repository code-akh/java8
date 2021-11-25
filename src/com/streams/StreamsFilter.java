package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilter {

    public static void main(String args[]) {

        List<Product> list = new ArrayList<>();

        for (Product p : getProducts()) {
            if(p.getPrice() > 30000f) {
                list.add(p);
            }
        }
        list.forEach(System.out::println);

        System.out.println("**********");

        List<Product> streamList = getProducts().stream()
                .filter(product -> product.getPrice() > 30000f)
                .collect(Collectors.toList());
        streamList.forEach(System.out::println);

        System.out.println("**********");

        getProducts().stream()
                .filter(product -> product.getPrice() > 30000f)
                .forEach(System.out::println);
    }

    private static List<Product> getProducts() {

        List<Product> list = new ArrayList<>();
        list.add(new Product(1, "Product 1", 20000f));
        list.add(new Product(2, "Product 2", 30000f));
        list.add(new Product(3, "Product 3", 40000f));
        list.add(new Product(4, "Product 4", 50000f));
        list.add(new Product(5, "Product 5", 60000f));


        return list;
    }
}

class Product {

    private int id;
    private String name;
    private float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}