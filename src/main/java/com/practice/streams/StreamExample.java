package com.practice.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " (Price: $" + price + ")";
    }
}

public class StreamExample {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 999.99));
        products.add(new Product("Phone", 799.49));
        products.add(new Product("Tablet", 399.99));
        products.add(new Product("Smart Watch", 199.99));
        products.add(new Product("Headphones", 149.99));

        // Filter products with price > 500
        List<Product> expensiveProducts = products.stream()
                .filter(p -> p.getPrice() > 500)
                .collect(Collectors.toList());

        System.out.println("Expensive Products:");
        expensiveProducts.forEach(System.out::println);

        // Map product names to a list
        List<String> productNames = products.stream()
                .map(Product::getName)
                .collect(Collectors.toList());

        System.out.println("\nProduct Names:");
        productNames.forEach(System.out::println);

        // Calculate total cost of all products
        double totalCost = products.stream()
                .mapToDouble(Product::getPrice)
                .sum();

        System.out.println("\nTotal Cost of All Products: $" + totalCost);
    }
}
