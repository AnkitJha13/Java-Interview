package com.athena.java_practice2.collection;

import java.util.Arrays;
import java.util.List;

public class MaxMinNumber {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

//        int mini = Integer.MAX_VALUE;       // for loop way
//
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) < mini) {
//                mini = list.get(i); // Update mini if a smaller value is found
//            }
//        }


        // stream way
        int min = list.stream() // first convert to stream
                      .mapToInt(num -> num.intValue())  // convert Integer wrapper to int
                      .min()  // use minimum function
                      .getAsInt();  // get the minimum as int as min returns Optional int

        int max = list.stream()
                .mapToInt(num -> num.intValue())  // stream way
                .max()
                .getAsInt();

        System.out.println("Minimum Number --> " + min);
        System.out.println("Maximum Number --> " + max);
    }
}


// Output

Minimum Number --> 1
Maximum Number --> 10
