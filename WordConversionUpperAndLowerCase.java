package com.athena.java_practice2.collection;

import java.util.Arrays;
import java.util.List;


public class WordConversionUpperAndLowerCase {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple", "Banana", "Mango", "Cherry", "Orange");

        List<String> upperCase = words.stream()
                .map(str -> str.toUpperCase())
                        .toList();

        System.out.println("Uppercase---> " + upperCase);


        List<String> lowerCase = words.stream()
                .map(String::toLowerCase)     // same above logic but this time using method reference and str here will not work as str is not a class
                .toList();

        System.out.println("Lowercase---> " + lowerCase);
    }
}


// Output

Uppercase---> [APPLE, BANANA, MANGO, CHERRY, ORANGE]
Lowercase---> [apple, banana, mango, cherry, orange]
