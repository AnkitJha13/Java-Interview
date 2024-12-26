package com.athena.java_practice2.collection;

import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {
    public static void main(String[] args) {

        try(FileWriter writer = new FileWriter("example.txt", true)){
            writer.write("Hello I Immortal Soul the conquerer");
            System.out.println("file appended");
        } catch (IOException e) {
            System.out.println("Oops an error occurred while writing to file");
            e.printStackTrace();
        }
    }
}


// Output
- file appended 

- and in example.txt file the data will be updated 
