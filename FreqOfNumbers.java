package com.athena.java_practice2.collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FreqOfNumbers {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,1,1,1,2,2,2,3,3,4,5);

        Map<Integer, Integer> mpp = new HashMap<>();

        for(int i=0;i<list.size();i++){
            int element = list.get(i);

            mpp.put(element, mpp.getOrDefault(element, 0) + 1);
        }


//        Map<Integer, Long> mpp = list.stream()
//                .collect(Collectors.groupingBy(
//                        val -> val,
//                        Collectors.counting()
//                ));


        System.out.println(mpp);

    }
}


// Output

{1=4, 2=3, 3=2, 4=1, 5=1}
