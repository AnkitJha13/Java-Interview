package com.athena.java_practice2.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class fromObjectsRemoveCharOrInteger {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,"A", "C", 9));

//      List<Object> ans = list.stream()
//                .filter(element -> element instanceof Number)
//                .collect(Collectors.toList());    //    Output - [1, 2, 3, 4, 5, 9]

//      List<Object> ans = list.stream()
//                .filter(element -> element instanceof String)
//                .collect(Collectors.toList());    //    Output - [A, C]


//      to remove in place then use this in the same list
        list.removeIf(element -> element instanceof Number);

        System.out.println(list);                   //    Output - [1, 2, 3, 4, 5, 9]
    }
}


// element instanceof Number is done to check which are instances of numbers




