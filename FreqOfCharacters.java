package com.athena.java_practice2.collection;

import java.util.HashMap;
import java.util.Map;

public class FreqOfCharacters {
    public static void main(String[] args) {

        String input = "Hello Athena";

        Map<Character, Integer> mpp = new HashMap<>();

//        for(char ch : input.toCharArray()){
//            if(ch != ' '){
//                mpp.put(ch, mpp.getOrDefault(ch, 0) + 1);
//            }
//        }

        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);

            if(ch != ' '){
                mpp.put(ch, mpp.getOrDefault(ch, 0) + 1);
            }
        }

        System.out.println(mpp);
    }
}


// Output

{A=1, a=1, t=1, e=2, H=1, h=1, l=2, n=1, o=1}
