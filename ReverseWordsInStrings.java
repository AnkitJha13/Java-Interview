package com.athena.java_practice2.collection;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseString {

    public static void main(String[] args) {
        String input = "Hello Immortal Soul";

        String result = Arrays.stream(input.split(" "))  //  Split the Input String into Words and Convert the Array into a Stream
                .map(word -> new StringBuilder(word).reverse().toString()) // map processes each word in stream and Reverse it using StringBuilder(word).reverse() and .toString() to convert it back into a String.
                .collect(Collectors.joining(" ")); // Collect the Result Using Collectors.joining(" ")

        System.out.println("Original Word is ---> " + input);
        System.out.println("Reversed Word is ---> " + result);

    }
}


// Output

Original Word is ---> Hello Immortal Soul
Reversed Word is ---> olleH latrommI luoS
