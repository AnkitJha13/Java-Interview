package com.athena.java_practice2.collection;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("example.txt")){
            writer.write("Hello I am Immortal Soul Athena");
            System.out.println("Successfully written to a file");
        } catch (IOException e) {
            System.out.println("Oops an error occurred while writing to file");
            e.printStackTrace();
        }
    }
}


// Output
- Successfully written to a file 

- in example.txt file Hello I am Immortal Soul Athena will be written after executing this
