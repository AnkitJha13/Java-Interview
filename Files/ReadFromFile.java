package com.athena.java_practice2.collection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("example.txt")
        )){
          String line;
          while((line = reader.readLine()) != null){
              System.out.println(line);
          }

        } catch (IOException e) {
            System.out.println("error occurred while reading a file");
            e.printStackTrace();
        }
    }
}



// Output
- now this file is used to read data from file and will be printed on the screen 


## BufferedReader reader = new BufferedReader(new FileReader("example.txt")
- FileReader reads character by character → Less efficient for large files.
- BufferedReader reads chunks of data into a buffer (not the whole file at once) → More efficient because it reduces the number of I/O calls.

    
## while((line = reader.readLine()) != null)
- Purpose: Reads the file line by line until there are no more lines.
- readLine(): Reads one line from the file at a time.
- != null: The loop continues as long as a line is read.

- e.printStackTrace(): Prints the exception details to help identify the issue.
