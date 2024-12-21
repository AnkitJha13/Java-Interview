package com.athena.java_practice2.collection;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Product{
    private String name;
    private String category;

    public Product(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}


public class GroupingProductsExample {
    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
                new Product("Laptop", "Electronics"),
                new Product("Shirt", "Clothing"),
                new Product("Phone", "Electronics"),
                new Product("Jeans", "Clothing")
        );

        Map<String, List<Product>> mpp = products.stream()
                .collect(Collectors.groupingBy(product -> product.getCategory()));


        System.out.println(mpp);
    }
}


// Output

{Clothing=[Product{name='Shirt', category='Clothing'}, Product{name='Jeans', category='Clothing'}],
 Electronics=[Product{name='Laptop', category='Electronics'}, Product{name='Phone', category='Electronics'}]}
