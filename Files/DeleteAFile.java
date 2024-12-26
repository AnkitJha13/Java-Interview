package com.athena.java_practice2.collection;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("example.txt");

        if(file.delete()){
            System.out.println("file is deleted " + file.getName());
        }
        else{
            System.out.println("failed to delete a file");
        }
    }
}


// Output 
- file is deleted example.txt
