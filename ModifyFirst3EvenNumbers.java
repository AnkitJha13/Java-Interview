package com.athena.java_practice2.collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintEvenNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> modifiedList = numbers.stream()
                .filter(n -> n % 2 == 0)  // first filter even numbers
                .limit(3)  // then limit numbers to 3
                .map(n -> n * n)  // then perform square operation on even numbers using map
                .collect(Collectors.toList());


        System.out.println("Modified list for first 3 evem numbers are --> " + modifiedList);

    }
}


// Output

Modified list for first 3 evem numbers are --> [4, 16, 36]
