package com.athena.java_practice2.collection;

import java.util.Arrays;
import java.util.List;

public class SecondLargestNum {

    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,2,8,4,5,6);

        int largest = num.get(0);
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0;i<num.size();i++){
            if(num.get(i) > largest){
                secondLargest = largest;
                largest = num.get(i);
            }
            else if(num.get(i) < largest && num.get(i) > secondLargest){
                secondLargest = num.get(i);
            }
        }

        System.out.println("Second largest number is ---> " + secondLargest);
    }
}


// Output

Second largest number is ---> 6
