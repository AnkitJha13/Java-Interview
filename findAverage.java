package com.athena.java_practice2.collection;

import java.util.Arrays;
import java.util.List;

public class findAverage {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        double average = numbers.stream() // convert the list to stream
                .mapToInt(num -> num.intValue()) // convert the Integer wrapper to int 
                .average() // then find average
                .getAsDouble();  // average returns Optional Double


        System.out.println("Average is --> " + average);
    }
}


// Output

Average is --> 30.0
