package com.athena.java_practice2.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,2,3,3,3,4,4,5,6);

        List<Integer> uniqueList = list.stream()
                                       .distinct()
                                       .toList();

        System.out.println("Unique List ---> " + uniqueList);


    }
}


// Output

Unique List ---> [1, 2, 3, 4, 5, 6]
