package com.athena.java_practice2.collection;

import java.io.File;
import java.io.IOException;

public class CreateAFile {
    public static void main(String[] args) {

        try{
            File file = new File("example.txt");
            if(file.createNewFile()){
                System.out.println("file is created "+ file.getName());
            }
            else{
                System.out.println("file already exists");
            }
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }

    }
}



// No, you cannot avoid the try-catch block (or handling the exception) because the createNewFile() method declares that it throws an IOException.
// IOException is a checked exception, which means it must be either:
   Caught using a try-catch block
   Or declared in the main() method using throws

// Output 
a example.txt file wiil be created

- file is created example1.txt
