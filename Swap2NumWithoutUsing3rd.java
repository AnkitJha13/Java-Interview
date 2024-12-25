package com.athena.java_practice2.collection;

public class Swap2NumWithoutUsing3rd {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("a = " + a + " -- Before numbers -- " + "b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a + " -- After numbers -- " + "b = " + b);
    }
}


// Output
a = 10 -- Before numbers -- b = 5
a = 5 -- After numbers -- b = 10


