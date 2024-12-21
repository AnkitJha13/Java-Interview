package com.athena.java_practice2.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringsSortingAscAndDesc {

    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("Mamba", "Athena", "Levinho", "Immortal");


        List<String> ascending = fruits.stream()
                .sorted()
                .toList();

        List<String> descending = fruits.stream()
                .sorted(Comparator.reverseOrder())
                .toList();


        System.out.println("Ascending order ---> " + ascending);

        System.out.println("Descending order ---> " + descending);
    }
}


// Output

Ascending order ---> [Athena, Immortal, Levinho, Mamba]
Descending order ---> [Mamba, Levinho, Immortal, Athena]
