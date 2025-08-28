###################  JAVA CONCEPTS ################################

# Solid principles, design patterns then LLD





# JDK (java development kit)
- A toolkit for developing Java applications.
- Includes the javac compiler to convert Java code into bytecode.
- Also contains debugging tools, libraries, and the JRE.

# JRE (Java runtime environment)
- The runtime environment required to run Java applications.
- Contains the JVM (Java Virtual Machine) to execute Java bytecode.
- Includes essential libraries and components for runtime support.

# JVM (Java Virtual Machine) 
- A virtual machine that executes Java bytecode.
- Converts bytecode into machine code specific to the underlying operating system.
- Enables Java's platform independence with the "Write Once, Run Anywhere" feature.

# Java bytecode 
- It is a set of instructions that is platform-independent and can be executed by the Java Virtual Machine (JVM). 




# Java is considered platform-independent because it uses Java Virtual Machine (JVM) to execute programs.
  And, JVM is a virtual machine that executes Java bytecode.
  Java Bytecode is a set of instructions that is platform-independent and can be executed by the 
  Java Virtual Machine (JVM). 







# Class Loader
- In Java it is a part of the JVM responsible for loading .class files into memory so they can be executed.


# Types of Class Loaders:-
- Bootstrap Class Loader – Loads core Java classes from JAVA_HOME/lib (e.g., java.lang.String).
- Extension Class Loader – Loads classes from JAVA_HOME/lib/ext.
- Application Class Loader – Loads classes from your project’s classpath.



# LTS (Long-Term Support) = stable version with long support → safer choice for real-world projects.










## Different JAVA versions:-
# Java 8 (2014)
- Lambda Expressions
  list.forEach(n -> System.out.println(n));

- Streams API (map, filter, collect, reduce)
- Functional Interfaces (Predicate, Function, Supplier, Consumer)
- Method References (ClassName::methodName)
- Optional Class (null-safe handling)
- Default & Static Methods in Interfaces
- New Date & Time API (LocalDate, LocalTime, LocalDateTime, Period, Duration)




# Java 11 (2018) – LTS
- var keyword for local variable type inference
  var name = "Athena";

- New String Methods (isBlank(), lines(), strip(), repeat())
- Files.readString() and writeString()
- HTTP Client API (HttpClient, HttpRequest, HttpResponse)
- Removal of Java EE and CORBA modules
- Running Java files without compilation step (java Hello.java)




# Java 17 (2021) – LTS
- Currently the most stable LTS used in modern projects.
- Sealed Classes (restrict subclassing)
- Pattern Matching for instanceof
  if (obj instanceof String s) {
    System.out.println(s.toLowerCase());
  }

- Switch Expressions (return values from switch)
- Text Blocks (""" multi-line string """)
- Records (data carrier classes with minimal boilerplate)





# Java 21 (2023) – LTS
- Latest LTS
- Virtual Threads (Project Loom – lightweight threads)
- String Templates (concise string formatting)
- Record Patterns (deconstruct records in pattern matching)
- Sequenced Collections (preserve order in APIs)



# Java 24 (2024) – Latest
- Better Garbage Collection – Faster memory cleanup.
- Stream Gatherers – Process data more easily.
- Class-File API – Work with class files directly.










## Applications developed using Java
- Desktop Applications – e.g., IDEs like Eclipse, media players.
- Web Applications – e.g., e-commerce sites, online banking (using Java EE, Spring).
- Mobile Applications – Android apps (Java was primary for Android development).
- Enterprise Applications – Large-scale systems like ERP, CRM.
- Cloud-based Applications – Microservices, cloud APIs using Spring Boot.
- Games and Embedded Systems – 2D/3D games, IoT devices.










## POJO Classes (Plain Old Java Objects)
- Simple Java objects with no special restrictions or dependencies.
- Used to represent data with fields, constructors, getters, and setters.
- Demonstrates **encapsulation** by keeping fields private and providing public getters and setters for 
  controlled access.

- ex:-
  public class Employee {
    private int id;
    private String name;
    
    // Default Constructor
    public Employee() {}

    // Parameterized Constructor
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters and Setters
    public void setId(int id) { this.id = id; }
    public int getId() { return id; }

    public void setName(String name) { this.name = name; }
    public String getName() { return name; }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "'}";
    }
  }



# Advantages
- Easy to create, read, and maintain.
- Promotes encapsulation and clean code practices.
- Works seamlessly with frameworks like Hibernate, Spring, etc.


# Usage
- Data transfer between application layers (DTO pattern).
- Representing database tables in ORM frameworks.












## Difference between Static and Instance (Non-Static) Methods
- ex 
class Car {
    static int totalCars = 0;  // Static variable shared by all cars
    String model;              // Instance variable (unique for each car)

    // Static method
    public static void showTotalCars() {
        System.out.println("Total cars: " + totalCars);
    }

    // Instance method
    public void showModel() {
        System.out.println("Car model: " + model);
    }

    // Constructor
    public Car(String model) {
        this.model = model;
        totalCars++;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota");
        Car car2 = new Car("Honda");

        // Instance method call (requires object)
        car1.showModel(); // Output: Car model: Toyota
        car2.showModel(); // Output: Car model: Honda

        // Static method call (no object needed)
        Car.showTotalCars(); // Output: Total cars: 2
    }
}



=> Static Method (public static void showTotalCars() {})
- Can be called directly with the class name (Car.showTotalCars()).
- Does not require an object (instance) of the class to be called.
- Can only access static variables (like totalCars), not instance variables (like model).
  ex:- Car.showTotalCars(); works because showTotalCars only uses the static variable totalCars.
- Suitable for counters, utility methods, or other operations not specific to a single object.


=> Instance Method (public void showModel() {})
- Must be called on an object (instance).
  ex:- car1.showModel() where car1 is an object of Car.
- Can access both instance variables (model) and static variables (totalCars).
  ex:- Car objects can access both static and non static variables.
- Best for behaviors specific to an object.











## Data type sizes
# byte - 1 byte (8 bits)
# short - 2 bytes (16 bits)
# int - 4 bytes (32 bits)
# long - 8 bytes (64 bits)
# float - 4 bytes (32 bits)
# double - 8 bytes (64 bits)
# char - 2 bytes (16 bits)
# boolean - 1 bit (JVM dependent)









## Type Casting
- Process of converting a variable from one data type to another

# Implicit (Automatic) Casting
- Java automatically converts a smaller data type to a larger data type.
- No data is lost, so it's safe.
- ex:-
  int num = 10;
  double d = num; // int to double (automatically done)

# Explicit (Manual) Casting
- Needed when converting a larger data type to a smaller one.
- Must be done manually to avoid data loss.
- ex:-
  double d = 10.5;
  int num = (int) d; // double to int (manually done)











## local and global variables
# local variables
- Declared inside a method, constructor, or block.
- Exist only while method runs.
- Accessible only within that method/block.
- Must be initialized before use.


# global variables
- Declared inside class but outside any method.
- Exists as long as the object (or class for static) exists.
- Accessible by all methods of the class.
- Gets default value if not initialized.


- ex:-

class Car {
    // Global variable
    String model = "Ford";

    public void setModel() {
        // Local variable
        String localName = "Toyota";
        System.out.println("Local Variable: " + localName);
        System.out.println("Global Variable: " + model); 
    }

    public void show() {
        // System.out.println(localName);   // localName not accessible here
        System.out.println("Global Variable: " + model);  
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setModel();
        c1.show();
        System.out.println(c1.model); // can call this directly as global variable

    }
}


// Output
Local Variable: Toyota
Global Variable: Ford
Global Variable: Ford
Ford


















# Strings are Immutable.

# Why Strings are immutable?
- Once created, cannot be changed.
- Any modification → new object created.
- Benefits:
  Security (data can’t be altered).
  Thread-safety (safe across threads).
  Constant hashcode (important for HashMap, HashSet).





## Difference between creating Strings literals vs using new() keyword?
# using literals
- Stored in the String Pool, reused if identical.
- Same value strings refer to the same memory object.
- Preferred for commonly used strings.

# using new() keyword
- Creates a new object in heap memory every time.
- Even same value strings point to different objects.
- Used when explicitly creating a new string object.

- ex:-
  class StringExample {
    public static void main(String[] args) {
        String str1 = "Hello";      // String literal
        String str2 = "Hello";      // String literal
        String str3 = new String("Hello");  // Using new()

        // Output: true, because literals refer to the same object in String Pool
        System.out.println(str1 == str2);  

        // Output: false, because new() creates a new object
        System.out.println(str1 == str3); 
    }
  }



# String Pool (also called String Constant Pool or String Literal Pool)
- Special area in heap memory for String literals.
- It’s managed by the JVM in heap memory for efficiency.
- If a String literal already exists, the JVM reuses it, saving memory.
- Strings created with new are not added to the pool automatically.



# intern() function
- The intern() method ensures a String is stored in the String Pool.
- If the String is not in the pool, it is added; if it’s already there, it returns the reference from the pool.
- It helps save memory by reusing String literals.





## Mutable vs Immutable String
# Mutable string 
- Can be modified after creation, without creating a new object.
- Any modifications affect the original string object.
- same ex of stringbuilder and stringbuffer
- ex:-
  StringBuilder sb = new StringBuilder("Hello");
  sb.append(" World");     // Modifies the original string
  System.out.println(sb);  // Output: Hello World


# Immutable string
- Cannot be changed once created.
- Modifications create a new string object.
- The String class in Java is immutable.
- ex:- 
  String str = "Hello";
  str = str + " World";     // Creates a new string object
  System.out.println(str);  // Output: Hello World









## StringBuffer vs StringBuilder
# StringBuffer 
- Can modify the original string.
- Synchronized methods ensure safety in multi-threaded environments.
- Synchronized means one thread can access a method at a time for safe data modification.
- Slightly slower due to synchronization overhead.
- Ex
  StringBuffer sb = new StringBuffer("Hello");
  sb.append(" World");     // Modifies the original string
  System.out.println(sb);  // Output: Hello World



# StringBuilder 
- Can modify the original string.
- Not suitable for multi-threaded environments.
- Faster than StringBuffer in single-threaded scenarios.
- Ex
  StringBuilder sb = new StringBuilder("Hello");
  sb.append(" World");  // Modifies the original string
  System.out.println(sb);  // Output: Hello World







# Flowcharts
- Diagrams to represents solutions of problems.



# Different types of Java control statements:-
- Decision-making statements (if, if else & switch)
  Execute code based on conditions.

- Looping statements (while, do while & for)
  Repeat code multiple times.

- Jump statements (break, continue & return)
  Change the flow of execution.

- Exception Handling Statements (try-catch and finally block)
  Handle errors during execution.




# import java.util.Scanner
- Imports only the Scanner class from java.util package to read inputs.
- Scanner sc = new Scanner(System.in)

# import java.util.*
- Imports all classes, interfaces, and enums from the java.util package.
- Includes Scanner, ArrayList, HashMap, Date, and more.


# import java.util.concurrent.*;
- Provides thread-safe collections and classes like ConcurrentHashMap to handle concurrent operations safely.
- Offers efficient concurrent data structures that reduce synchronization overhead.




# Scanner 
- Used to read input from various sources like the console, files, or strings.
- Belongs to the java.util package.
- Scanner sc = new Scanner(System.in);  // Reads input from the console
- Always close the scanner after use with sc.close(); to release resources.



# Scanner Methods
- sc.next(): Reads a single word (e.g., "athena").
- sc.nextLine(): Reads an entire line, including spaces (e.g., "athena mortal").
- sc.nextInt(): Reads an integer.
- sc.nextFloat(): Reads a floating-point number.




# in System.out.println()
- System: Refers to the System class.
- out: Refers to the standard output stream (a PrintStream object).
- println(): Prints the string followed by a newline character




## public static void main(String[] args)
# public:
- Access modifier that means the method can be accessed from anywhere.

# static:
- Indicates the method belongs to the class, not instances (objects) of the class.

# void:
- Specifies that the method does not return any value.

# main:
- The name of the method. It's the entry point of any Java application.

# String[] args:
- An array of String objects, which can hold multiple strings.

# args:
- A parameter that holds command-line arguments passed to the program.







## Types of Methods in Java
# User-defined
- Created by the User (e.g., sum(), factorial()).

# Built-in methods
- Provided by Java (e.g., Math.max(), Math.sqrt() for maximum and square root).




# Arrays.sort (to sort)






## Data Types in Java
# Primitive (Stores value directly)
- Simple, built-in types.
- Examples: byte, short, int, long, float, double, char, boolean

# Non-primitive (Stores reference to objects)
- Complex types that store data and behavior.
- Examples: String, Array, Class, Interface, Object






## Operators
# Arithmetic Operators (Perform mathematical operations)
- +, -, *, /, %
 
# Logical Operators (Used for boolean logic)
- && (AND), || (OR), ! (NOT)

# Bitwise Operators (Operate on bits)
- &, |, ^, ~, <<, >>, >>>






# Garbage collector (Java memory management) 
- Automatically frees memory by removing unused objects.
- Helps prevent memory leaks.
- No need for manual memory deallocation, simplifying programming.
- Unlike C++, where you use delete keyword, Java handles it automatically.
- Garbage collector is there in java not destructor to handle memory management and object destruction. 
  (in place of destructor)

------------------------------------------------------
## Collection API
- A set of classes and interfaces that allow you to store, retrieve, and manipulate groups of objects.
- Key Interfaces: List, Set, Queue, Map.
- Common Implementations: ArrayList, LinkedList, HashSet, TreeSet, HashMap, TreeMap, PriorityQueue.


## Collection
- Root interface of the Collection Framework, representing a group of objects.
- It is implemented by other interfaces like List, Set, and Queue.
- Defines basic methods like add(), remove(), size(), and clear().


## Collections
- It is a utility class that provides static methods for working with collections (e.g., sorting, reversing).
- Example: Collections.sort(list) sorts a list.
- Used for sorting, searching, and modifying collections.



## Java collections framework
- A framework that organizes the Collection API for efficient management of data.
- Defines interfaces (List, Set, Map, etc.).
- Provides ready-to-use implementations (e.g., ArrayList, HashMap).
- Offers algorithms for collections, such as sorting (Collections.sort()) and searching (Collections.binarySearch()).



## Iterating over Collections (Iterator, forEach) 
# Using Iterator
- Used for traversing collections like ArrayList, HashSet, etc.
- Methods: hasNext(), next(), remove()
- ex:-
  List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
  Iterator<Integer> it = list.iterator();

  while (it.hasNext()) {
     System.out.print(it.next() + " ");  // Output: 1 2 3 4 5
  }


# Using forEach (Lambda Expression - Java 8+)
- Simplified iteration with functional programming.
- ex:-
  list.forEach(num -> System.out.print(num + " "));  // Output: 1 2 3 4 5


# Using Enhanced for-loop (for-each loop)
- Simplest and most readable approach.
- ex:-
  for (int num : list) {
    System.out.print(num + " ");  // Output: 1 2 3 4 5
  }




## Interfaces:-
# List:-
- Ordered collection that allows duplicates. 
- Operations:- add(element), get(index), remove(index), set(index, element), isEmpty(), size(),  
               indexOf(element), contains(element), remove(element), lastIndexOf(element) 
- Examples: ArrayList, LinkedList.


# Set:-
- Unordered collection that does not allow duplicates. 
- Operations:- add(element), remove(element), contains(element), isEmpty(), size(), clear()
- Examples: HashSet, LinkedHashSet, TreeSet.


# Queue:-
- A collection that holds elements for processing in a specific order (e.g., FIFO). 
- Operations:- add(element), poll(), peek(), isEmpty(), size(), clear()
- Examples: LinkedList, PriorityQueue.


# Map:- 
- A collection of key-value pairs, where keys are unique.
- Operations:- put(key, value), get(key), remove(key), containsKey(key), containsValue(value), size(), clear()
- Examples: HashMap, TreeMap, LinkedHashMap.


# Deque Interface:-
- Represents a double-ended queue, which supports insertion and removal of elements from both ends.
- It can function as a stack (LIFO) or a queue (FIFO). 
- Operations:- push(element), pop(), peek(), addFirst(element), addLast(element), isEmpty(), size(), clear()




## List Interface
=> ArrayList:-
- Resizable array.
- Fast access by index, but slow insertions/removals at the beginning. 
- ex 
  ArrayList<Integer> list = new ArrayList<>();
  list.add(1);
  list.add(2);
  list.add(3);  
  System.out.println(list);               // output - [1,2,3]



=> LinkedList:-
- Doubly-linked list.
- Fast insertions/removals at both ends, but slow access by index.
- ex
  LinkedList<Integer> list = new LinkedList<>();
  list.add(1);
  list.add(2);                           // Efficient insertion at the beginning
  list.addFirst(3);                      // can use addFirst or addLast property here
  System.out.println(list);              // output - [3,1,2]
  



## Vector vs ArrayList


## Set Interface
=> HashSet:- 
- Does not guarantee any order. Fast lookup, but no order.
- Best when you need to ensure no duplicates and order of elements does not matter.
- ex
  Set<String> hashSet = new HashSet<>();
  hashSet.add("Apple");
  hashSet.add("Banana");
  hashSet.add("Cherry");
  hashSet.add("Apple");         // Duplicate, won't be added
  System.out.println(hashSet);  // Output: Random order, e.g., [Banana, Apple, Cherry]



=> LinkedHashSet:-
- Maintains elements in the order they were inserted.
- Best when you need to ensure no duplicates and preserve the insertion order.
- ex
  Set<String> linkedHashSet = new LinkedHashSet<>();
  linkedHashSet.add("Apple");
  linkedHashSet.add("Banana");
  linkedHashSet.add("Cherry");
  linkedHashSet.add("Apple");         // Duplicate, won't be added
  System.out.println(linkedHashSet);  // Output: [Apple, Banana, Cherry]



=> TreeSet:-
- Stores elements in sorted order (ascending by default).
- Stores in natural order (lexicographical order)
- ex
  Set<String> treeSet = new TreeSet<>();
  treeSet.add("Banana");
  treeSet.add("Apple");           // Duplicate, won't be added
  treeSet.add("Cherry");          // Output: [Apple, Banana, Cherry] (sorted order)
  treeSet.add("Apple");           // sorts elements based on their natural ordering, which for strings
  System.out.println(treeSet);    // means lexicographical order. 
                                  




## Map Interface
=> HashMap:-
- Unordered (no guarantee on the order of keys/values).
- Fast for insertion, deletion, and lookup: O(1) average-case complexity.
- Allows one null key and multiple null values.
- ex
  HashMap<String, Integer> map = new HashMap<>();
  map.put("One", 1);                     // Insert
  map.put("Two", 2);
  map.put("Three", 3);

  System.out.println(map);               // Output: {One=1, Two=2, Three=3}

  map.remove("Two");                     // Remove
  System.out.println(map);               // Output: {One=1, Three=3}

  System.out.println(map.containsKey("One"));  // true
  System.out.println(map.get("Three"));        // 3



=> LinkedHashMap:-
- Preserves the insertion order of elements.
- Slightly slower than HashMap due to the overhead of maintaining a doubly linked list of entries.
- Allows one null key and multiple null values.
- ex
  LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
  map.put("One", 1);
  map.put("Two", 2);
  map.put("Three", 3);

  System.out.println(map);               // Output: {One=1, Two=2, Three=3} (insertion order preserved)




=> TreeMap:-
- Maintains keys in sorted order (natural order):
  Numbers: Sorted from low to high.
  Strings: Sorted in lexicographical order.
- Slower than HashMap and LinkedHashMap: O(log n) for basic operations due to underlying Red-Black Tree.
- Does not allow null keys, but allows multiple null values.
- Allows a custom comparator for custom sorting.
- ex
  TreeMap<String, Integer> map = new TreeMap<>();
  map.put("Banana", 1);
  map.put("Apple", 2);
  map.put("Cherry", 3);                  // natural order sorting based on lexicographical order in strings (a,b,c)

  System.out.println(map);               // Output: {Apple=2, Banana=1, Cherry=3} (sorted order)





## Queue Interface
=> LinkedList (Queue):-
- Can be used as a queue.
- Allows elements to be added or removed from both ends.
- ex
  LinkedList<Integer> queue = new LinkedList<>();
  queue.add(1);
  queue.add(2);
  queue.add(3);

  System.out.println(queue);  // Output: [1, 2, 3]

  queue.poll();  // Removes and returns the head (FIFO) , same as queue.remove() but more preferred is poll
  System.out.println(queue);  // Output: [2, 3]



=> PriorityQueue:-
- Stores elements in priority order, not necessarily FIFO.
- ex
  PriorityQueue<Integer> pq = new PriorityQueue<>();
  pq.add(10);
  pq.add(5);
  pq.add(15);

  System.out.println(pq);  // Output: [5, 10, 15] (min-heap by default)





## Stack (Deque Interface)
=> Deque (Double-Ended Queue):-
- Represents a last-in, first-out (LIFO) stack.
- ex 
  Deque<Integer> stack = new LinkedList<>();
  stack.push(1);
  stack.push(2);
  stack.push(3);

  System.out.println(stack);  // Output: [3, 2, 1]

  stack.pop();  // Removes the top element (LIFO)
  System.out.println(stack);  // Output: [2, 1]




--------------------------------------------------------------------------------------------------------



# Enum in java 
- It is short for enumeration.
- It is a special data type in Java that allows you to define a collection of named constants.
- Used for related values known at compile time (e.g., days of the week, countries).
- Enum values are written in uppercase by convention.
- Enums cannot extend classes but can implement interfaces.
- Enums can have fields, methods, and constructors.
- They improve readability and provide type safety, reducing errors.
- ex

// Enum for country names
class QueueB {
  enum Country {
    USA, CANADA, INDIA, AUSTRALIA, UK, GERMANY, FRANCE, JAPAN, BRAZIL, SOUTH_AFRICA
  }

  public static void main(String[] args) {
    // Accessing the 7th country in the enum (index 6 because ordinals start at 0)
    Country seventhCountry = Country.FRANCE;
    System.out.println("The 7th country is: " + seventhCountry); // Output: The 7th country is: FRANCE

    // Using ordinal() to display the position of FRANCE
    System.out.println("The ordinal of FRANCE is: " + seventhCountry.ordinal()); // Output: 6
  }
}




# Annotation in java (@Override ex)
- They are metadata that provide information about the code, without changing its behavior.

# @Override
- It is used to indicate that a method is overriding a method from a superclass.
- Ensures correct method signature (e.g., no typos).
- Errors are caught at compile-time, not runtime.
- ex
  class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
  }

  class Dog extends Animal {
      @Override
      void sound() {
          System.out.println("Dog barks");
      }
  }

  public class Main {
      public static void main(String[] args) {
          Dog d = new Dog();
          d.sound(); // Output: Dog barks
      }
  }





==> for error case using @Override:-
    class Dog extends Animal {
      @Override
      void sound(String type) {  // Compiler error: Doesn't match the superclass method
           System.out.println("Dog barks");
      } 
    }

==> Another error type 
    class Dog extends Animal {  
        @Override
        void sounds() {        // Compiler Error: No method named 'sounds' in superclass
            System.out.println("Dog barks");
        }
    }





## Reference Comparison vs Content Comparison
# Reference Comparison
- == compares references (whether they point to the same object).
- Compares memory locations of two objects.
- ex
  String s1 = new String("Hello");
  String s2 = new String("Hello");

  if (s1 == s2) {
      System.out.println("Same reference");
  } else {
      System.out.println("Different references");  // Output
  }


# Content Comparison
- .equals() compares content (whether the data inside the objects is the same).
- Compares the actual data inside two objects.
- ex
  String s1 = new String("Hello");
  String s2 = new String("Hello");

  if (s1.equals(s2)) {
      System.out.println("Same content");  // Output
  } else {
      System.out.println("Different content");
  }







## Serialization and Deserialization in Java
# Serialization:-
- Process of converting a Java object (like a person, car, etc.) into JSON data 
  (a format that can be saved or sent over the internet).
- So that we can store an object’s state in a file or send it to another computer.
- ex
  class Person implements Serializable {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
  }

  public class SerializeExample {
      public static void main(String[] args) throws IOException {
          Person person = new Person("John", 25);
          FileOutputStream fileOut = new FileOutputStream("person.ser");
          ObjectOutputStream out = new ObjectOutputStream(fileOut);
          out.writeObject(person);  // Serialize the object
          out.close();
      }
  }



# Deserialization:-
- The process of converting JSON data (or XML) back into a Java object.
- To read the saved object or received object and use it in the program.
- ex
  public class DeserializeExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fileIn = new FileInputStream("person.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        Person person = (Person) in.readObject();  // Deserialize the object
        in.close();
        System.out.println(person.name);  // Output: John
    }
  }







## Errors
- An error is an issue in a program that prevents it from functioning correctly.


# Compile time error
- Occurs during compilation (before running the program).
- Caused by: Syntax errors, incorrect data types, missing semicolons.
- ex
  public static void main(String[] args) {
         int x = "Hello"; // Compile-time error: incompatible types
   }


# run time error
- Occurs while the program is running.
- Caused by: Division by zero, null reference, out-of-bounds access.
- ex
  public static void main(String[] args) {
         int[] numbers = {1, 2, 3};
         System.out.println(numbers[3]); // Run-time error: ArrayIndexOutOfBoundsException
  }


# logical error
- Program runs without crashing but produces incorrect results.
- Causes Incorrect conditions in if statements, incorrect loops, or incorrect calculations.
- ex
  public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        int sum = num1 - num2; // Logical error: wrong calculation
        System.out.println("Sum is: " + sum); // Output: Sum is: -5
  }






# Exceptions
- An exception is an event that disrupts the normal flow of a program during runtime.


## Types of Java Exceptions
# Checked Exceptions:-
- Exceptions that are expected and can be handled (e.g., file not found, database issues).
- Mandatory to handle
- Example: IOException, SQLException

# Unchecked Exceptions:-
- Programming bugs or logic errors, like accessing null objects.
- Not mandatory to handle but should be avoided through good coding practices.
- Example: NullPointerException, ArrayIndexOutOfBoundsException

# Errors:-
- JVM-level problems, e.g., infinite recursion.
- Example: StackOverflowError, OutOfMemoryError





## Creating Custom Exceptions in Java
# Extend Exception Class:-
- Create a custom exception by extending either Exception (for checked exceptions) or 
  RuntimeException (for unchecked exceptions).
- ex:-
  class MyCustomException extends Exception {
    // Constructor
    public MyCustomException(String message) {
        super(message);
    }
  }



# Use the Custom Exception:-
- You can now throw and catch your custom exception like any other exception.
- ex:-
  public class Main {
    public static void main(String[] args) {
        try {
            throw new MyCustomException("Something went wrong!");
        } catch (MyCustomException e) {
            System.out.println(e.getMessage());
        }
    }
  }



## Common Exceptions and Their Causes
# NullPointerException (Unchecked)
- When: Accessing methods or fields on a null object.
- Fix: Check for null using if conditions.

# ArrayIndexOutOfBoundsException (Unchecked)
- When: Accessing an array with an invalid index.
- Fix: Ensure indices are within bounds.

# ArithmeticException (Unchecked)
- When: Divide by zero.
- Fix: Check for divisor before division.

# ClassNotFoundException (Checked)
- When: Class not found at runtime.
- Fix: Ensure the required class is available in the classpath.

# FileNotFoundException (Checked)
- When: File doesn’t exist.
- Fix: Verify file path before reading.

# IOException (Checked)
- When: Input/output operation fails (e.g., reading/writing to a file).
- Fix: Handle using try-catch.

# SQLException (Checked)
- When: Issues during database access.
- Fix: Properly handle database queries.

# NumberFormatException (Unchecked)
- When: Invalid parsing of a string to a number.
- Fix: Use try-catch or validate the input.




## Exception Handling
# Using try-catch and finally:-
- try Block: Contains code that may throw an exception.
- catch Block: Handles the exception if it occurs.
- finally Block: Always executes, regardless of an exception, for cleanup 
                 (e.g., closing files, releasing resources, or ending connections).

- ex
  try {
    int result = 10 / 0; // May throw ArithmeticException
  } catch (ArithmeticException e) {
      System.out.println("Cannot divide by zero!");
  } finally {
      System.out.println("Execution finished.");
  }



# The base class of all exception classes in Java is Throwable.
# Throwable is the superclass of all errors and exceptions in Java.
# It has two main subclasses:
- Error: An error is an issue in a program that prevents it from functioning correctly. (e.g., OutOfMemoryError).
- Exception: An exception is an event that disrupts the normal flow of a program
             during runtime. (e.g., IOException, NullPointerException).



# throw Keyword:-
- Used when we want to manually trigger an exception based on some logic or condition.
- Usage: throw new Exception("Message").
- ex
  if (age < 18) {
    throw new IllegalArgumentException("Age must be 18 or above.");
  }


# throws Keyword:-
- Declares an exception that a method might throw to the calling method.
- Usage: public void method() throws Exception.
- ex
  public void readFile() throws IOException {
    // Code that might throw IOException
    throw new IOException("File not found!");
  }


# Try with multiple catch
- Handle different exceptions separately using multiple catch blocks.
- ex
  try {
    int[] numbers = {1, 2, 3};
    System.out.println(numbers[5]); // ArrayIndexOutOfBoundsException
  } catch (ArithmeticException e) {
    System.out.println("Arithmetic error occurred.");
  } catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Array index out of bounds!");
  }








# Integer.parseInt() 
- Integer.parseInt() converts a string to an integer.
- Example: Integer.parseInt("123") returns 123.

# Float.parseFloat()
- Float.parseFloat() converts a string to a float (decimal number).
- Example: Float.parseFloat("12.34") returns 12.34.




----------------------

## Methods in Object class
# toString()
- Returns a string representation of the object (usually the class name and memory address).
- ex:-
  Object obj = new Object();
  System.out.println(obj.toString()); // Output: java.lang.Object@6bc7c054


# hashCode()
- Returns a unique integer identifier (hash code) for the object, used in collections like HashMap.
- ex-
  Object obj = new Object();
  System.out.println(obj.hashCode()); // Output: hash code (integer)


# equals(Object obj)
- Compares the current object with another object for equality (default compares memory addresses).
- ex:-
  String str1 = new String("hello");
  String str2 = new String("hello");
  System.out.println(str1.equals(str2)); // Output: true



# finalize()
- Called by the garbage collector before an object is destroyed (rarely used).
- ex:-
  @Override
  protected void finalize() {
      System.out.println("Object is being garbage collected.");
  }


# wait()
- Causes the current thread to wait until another thread invokes notify() or notifyAll() on the object.
- ex:-
  synchronized (obj) {
    obj.wait(); // Wait until notified
  }


# notify()
- Wakes up a single thread waiting on the object's monitor.
- ex:-
  synchronized (obj) {
    obj.notify(); // Notify a waiting thread
  }


# notifyAll()
- Wakes up all threads waiting on the object's monitor.
- ex:-
  synchronized (obj) {
    obj.notifyAll(); // Notify all waiting threads
  }




-------------------------------

## Multithreading
- It is a programming concept that allows multiple tasks to be executed concurrently.


# Advantages of Multithreading
- Increased performance
- Improved responsiveness
- Reduced resource usage

## Creating a Multithreaded Program in Java (above ans)
# By Extending Thread Class:-
# By Implementing Runnable Interface:-




## Thread class vs Runnable interface in Java
# Thread class:-
- It is a lightweight process that allows concurrent execution of tasks in a program.
- Directly creates and manages threads.
- ex
  class MyThread extends Thread {
     public void run() {
         System.out.println("Thread running");
     }
  }

  public class Main {
      public static void main(String[] args) {
          MyThread t = new MyThread();
          t.start(); // Start the thread
          System.out.println("Main thread running");
      }
  }


// Output:- 
   Main thread running (the order is not guaranteed in multithreading program so anything can be printed here first)
   Thread running


# Runnable interface:-
- It is an interface for defining tasks to be executed by a thread.
- More flexible as it allows implementing multiple interfaces.
- ex
  class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable running");
    }
  }

  public class Main {
      public static void main(String[] args) {
          Thread t = new Thread(new MyRunnable());   // as Runnable does not have a start() method.
          t.start(); // Start the thread
          System.out.println("Main thread running");
      }
  }


// Output:-
   Main thread running (the order is not guaranteed in multithreading program so anything can be printed here first)
   Runnable running




# Common Issues in Multithreading
- Threads access shared data simultaneously, leading to incorrect results (race condition)
- Threads wait indefinitely for each other to release locks (deadlock)
- Low-priority threads never gets a chance to execute (Starvation).



# Threads in java 
- It is a lightweight process that allows concurrent execution of tasks in a program.
- Every Java application has at least one thread, called the main thread.
- Threads enable parallel task execution.
  Ex:- downloading files while processing other tasks in the background.


# Thread Priority
- Each thread in Java has a priority that determines its order of execution.
- Thread priority ranges from MIN_PRIORITY (1), NORM_PRIORITY (5) (default), MAX_PRIORITY (10).
- Higher priority threads are executed before lower priority ones, but it’s not guaranteed in a 
  multi-threaded environment.


# Thread Sleep (Thread.sleep(milliseconds))
- Pauses the thread for a specified time.
- No need for synchronization.
- Example: Thread.sleep(3000); pauses the thread for 3 seconds.


# Thread wait() & notify()
- Pauses the thread until another thread calls notify() or notifyAll().
- Must be used in a synchronized block or method.


# Thread Synchronization
- A mechanism to control access to shared resources in a multithreaded environment.
- Ensures only one thread accesses critical sections of code at a time.
- Prevents race conditions and ensures data consistency when multiple threads modify shared resources.



# Race Condition
- A situation where multiple threads access shared resources simultaneously, leading to 
  inconsistent or incorrect results.
- Proper synchronization is needed to prevent it.






## Comparable vs Comparator
# Comparable (sorting based on one)
- Used to define how objects are naturally sorted (e.g., by one field like age).
- The class implements Comparable and overrides the compareTo() method.


# Comparator (sorting based on multiple)
- Used to define custom sorting for objects based on different criteria.
- A separate class implements Comparator and overrides the compare() method.








## Method Reference in Java (::)
- Introduced in Java 8 to simplify lambda expressions.
- Directly refers to an existing method.
- Best for simple, direct operations.
- ex
  List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
  names.forEach(System.out::println);  // Uses method reference to print each name


## Method Invocation (.)
- Used in lambda expressions for custom logic or transformations.
- ex
  List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
  names.forEach(name -> System.out.println(name.toUpperCase()));  // Method invocation with additional logic







## Lambda expression  (--> arrow keyword)
- It is a concise way to represent an anonymous function (a function without a name).
- It allows us to write functional code with fewer lines.
- Main goal of lambda expressions is to reduce boilerplate code.
- They can only be used with functional interfaces (interfaces that have only one abstract method).
- ex:-
  interface Calculator {
      int add(int a, int b);  // Single abstract method
  }

  public class Main {
      public static void main(String[] args) {
          Calculator calc = (a, b) -> a + b;  // Lambda expression
          System.out.println(calc.add(5, 3));  // Output: 8
      }
  }







## Stream API
- Introduced in Java 8, the Stream API allows functional-style processing of data.
- It provides operations like map, filter and reduce on collections (e.g., List, Set).
- Don’t modify the original data; they provide a pipeline for transformation and aggregation.

=> Types:-
## Stream (Sequential Stream)
- Created using .stream().
- Processes elements one by one in a single thread.
- Guarantees order of processing as per the source.
- Ideal for small datasets or when order matters.
- ex
  List<String> names = Arrays.asList("Alice", "Bob", "Charlie");  
  names.stream()  
       .forEach(System.out::println);  
  // Output: Alice Bob Charlie (processed sequentially)


## Parallel Stream
- Created using .parallelStream() or by calling .parallel() on a sequential stream.
- Splits the data into chunks and processes them concurrently in multiple threads.
- Does not guarantee order unless explicitly specified (e.g., using .sorted()).
- Best suited for large datasets or CPU-intensive tasks.
- Be cautious of thread-safety when dealing with shared resources.
- ex
  List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);  
  numbers.parallelStream()  
         .filter(n -> n % 2 == 0)  
         .forEach(System.out::println);  
  // Output: 6, 4, 2 (order not guaranteed, processed in parallel)





-----------------

## Three main methods of the Stream API:-
# .map()
- Transforms each element in the stream.
- Example: Squares each number.
  List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
  List<Integer> squaredNumbers = numbers.stream()
                                        .map(n -> n * n)
                                        .collect(Collectors.toList());

  System.out.println(squaredNumbers);  // Output: [1, 4, 9, 16, 25]



- Example: filter even numbers and print sq of first 3 even numbers 
  List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

  List<Integer> result = values.stream()
                               .filter(n -> n % 2 == 0)
                               .limit(3)         // Limits the result to the first 3 even numbers
                               .map(n -> n * n)  // Squares each even number
                               .collect(Collectors.toList());

  System.out.println(result);         // Output: [4, 16, 36]




# .filter()
- Filters elements based on a condition.
- Example: Filters even numbers.
  List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
  List<Integer> evenNumbers = numbers.stream()
                                     .filter(n -> n % 2 == 0)
                                     .collect(Collectors.toList());

  System.out.println(evenNumbers);  // Output: [2, 4]
 


=> Use toList() if you are using Java 16 or later and it gives immutable list.
=> Use collect(Collectors.toList()) if you are using Java 8 to Java 15, or if you need a mutable list.





# .reduce()
- Aggregates elements to produce a single result.
- Example: Calculates the sum of all numbers.
  List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
  int sum = numbers.stream()
                   .reduce(0, Integer::sum);  // it is method reference syntax

  System.out.println(sum);  // Output: 15




------------


## Difference between Stream.toList() and collect(Collectors.toList())
# Stream.toList()
- Returns an unmodifiable list (immutable).
- ex:-
  List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

  List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();

  evenNumbers.add(1);    // will throw error as immutable list



# collect(Collectors.toList())
- Returns a modifiable list (usually an ArrayList).
- ex:-
  List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

  evenNumbers.add(1);   // this gives mutable list so this can be modified here




-------------------------



## Optional Class in Java
- Introduced in Java 8 to avoid NullPointerException and handle null values safely.
- Represents a value that may or may not be present, avoiding null-related issues.
- Reduces explicit null checks, making code cleaner and more readable.

# Key Points:-
- Optional.empty(): Represents a value that is not present (i.e., null).
- isPresent(): Returns true if the value is present, otherwise false.
- orElseThrow(): Throws an exception if the value is not present
- Optional.of(T value): Creates an Optional with a non-null value. If the value is null, it 
  throws a NullPointerException.




## Generics in Java
- Provides type safety and eliminates type casting.
- Allows reusable code that works with any data type.
- Common type parameters: <V> (Value), <E> (Element), <K> (Key), <T> (Type)
- ex:- This example shows how a generic class Box<T> works with different data types (Integer and String).
  // Generic class
  class Box<T> {
      private T value;
    
      public void setValue(T value) {
          this.value = value;
      }
    
      public T getValue() {
          return value;
      }
  }

  public class Main {
      public static void main(String[] args) {
          Box<Integer> intBox = new Box<>();
          intBox.setValue(10);
          System.out.println(intBox.getValue());  // Output: 10
        
          Box<String> strBox = new Box<>();
          strBox.setValue("Hello");
          System.out.println(strBox.getValue());  // Output: Hello
      }
  }


------------------------------------------

## final, finally and finalize
# final Keyword in Java
- Once a variable is declared as final, its value cannot be changed (it becomes constant).
- ex:- 
  final int MAX_SPEED = 120;
  // MAX_SPEED cannot be modified later

- A final method cannot be overridden by subclasses.
- ex:-
  class Car {
    final void startEngine() {
        System.out.println("Engine started");
    }
  }

  class SportsCar extends Car {
      // This will cause a compile-time error
      // void startEngine() { ... }  // Cannot override final method
  }



# Using try-catch and finally (for finally block)
- try Block: Contains code that may throw an exception.
- catch Block: Handles the exception if it occurs.
- finally Block: Always executes, regardless of an exception, for cleanup 
                 (e.g., closing files, releasing resources, or ending connections).

- ex
  try {
    int result = 10 / 0; // May throw ArithmeticException
  } catch (ArithmeticException e) {
      System.out.println("Cannot divide by zero!");
  } finally {
      System.out.println("Execution finished.");
  }



# finalize()
- Called by the garbage collector before an object is destroyed (rarely used).
- ex:-
  @Override
  protected void finalize() {
      System.out.println("Object is being garbage collected.");
  }

------------------------


## Immutability
- It means an object’s state cannot be changed after it’s created.
- These objects are useful for thread safety (because their state can’t change) and security (data is not tampered).
- String and Wrapper Classes are examples of immutable classes.
- ex:-
  String str = "Hello";
  // str = "World";  // creates a new String object, original "Hello" remains unchanged

  Integer num = 10;
  // num = 20;  // creates a new Integer object, original num remains unchanged




## Super Class
- A class inherited by other classes (called subclasses).
- Contains common attributes and methods for reuse.
- Enables code reusability and modularity through inheritance.


## super Keyword:-
- Refers to the parent class from a subclass.
- Used to access parent class methods, variables, and constructors.
- ex:- 
  // superclass
  class Animal {  
    void sound() {  
        System.out.println("Animal makes a sound");  
    }  
  }

  class Dog extends Animal {  
    
      @override
      void sound() {  
          System.out.println("Dog barks");  
      }  
      void display() {  
          super.sound(); // Calls parent class method  
          System.out.println("Dog also makes sounds!");  
      }  
  }

  public class Main {  
      public static void main(String[] args) {  
          Dog dog = new Dog();  
          dog.display();  

          Animal a = new Animal();
          a.sound();     // Output: Animal makes a sound
      }  
  }



=> Output:-
   Animal makes a sound
   Dog also makes sounds!




## Upcasting and Downcasting
# Upcasting
- Treating a child class object as a parent class object.
- ex:-
  class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
  }

  class Dog extends Animal {
      @Override
      void sound() {
          System.out.println("Dog barks");
      }

      void play() {
          System.out.println("Dog is playing");
      }
  }

  public class Test {
      public static void main(String[] args) {
          Animal animal = new Dog(); // Upcasting
          animal.sound(); // Calls overridden method
 
          // animal.play(); // ❌ Error: play() not accessible using parent reference
      }
  }


// Output
- Dog barks  

- play() is not accessible because it's defined only in the child class.



# Downcasting
- Treating a parent class object as a child class object.
- ex:-
  class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
  }

  class Dog extends Animal {
      @Override
      void sound() {
          System.out.println("Dog barks");
      }

      void play() {
          System.out.println("Dog is playing");
      }
  }

  public class Test {
      public static void main(String[] args) {
          Animal animal = new Dog(); // Upcasting
          Dog dog = (Dog) animal; // Downcasting
          dog.sound(); // Calls overridden method
          dog.play(); // Calls child-specific method
      }
  }


// Output
- Dog barks  
- Dog is playing  





# Autoboxing 
- Automatic conversion of primitive types (e.g., int, char) to their wrapper classes (e.g., Integer, Character).
- Allows primitives to be used in collections like ArrayList, which only accept objects.
- ex
  ArrayList<Integer> list = new ArrayList<>();
  list.add(5);  // 5 (int) is auto-boxed to Integer


# Unboxing
- Converts a wrapper class back to the corresponding primitive type.
- ex:-
  Integer a = 5 (autoboxing)
  int b = a (unboxing)






## Hashing
- Efficient way to store and retrieve data using key-value pairs.

# Key Components:
- Hash Table: Stores key-value pairs.
- Hash Function: Maps keys to indices.
- Collision Resolution: Open Addressing, Separate Chaining.

# Time Complexity:
- Average: O(1)
- Worst: O(n) (due to collisions)



## Hash table (imp)
- A data structure that maps keys to values, allowing for efficient storage and retrieval.
- Stores key-value pairs.

=> Methods:
- put(key, value): Stores the key-value pair in the hash table.
- get(key): Retrieves the value associated with the given key.
- remove(key): Removes the key-value pair from the hash table.


# Time Complexities:-
- Insertion: O(1) on average, O(n) in the worst case
- Search: O(1) on average, O(n) in the worst case
- Deletion: O(1) on average, O(n) in the worst case


# How HashSet Works Internally in Java?
- A HashSet internally uses a HashMap to store its elements.
- When an element is added, its hashCode() is calculated.
- The hashCode() determines the bucket where the element will be placed.
- If the bucket already contains an element, the new element is compared using the equals() method.
- If the element already exists (equals returns true), it is not added to the HashSet, ensuring uniqueness.





# Deadly Diamond Problem in Java
- Occurs when a class implements two interfaces with conflicting methods (same method name but different behavior).
- Java doesn’t allow multiple class inheritance, so no issue for classes.
- For interfaces, Java requires you to override conflicting methods, so you choose which behavior to apply.
- ex:-
  interface A {
    default void show() { System.out.println("A's show"); }
  }

  interface B {
      default void show() { System.out.println("B's show"); }
  }

  class C implements A, B {
      @Override
      public void show() { System.out.println("C's show"); } // Resolves conflict
  }

  public class Main {
      public static void main(String[] args) {
          C obj = new C();
          obj.show();   // Output: C's show
      }
  }


==============================================================
################# FILE HANDLING #############################

# File Handling
- It allows Java programs to create, read, update, and delete files.
- Used to store and retrieve data from external files.




## Key Classes for File Handling
# File
– Represents a file or directory path. Used to create, delete, and check file properties.

# FileReader
– Reads file content character by character. Suitable for reading text files.

# FileWriter
– Writes data to a file character by character. Suitable for writing text files.

# BufferedReader
– Wraps FileReader to read text more efficiently by reading chunks of data into a buffer.
- Allows reading a file line by line using readLine().

# BufferedWriter
– Wraps FileWriter to write text more efficiently by writing data in chunks into a buffer.
- Improves performance by reducing I/O calls.

# FileInputStream
– Reads raw binary data (like images, audio, or video) byte by byte. Suitable for non-text files.

# FileOutputStream
– Writes raw binary data (like images, audio, or video) byte by byte. Suitable for non-text files.



# BufferedReader/BufferedWriter are preferred over FileReader/FileWriter for better performance due to buffered I/O.
# FileInputStream/FileOutputStream are used for binary files.
# FileReader/FileWriter are used for text files.



# Try-with-resources
- It ensures resources are closed automatically after usage, even if an exception occurs.
- Simplifies resource management, especially with files and streams.
- No need for finally block to close resources manually.
- Prevents resource leaks and improves code efficiency.
- This ensures that resources like files, database connections, network sockets are closed automatically.
- ex:-
  try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {  
      String line;  
      while ((line = br.readLine()) != null) {  
          System.out.println(line);  
      }  
  } 
  catch (IOException e) {  
      e.printStackTrace();  // Prints exception details  
  }



# e.printStackTrace()
- Prints the complete error details (type, message, and line number).
- Helps find the exact cause and location of the error for debugging.




## BufferedReader vs InputStreamReader
# InputStreamReader
- Converts byte streams to character streams.
- Decodes bytes using a specified charset (e.g., UTF-8).
- ex
  InputStreamReader reader = new InputStreamReader(System.in);


# BufferedReader
- Reads text efficiently from a file.
- Uses an internal buffer (default size: 8KB) to read large chunks of data at once.
- Suitable for large files 
- Provides methods like readLine() to read a file line by line.
- ex
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));




# FileReader
- Reads the file content character by character.
- Suitable for small files.
- Less efficient for large files as it reads one character at a time.












## Applets
- Small Java program that runs in browser or applet viewer.
- Inherits from java.applet.Applet class.
- No main() method – uses lifecycle methods (init(), start(), stop(), destroy()).
- Used for interactive web apps (animations, games).
- Outdated – replaced by modern web tech (HTML5, JS).






====================================================================

################### JAVA and OOPS ####################################


# Procedural programming
- A programming approach where the program is divided into functions, each performing a specific task.
- It follows a top-down structure.

# OOP is a programming paradigm based on the concept of objects.
# The main method or any other method creates objects of a class to interact with its data and functionality.
# OOP helps in modularity, code reusability, and maintainability by organizing code into classes and objects.


 
=> advantages of using OOPS in JAVA

# Code Reusability:     (CMSC)
- OOP allows you to break down your code into smaller, manageable units called classes.
- These classes can be reused in different parts of the program or even in other projects, saving your
  time and effort.

# Maintenance and Debugging:
- OOP's modular nature makes it easier to locate and fix bugs. 
- Changes or updates to a specific class won't affect other parts of the program, reducing the risk of
  errors.

# Scalability:   
- New features can be added by extending existing classes or creating new ones, without affecting 
  the entire system.

# Collaborative Development:
- OOP enables teams to work on different parts of a project concurrently.
- Each team member can focus on a specific class or module without interfering with the work of others.




=> disadvantages of using oops in JAVA

# OOP programs are larger, leading to slower execution.
# Everything is treated as object in OOP so before applying it we need to have excellent thinking in terms 
  of objects.
# Not suitable for all types of problems.
# Testing becomes harder as objects need to be tested both in isolation and in combination.
# The creation and management of objects can affect the overall performance.



## Class and Object
# Class:-
- It is a user-defined data type.
  (data type which is created by the user)
- It defines the properties and behaviors that objects of that class will have. 


# Object:-
- An object is an instance of a class.
- Objects have their own unique data and can perform actions defined by 
  the methods of the class.
- Objects are created using the class name followed by the object name.



----------------------------------------------------------------------------------

- ex:-

public class Animal {
    
    private String name;
    private int health;
    public int age;

    // Constructor to initialize the object
    public Animal(String name, int health, int age) {
        this.name = name;
        this.health = health;
        this.age = age;
    }

    // Method to print a statement
    public void print() {
        System.out.println("This is a rare breed dog");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public static void main(String[] args) {
        // Create an Animal object using the constructor
        Animal A1 = new Animal("Husky", 69, 3);

        System.out.println("Dog name is " + A1.getName());
        System.out.println("Animal health is " + A1.getHealth());
        A1.print(); 
        System.out.println("Age is " + A1.age); 
    }
}




#OUTPUT-->
Dog name is Husky
Animal health is 69
This is a rare breed dog 
Age is 3

---------------------------------------------------------------


## Getters and setters
- They are pair of methods used to control access to the private members of a class in object-oriented programming.

# set - to modify the value (some cases we dont use this were we don't want to modify the value later after defining it)
# get - to return the value


ex-

public class Employee {
   
    private int salary;

    // Setter
    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Getter
    public int getSalary() {
        return salary;
    }

    public static void main(String[] args) {

        Employee myObj = new Employee();
        myObj.setSalary(50000);
        System.out.println(myObj.getSalary());
    }
}


#OUTPUT-->
50000



-----------------------------------------------------------------------------------------------


## Static vs Dynamic Binding
# Static Binding
- Static binding happens at compile-time when the method to be called is determined.
- It allows methods with the same name but different parameter types or numbers (method overloading).
- ex:-
  class Example {
    void display(int a) {
        System.out.println("Integer: " + a);
    }

    void display(String s) {
        System.out.println("String: " + s);
    }
  }
  public class Main {
      public static void main(String[] args) {
         Example obj = new Example();
         obj.display(10);        // Integer: 10
         obj.display("Hello");   // String: Hello
      }
  }


# Dynamic Binding
- Dynamic binding happens at runtime when the method to be called is determined based on the object.
- Similalr to method overriding (Parent and child classes both contain the same function with a different definition.
                                 i.e. return type and parameters.)
- ex:-
  class Parent {
    void show() {
        System.out.println("Parent class method");
    }
  }

  class Child extends Parent {
      @Override
      void show() {
          System.out.println("Child class method");
      } 
  }

  public class Main {
      public static void main(String[] args) {
          Parent obj = new Child();  // Dynamic binding
          obj.show();  // Output: Child class method
      }
  }











-----------------------------------------------------------------------------------------------


--> What are the main features of OOPs?

# 4 pillars or basic principles of OOPs
- Encapsulation
- Data Abstraction
- Polymorphism
- Inheritance





# Inheritance:-
- It is a mechanism by which a new class can inherit properties and behaviors from an
  existing class.
- Main purpose -> to increase code reusability.
- Also used to achieve Runtime Polymorphism.


- Existing class (base or parent class)
- New class (derived or child class)

- A class can inherit only one class but multiple interfaces.

---CODE--------------------------------------------------------------------------------



// Base class Human
public class Human {
    public int height;
    public int weight;

    private int age;

    // Setter for age
    public void setAge(int newAge) {
        this.age = newAge;
    }

    // Getter for age
    public int getAge() {
        return age;
    }
}


// Derived class Male
class Male extends Human {
    public String eyeColor;

    public void sleep() {
        System.out.println("Male is sleeping");
    }
}

public class Mortal {
    public static void main(String[] args) {
        Male obj1 = new Male();
        Human h1 = new Human();

        obj1.setAge(69);
        obj1.weight = 78;
        obj1.height = 180;
        obj1.eyeColor = "green";

        System.out.println("Age is " + obj1.getAge());
        System.out.println("Weight is " + obj1.weight);
        System.out.println("My height is " + obj1.height);
        System.out.println("Eye color is " + obj1.eyeColor);

        obj1.sleep();

        // h1 is an instance of Human; it does not have the eyeColor property
        System.out.println("Human height: " + h1.height);
        System.out.println("Human weight: " + h1.weight);
    }
}





#OUTPUT-->

Age is 69
Weight is 78
My height is 180
Eye color is green
Male is sleeping
Human height: 0
Human weight: 0
--------------------------------------------------------------------------------------------


---> TYPES OF INHERITANCE -
 
- Single Inheritance: Child class derived directly from the base class.

---CODE---------------------------
 
class Animal {
    public int age;
    public int weight;

    public void speak() {
        System.out.println("Speaking");
    }
}

class Dog extends Animal {
    // Inherits all public and protected members from Animal class
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.age = 12;
        d.speak();
        System.out.println(d.age);
    }
}


#OUTPUT 
Speaking 
12
----------------------------------

- Multiple Inheritance: A single class is inherited from two classes.

- Java doesn't support multiple inheritance.


-- CODE ---------------------------------------------

interface Camera {
    void takePhoto();
}


interface MusicPlayer {
    void playMusic();
}


class Smartphone implements Camera, MusicPlayer {

    @Override
    public void takePhoto() {
        System.out.println("Taking photo with 108MP camera...");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music through speakers...");
    }
}


public class Main {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone();
        phone.takePhoto();
        phone.playMusic();
    }
}



# Output
Taking photo with 108MP camera...
Playing music through speakers...




-----------------------------------------------------


- Multilevel Inheritance: Child class derived from the class which is also derived from another base class.


--CODE-----------------------------------------------

public class Animal {
    public int age;
    public int weight;

    public void speak() {
        System.out.println("Speaking");
    }
}

public class Dog extends Animal {
    // Inherits all public members from Animal class
}

public class GermanShepherd extends Dog {
    // Inherits all public members from Dog and Animal classes
}

public class Main {
    public static void main(String[] args) {
        GermanShepherd g = new GermanShepherd();
        g.speak();      
        g.age = 8;      
        System.out.println(g.age); 
    }
}


# OUTPUT 
Speaking 
8

-----------------------------------------------------

- Hybrid Inheritance : child class derived from multiple base classes and interfaces.


--CODE------------------------------------------------


interface Animal {
    void bark();
}

interface Human {
    void speak();
}

class BaseClass {
    public int age;
    public int weight;
    public String color;

    public void baseClassMethod() {   
        System.out.println("Method from BaseClass");
    }
}


class Hybrid extends BaseClass implements Animal, Human {

    @Override
    public void bark() {
        System.out.println("Barking");
    }

    @Override
    public void speak() {
        System.out.println("Speaking");
    }

    
    public void hybridClass() {
        System.out.println("It inherits from both interfaces");
    }
}


public class Main {
    public static void main(String[] args) {
        Hybrid obj1 = new Hybrid();
        obj1.speak();      
        obj1.bark();       
        obj1.age = 69;     
        System.out.println("Hybrid age is " + obj1.age);
        obj1.hybridClass(); 
        obj1.baseClassMethod(); 
    }
}



# OUTPUT 
Speaking
Barking
Hybrid age is 69
It inherits from both Animal and Human interfaces
Method from BaseClass

-----------------------------------------------------

- Heirarchial Inheritance: Multiple child classes inherit from a single parent class.

--CODE------------------------------------------------

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}


class Cat extends Animal {
  
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}


public class Main {
    public static void main(String[] args) {
        
        Dog d = new Dog();  
        Cat c = new Cat();  
      
        d.sound();  // Output: Dog barks
        c.sound();  // Output: Cat meows
    }
}






-----------------------------------------------------



## Polymorphism
- The word “Polymorphism” means having many forms.
- The same entity (function or object) behaves differently in different scenarios.
- It can be achieved through Method/function Overloading and virtual functions.



# Virtual Function:-
- It is a member function declared in a base class and can be overridden by a derived class.
- Mainly used to achieve Runtime polymorphism.
- Declared using 'virtual' keyword.


--CODE-------------------------------------------------------
(same ex for Method Overloading/function overloading here just the same func name is used thrice here in ex)


//basically passing different types of parameters and keeping the same function name 


class Polymorphism {

    // Method with 1 int parameter
    void func(int x) {
        System.out.println("Value of x-1 is " + x);
    }

    // Method with same name but 1 double parameter
    void func(double x) {
        System.out.println("Value of x-2 is " + x);
    }

    // Method with same name and 2 int parameters
    void func(int x, int y) {
        System.out.println("Value of x-3 and y-3 is " + x + ", " + y);
    }

    public static void main(String[] args) {
        Polymorphism obj1 = new Polymorphism();

        // Function being called depends on the parameters passed
        // func() is called with int value
        obj1.func(7);

        // func() is called with double value
        obj1.func(9.132);

        // func() is called with 2 int values
        obj1.func(85, 64);
    }
}


# OUTPUT-->
value of x-1 is 7
value of x-2 is 9.132   // agar 9 hota to fir se x-1 print hota
value of x-3 and y-3 is 85, 64


--------------------------------------------------------------------------

## Three Things Needed for Method Overloading:
# Different number of parameters
- ex:-
  void show(int a) {}
  void show(int a, int b) {}  // Overloaded: different number



# Different types of parameters
- ex:-
  void show(int a) {}
  void show(double a) {}  // Overloaded: different type


# Different order of parameters (if types are different)
- ex:-
  void show(int a, String b) {}
  void show(String b, int a) {}  // Overloaded: different order






A) Compile-Time Polymorphism (Static Polymorphism)
- Here, a function is called at the time of program compilation.
- Method overloading and operator overloading are examples.


=> TYPE:-
# Method / Function Overloading  (same polymorphism example , for now consider them as same thing).
- The process of overloading a method with the same name but different parameters.

# Operator Overloading (basically operator functionality can be changed like + used like - operator).
- It is an idea of giving special meaning to an existing operator without changing its original
  meaning.



# Advantages of Compile-time Polymorphism:
- Improves code clarity and allows for the use of a single name for similar procedures.
- Faster execution time since it is discovered early in the compilation process.



-------------------------------------------------------------------------------


B) Runtime Polymorphism (Dynamic Polymorphism | late binding)
- The actual implementation of the function is determined during the runtime or execution.
- Method overriding is an example of this method.

=> Type:-
# Method Overriding (Function Overriding)
- Parent and child classes both contain the same function with a different definition.
  i.e. return type and parameters.

- Using final keyword can prevent method overriding - in methods
- ex:- using final void speak in Animal class will stop overriding

--CODE--------------------------------------------------------------------------------

class Animal {
    void speak() {
        System.out.println("Speaking");
    }
}

class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("Barking");
    }
}

public class Main {
    public static void main(String[] args) {
       
        Dog d = new Dog(); 
        d.speak(); 

        Animal a = new Animal();
        a.speak();  

        Animal a = new Dog();
        a.speak(); 
        
    }
}


#OUTPUT-->
Barking 
Speaking 
Barking


----------------------------------------------------------------------------------------------


## Encapsulation
- Binding of data and methods (functions) that manipulate them into a single unit such that
  the sensitive data is hidden from the users.
- Basically, hiding sensitive data from users.



# BENEFITS:-
- It restricts direct access to the internal data of an object.
- This prevents accidental modification or corruption of data by external code.
- Encapsulation helps in controlling access to sensitive data.
- By making certain data private and providing controlled methods to manipulate it, you can prevent
  unauthorized tampering to critical information.
- Increases the reusability of the code.




-----CODE------------------------------------------------------------------------------------


public class Student {

    // Private attributes
    private String name;
    private int rollNo;


    public void setName(String newName) {
        this.name = newName;
    }

    public void setRollNo(int newRollNo) {
        this.rollNo = newRollNo;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public static void main(String[] args) {
        Student student = new Student();

        // Using setter methods to set values
        student.setName("John");
        student.setRollNo(12345);

        // Using getter methods to retrieve values
        System.out.println("Name: " + student.getName());
        System.out.println("Roll No: " + student.getRollNo());
    }
}




#OUTPUT-->
Name: John
Roll No: 12345


---------------------------------------------------------------------------------------------


# What is Abstraction?
- Abstraction is like presenting the essential parts of the program while hiding the unnecessary details
  (unwanted information). 
- Hiding unnecessary details.
- ex:- for instance, consider a TV remote. You know how to use it to change channels and adjust the 
       volume, but you don't need to know how pressing a button triggers those actions inside the remote.

---CODE---------------------------------------------------------------------------------


// Abstract class
abstract class Animal {
  // Abstract method (no implementation)
  abstract void sound();
  void buddy(){
    System.out.println("Immortal athena soul");
  }
}


class Dog extends Animal {
  @Override
  void sound() {
      System.out.println("Dog barks");
  }
}


class Cat extends Animal {
  @Override
  void sound() {
      System.out.println("Cat meows");
  }
  
}


public class Main {
  public static void main(String[] args) {
      Dog dog = new Dog(); 
      dog.sound();           

      Cat cat = new Cat(); 
      cat.sound();            
      cat.buddy();            
  }
}


# Output
Dog barks
Cat meows
Immortal athena soul

-------------------------------------------------------------------------------------------

# ADVANTAGES
- Only you can make changes to your data or function, and no one else can.
- It makes the application secure by not allowing anyone else to see the background details.
- Increases the reusability of the code.



## Difference between Abstract class & Interface
# Abstract keyword 
- Used to define abstract classes and abstract methods.


# Abstract Method
- A method declared without implementation (no body).
- Declared using the abstract keyword.
- Must be overridden in a subclass.
- Exists only in an abstract class or interface.


# Abstract class
- Declared using abstract keyword.
- Cannot be instantiated directly (cannot create object of an abstract class using new keyword).
- Can have a constructor
- Does not support multiple inheritance (a class can extend only one abstract class).
- Methods can have any access modifier (public, private, protected, default).
- Can have abstract methods (methods without implementation) and concrete methods (methods with implementation).

- ex:-
  // Abstract class
  abstract class Animal {
      abstract void sound();   // Abstract method
      void eat() {             // Concrete method
         System.out.println("Eating");
      }
  }

  class Dog extends Animal {
      
      @Override  
      void sound() {
          System.out.println("Barking");
      }
  }

  public class Main {
      public static void main(String[] args) {
          Dog d = new Dog();
          d.sound();  // Output: Barking
          d.eat();    // Output: Eating
      }
  }



# Interface 
- A blueprint for a class, declared using the interface keyword.
- Cannot be instantiated directly.
- Cannot have a constructor.
- Supports multiple inheritance (a class can implement multiple interfaces).
- All methods are public by default.
- Can have only abstract methods (methods without implementation).

- ex:-
  // Interface
  interface Animal {
      void sound();  // Method declaration
  }

  class Dog implements Animal {
      public void sound() {
          System.out.println("Barking");
      }
  }

  public class Main {
      public static void main(String[] args) {
          Dog d = new Dog();
          d.sound();  // Output: Barking
      }
  }





## Use Abstract class vs Interface
# Abstract class
- When classes are closely related and share common code.
- When you need constructors or instance variables.


# Interface
- When you want to define common behavior for unrelated classes.
- When you need multiple inheritance (class can implement many interfaces).



---------------------



## Types of interfaces 
# Normal interface 
- An interface that can have multiple abstract methods (abstract methods).
- ex
  interface Vehicle {
      void start();
      void stop();
  }

  class Car implements Vehicle {
      public void start() {
          System.out.println("Car started");
      }

      public void stop() {
          System.out.println("Car stopped");
      }
  }



# Functional 
- An interface that has only one abstract method. 
- It can have multiple default or static methods.
- Used in lambda expressions and method references for clean and concise code.
- ex
  interface Calculator {
      int add(int a, int b);  // Single abstract method
  }

  public class Main {
      public static void main(String[] args) {
          Calculator calc = (a, b) -> a + b;  // Lambda expression
          System.out.println(calc.add(5, 3));  // Output: 8
      }
  }



# Marker 
- An interface that does not contain any methods. 
- It is used to mark or tag classes with metadata.
- Often used with frameworks or libraries to provide special behavior to classes
  (Example: If a class implements Serializable, its objects can be saved to a file or sent over a network.)

- ex
  interface Serializable {}  // Marker interface

  class Person implements Serializable {
    // Class implementation
  }





-----------------------

# class -> class = extends
- ex
class Animal {
    void makeSound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Woof!");
    }
}



# class -> interface = implements
- ex
interface Animal {
    void makeSound();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Woof!");
    }
}



# interface -> interface = extends
- ex
interface Animal {
    void makeSound();
}

interface Pet extends Animal {
    void play();
}





--------------------------------------------------------------------------------------------


## Access modifiers
- These are keywords used to control the visibility and accessibility of class members
  (attributes and methods) from outside the class.
- Ex:- public, private, protected amd default. 


=> If no access modifier is written 
- No modifier on a class → Default (package-private) class
- No modifier on variables/methods/constructors → Default (package-private) members



# Public:-
- Accessible from anywhere (same class, same package, different packages, subclasses).
- ex:-
  public class Example {
    public int data = 10;  // Accessible anywhere
    public void display() {
        System.out.println("Public Method");
    }
  }



# Private:-
- Accessible only within the same class.
- Used for encapsulation and to hide implementation details.
- ex:-
  public class Example {
     private int data = 10;  // Accessible only within this class
     private void display() {
         System.out.println("Private Method");
     }

     public int getData() {
         return data; // Public method to access private data
     }
  }


# Protected:-
- Accessible within the same class
- In subclasses (even in different packages due to inheritance)
- Within the same package
- Even in derived classes (classes that inherit from the base class <--> in inheritance).
- ex:-
  class Parent {
    protected int data = 20;
    protected void display() {
        System.out.println("Protected Method");
    }
  }

  class Child extends Parent {
      void show() {
          System.out.println(data);  // Accessible in subclass
      }
  }


# Default (Package-Private)
- Accessible only within the same package.
- Not accessible in other packages (even in subclasses).
- If nothing is mentioned then the class considers this for its attributes.
- ex:-
  class Example {
    int data = 30;  // Package-private by default
    void display() {
        System.out.println("Default Method");
    }
  } 


----------------------------------------------------------------------------------------------





## CONSTRUCTOR :-   
- A special method that is automatically called when an object is created.
- Purpose of constructor is to construct object and assign values to the object's members.


# Why we need constructor?
- Initializes object variables at creation.
- Prevents uninitialized variables, avoiding unpredictable behavior.


# Characteristics:-
- Same name as the class.
- No return type (not even void).
- Constructor is only called once, when an object is created. 
- Memory allocation happens when an constructor is called.
- Can be overloaded (multiple constructors with different parameters).
- If not defined, Java provides a default constructor.

- ex:-
      class Student {  
        String name;  

       // Default Constructor  
       public Student() {  
          System.out.println("Constructor is called");  
       }  

       public static void main(String[] args) {  
          Student s = new Student(); // Calls constructor  
       }  
     }

 


## Types of Constructors (3 types)
# Default constructor 
- Created implicitly by compiler if you don’t define any constructor.
- Always a no-arg constructor.
- Initializes objects with default values (0, null, false, etc).


# Parameterized constructor
- Takes parameters to initialize an object with specific values.

# Copy constructor 
- Used to create a new object as a copy of another object.
- Not built-in like C++, but you can define it yourself.






# No-Argument Constructor (user-defined) (Not a type but a user defined constructor)
- You write it explicitly with no parameters.
- Can have custom initialization logic.


# Ex:-

package constructor;

public class Animal {

    int age;
    String name;

    // 1. Default Constructor  (provided already by the compiler)
    Animal() {
        System.out.println("Default constructor called");
    }

    // 2. No-Argument Constructor (explicitly written)
    Animal(int dummy) {  // used dummy just to differentiate otherwise no need
        age = 2;
        name = "Rhino";
        System.out.println("No-argument constructor called");
    }

    // 3. Parameterized Constructor
    Animal(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("Parameterized constructor called");
    }

    // 4. Copy Constructor
    Animal(Animal other) {
        this.age = other.age;
        this.name = other.name;
        System.out.println("Copy constructor called");
    }

    void display() {
        System.out.println("Age: " + age + ", Name: " + name);
    }

    public static void main(String[] args) {
        Animal a1 = new Animal();                // Default
        Animal a2 = new Animal(0);               // No-arg (explicit)
        Animal a3 = new Animal(5, "Tiger");      // Parameterized
        Animal a4 = new Animal(a3);              // Copy

        a1.display();
        a2.display();
        a3.display();
        a4.display();
    }
}




// Output
Default constructor called
No-argument constructor called
Parameterized constructor called
Copy constructor called
Age: 0, Name: null
Age: 2, Name: Rhino
Age: 5, Name: Tiger
Age: 5, Name: Tiger



-------------



   


## Constructor vs Method 
# Constructor 
- A special method that is automatically called when an object is created.
- Purpose of constructor is to construct object and assign values to the object's members.
- Same name as the class.
- No return type (not even void).
- Automatically called when an object is created using the new keyword.

# Method / Functions
- Used to perform specific actions or operations.
- Can have any name (not necessarily the class name).
- Must have a return type (e.g., void, int, String, etc.).
- Explicitly called using object or class reference.








## this keyword:-
- Represents the current object in Java.
- Used primarily in constructors and methods to reference the current object.
- Allows an object to access its own instance variables and methods.

---CODE---------------------------------------------------------------------------------------
   
class Car {
    String color;

    Car(String color) {
        this.color = color;  
    }

    void displayColor() {
        System.out.println("Car color: " + this.color);
    }

    public static void main(String[] args) {
        Car myCar = new Car("Red");

        myCar.displayColor();  // Output: Car color: Red
    }
}


--------------------------

## Keywords in Java:-
# Static keyword 
- Belongs to the class, not objects.
- Shared across all objects.
- Accessed using the class name.
- Static methods don’t need an object to be called.


## this keyword:-
- Represents the current object in Java.
- Used primarily in constructors and methods to reference the current object.
- Allows an object to access its own instance variables and methods.


# New keyword
- Used to allocate memory for an object or array.
- Creates an instance of a class.


# final Keyword in Java
- Once a variable is declared as final, its value cannot be changed (it becomes constant).
- ex:- final int x = 10;


# volatile keyword
- It is used to ensure that all threads see the same value of a variable, even if the value is 
  changed by another thread.
- ex:- volatile int count;


# synchronized keyword
- Locks an object to allow only one thread to access it at a time.
- ex:- synchronized void display() {}


# Atomic variables
– Provides thread-safe operations without locking.
- ex:- AtomicInteger count = new AtomicInteger(0);


# volatile and synchronized keyword & atomic variables are used to implement synchronization in java.

------------------------------------------------------------------------------------------------------

## In Java, everything is technically pass-by-value, but for objects, the reference (memory address) 
   is passed by value.


# Pass by value -->
- Primitive types (e.g., int, float) are passed by value.
- A copy of the value is passed to the method.
- Changes made to the parameter inside the method do not affect the original variable.

---CODE------------------------------------------------------------------------------------------

public class PassByValue {
    static void update(int n) {
        n++;  // Only modifies the local copy
        System.out.println("Inside update: " + n);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Before update: " + n);
        update(n);
        System.out.println("After update: " + n);
    }
}


//output 
 Before update: 5
 Inside update: 6
 After update: 5




----------------------------------------------------------------------------------------------

# Pass by reference -->
- Changes to the object's fields inside the method affect the original object.
- Java does not support true pass-by-reference like C++.  

--CODE---------------------------------------------------------------------------------------


class Person {
    int age;
    Person(int age) {
        this.age = age;
    }
}

public class PassByReference {
    static void update(Person p) {
        p.age++;  // Modifies the original object
        System.out.println("Inside update: " + p.age);
    }

    public static void main(String[] args) {
        Person p = new Person(5);
        System.out.println("Before update: " + p.age);
        update(p);
        System.out.println("After update: " + p.age);
    }
}


//output 
  Before update: 5
  Inside update: 6
  After update: 6

-----------------------------------------------------------------------------------------------



# Deep Copy
- Creates a completely independent object, including all nested objects.
- Changes in the original object do not affect the copied object.
- Slower due to the duplication of content.


# Shallow Copy
- Creates a new object but copies references to nested objects.
- Changes in the copied object affect the original and vice versa.
- Faster as it does not duplicate nested objects.



---------------

## What are some commonly used Object Oriented Programming Languages?
- C++
- Java
- Python
- Javascript
- C#
- Ruby



------------

## Stack vs Heap
# Stack:
- Stores method calls and local variables.
- LIFO (Last In, First Out) order.
- Fast access, fixed size.
- Cleared automatically when the method ends.

# Heap:
- Stores objects and instance variables.
- Dynamic size (can grow/shrink).
- Slower access.
- Managed by the Garbage Collector.



----------------------------------------



## Packages
- A namespace that organizes related classes and interfaces and they provide access protection.
- Helps in code management and access control.
- Prevents name conflicts by providing a unique namespace.
- Used to structure large projects efficiently.
- For example, two classes can have the same name as long as they belong to different packages.


# Inbuilt package
- Predefined packages in Java (e.g., java.util, java.io).

# User-defined package
- Packages created by the developer to organize custom classes.  



-----------------------------------

# Inner class
- A class that is defined inside another class.
- Inner classes have access to the members (including private members) of their outer class.
- ex:-

class OuterClass {
    private String outerField = "Hello Athena";
    
    // Member inner class
    class InnerClass {
        void display() {
            System.out.println("Accessing outer class name: " + outerField);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();           // Output: Accessing outer class field: Outer Field
    }
}



-------------------

# Anonymous inner class
- It is a type of inner class that doesn't have a name.
- ex:-

class A {
    public void show() {
        System.out.println("hello mamba");
    }
}

public class Main {
    public static void main(String[] args) {
        // Using an anonymous inner class to extend class A
        A obj = new A() {
            @Override
            public void show() {
                System.out.println("Hello from anonymous inner class!");
            }
        };
        
        obj.show();        // Output: Hello from anonymous inner class!
    }
}


---------------------------------------


## Message Passing in Java
- It refers to objects communicating with each other by calling methods and exchanging data.
- Objects use methods to share or modify data.
- ex:-
  class Person {
    void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
  }

  public class Main {
      public static void main(String[] args) {
          Person person = new Person(); // Create an object
          person.greet("Athena"); // Send a message (method call)
      }
  }




## Local vs Instance variable
# Local variable 
- Declared inside a method, constructor, or block.
- Limited to the method, constructor, or block.
- Exists only during method or block execution.
- Cannot have access modifiers.


# Instance variable
- Declared in a class but outside any method or block.
- Accessible throughout the class via the object.
- Exists as long as the object exists.
- Can use access modifiers (public, private, protected).

- ex:-
  class Car {
    
    String color;  // Instance variable

    void setColor(String color) {
        // Local variable
        this.color = color;  // Using 'this' to refer to the instance variable
    }

    void displayColor() {
        System.out.println("Car color: " + color);  // Accessing the instance variable
      }
    }

    public class Main {
      public static void main(String[] args) {
          Car car = new Car();
          car.setColor("Blue");   // Local variable 'color' is used here
          car.displayColor();     // Instance variable 'color' is accessed
      }
    }





-------------------------

## Static vs Dynamic Binding in Java
# Static Binding
- Method binding that happens at compile time.
- Works with static, final, or private methods.
- Faster due to compile-time resolution.
- ex:-
  class StaticBinding {
    static void display() { // Static method
        System.out.println("Static Binding");
    }
  }

  public class Main {
     public static void main(String[] args) {
         StaticBinding.display(); // Resolved at compile-time
     }
  }



# Dynamic Binding
- Method binding happens at runtime, based on the actual object.
- Works with overridden methods.
- Slower due to runtime resolution.
- ex:-
  class Parent {
    void display() {
        System.out.println("Dynamic Binding: Parent");
    }
  }

  class Child extends Parent {
      @Override
      void display() {
          System.out.println("Dynamic Binding: Child");
      }
  }

  public class Main {
      public static void main(String[] args) {
          Child obj = new Child(); // Resolved at runtime
          obj.display(); // Calls Child's method
      }
  }



-------------------------------------------






##############################  DSA #################################

## Time Complexity
- Amount of time an algorithm takes to complete.

=> Worst case:-
- Absolute no of times an operation needs to be done.

=> Avg. Case:-
- Average no of times it will take for an algorithm to complete.

=> Best Case:-
- Fastest no of times it will take for an algorithm to complete.



## Space Complexity
- Amount of space necessary for an algorithm to complete.


## Sorting Algorithms
# Bubble Sort:-
- Compares adjacent elements and swaps if out of order. (O(n²))

# Selection Sort:-
- Finds the smallest element and places it in the correct position. (O(n²))
- Basically pushes the smallest element to leftmost possible side.

# Insertion Sort:-
- Builds the sorted array one element at a time. (O(n²))
- Takes an element and place it in correct order.

# Merge Sort:-
- Divides the array into halves, sorts them recursively, and merge. (O(n log n))

# Quick Sort:-
- Picks a pivot and sorts partitions recursively. (O(n log n) average, O(n²) worst case)

# Heap Sort:-
- Builds a heap and sorts the array. (O(n log n))





## Searching Algorithms
# Linear Search:-
- Checks elements one by one. (O(n))

# Binary Search:-
- Works on sorted arrays and divides the search space in half. (O(log n))






## Heap
- A complete binary tree satisfying the heap property.
- Min-Heap: Parent ≤ children.
- Max-Heap: Parent ≥ children.
- Applications: Priority Queues, Dijkstra’s Algorithm. (O(log n))





## Priority Queue (PQ)
# A data structure that stores elements with priorities, not  insertion  order.
# Operations:
- Insert:  Add  element (O(log n))
- Remove:  Remove highest priority (O(log n))
- Peek:  Retrieve  highest priority  element (O(1))
 
# Implementation:
- Heaps (Most Common): Min-Heap or Max-Heap.
- Arrays/Linked Lists (less efficient).

# Applications:- Dijkstra’s algorithm,  Huffman coding,  task scheduling.

# Example (Min-Heap):
- Insert [4, 2, 8, 5] → Heap: [2, 4, 8, 5].
- Dequeue → 2.






## Divide and Conquer
- Divides a problem into smaller subproblems, solves recursively, and combines solutions.
- Examples: Merge Sort, Quick Sort, Binary Search.


## Trie
- Tree  structure  for  efficient  string  storage  and  retrieval.
- Operations: Insert, Search, Delete. (O(L), where L = string length)
- Example: Autocomplete.





## Sliding Window
- Optimizes problems involving subarrays or substrings by maintaining a window.
- Examples: Maximum sum subarray, Longest substring without repeating characters.


## Two Pointers
- Uses two pointers to solve problems efficiently on arrays/strings.
- Examples: Finding pairs with a given sum, Merging two sorted arrays.


## Bit Manipulation
- Operates directly on bits using bitwise operators (AND, OR, XOR, etc).
- Common Tricks:
- Check Power of 2: (n & (n - 1)) == 0
- Count Set Bits: Use (n & (n - 1)) iteratively.
- Toggle K-th Bit: n ^ (1 << k)




## Greedy Algorithms
- It is a problem solving approach where we make the best choice at each step hoping that these
  choices will lead to best overall solution.
- Examples: Activity Selection, Huffman Coding, Fractional Knapsack.

# Advantages:-
- Simple and fast to implement
- Often gives an optimal solution quickly

# Disadvantages:-
- Might not always give optimal solutions for all problems.





## String Algorithms
# KMP Algorithm:-
- Pattern searching with preprocessing to avoid redundant comparisons. (O(n + m))

# Rabin-Karp Algorithm:-
- Uses hashing for substring search. (O(n + m))

# Manacher’s Algorithm:-
- Finds the longest palindromic substring. (O(n))






## Array vs arrayList
# Arrays
- Fixed size (e.g., int[] arr = new int[5] creates an array of size 5).
- Can store both primitives (like int, char) and objects.
- Basic functionality, limited to storing and accessing elements.
- Faster for direct access (e.g., arr[2]).

# ArrayList
- Dynamic size (e.g., ArrayList<Integer> list = new ArrayList<>()).
- Stores objects only (auto-boxing for primitives, e.g., int → Integer).
- Provides built-in methods for adding, removing, searching (e.g., list.add(10), list.remove(5)).
- Slightly slower due to resizing and method overhead (e.g., list.get(2)).



# Arrays.asList()
- Creates a fixed-size list backed by an array.
- Cannot change structure (add/remove elements).
- Good for cases requiring only read/update of values. 
- Wrap in ArrayList to enable adding/removing elements
- ex
=> List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));       
   list.add(4);  
   list.remove(1);  
   System.out.println(list);     // Output: [1, 3, 4]


=> List<Object> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,"A", "A", "A"));
   List<String> ans = new ArrayList<>();
   for(int i=list.size()-1; i>=0; i--){
        if(list.get(i).equals("A")){
           ans.add("A");
           list.remove(i);
        }
   }

   System.out.println(list);         // [1,2,3,4,5]
   System.out.println(ans);          // [A,A,A]


# Note:- here above straight loop will not work as traversing left to right if we remove elements
         the 5th index will be placed at 4th and will be skipped 






# Strings 
- A string is an object that represents a sequence of characters.
- Strings are immutable, meaning once created, their values cannot be changed.
- ex
  String name = "RAM"; // Immutable string
  char[] c = {'R', 'A', 'M'}; // Mutable character array
  c[0] = 'D'; // Now c is {'D', 'A', 'M'}





# Linked list
- It is a linear data structure consisting of a collection of nodes.
=> Each node contains:
 - Data: The value stored in the node.
 - Next Pointer: A reference to the next node's memory address.


=> Types:
- Singly Linked List
  Each node points to the next node only.

- Doubly Linked List
  Each node points to both the next and previous nodes.

- Circular Linked List:
  The last node points back to the first node, forming a circle.





## Stacks 
- A stack is a linear data structure that follows the Last In, First Out (LIFO) principle.

- Key Operations:
=> Push: Add an element to the top of the stack (O(1)).
=> Pop: Remove the top element from the stack (O(1)).
=> Peek: Retrieve the top element without removing it (O(1)).

# Stack Overflow:-
- Exceeding  capacity.

# Stack Underflow:-
- Attempting  to  pop  from  an  empty  stack.




## Queues
- A queue is a linear data structure that follows the First In, First Out (FIFO) principle.

- Key Operations:
=> Enqueue: Add an element to the rear of the queue (O(1)).
=> Dequeue: Remove the front element from the queue (O(1)).
=> Front/Peek: Retrieve the front element without removing it (O(1)).



## Recursion
- Solves  problems  by  reducing  them  to  smaller  instances  of  the  same  problem.

## Backtracking
- Explores  all  possibilities  and  backtracks  when  constraints  are  violated.
- Example Problems: N-Queens, Maze Solving, Subset Generation.




## Binary Tree 
- Each  node  has  at  most  two  children (left  and  right).
- root:- topmost node of tree.
- leaf nodes:- nodes with no children 
- internal nodes:- nodes that have atleast 1 children
- height:- length of longest path from root to a leaf.

## Types:
# Full Binary Tree: Every node has 0 or 2 children.
# Complete Binary Tree: All levels are fully filled except possibly the last, which is filled 
                        from left to right.
# Perfect Binary Tree: All internal nodes have 2 children, and all leaves are at the same level.
# Skewed Tree: All nodes have only one child (either left or right).




## Binary Search Tree (BST)
# Special type of binary tree where left subtree has smaller values, and right subtree has 
  larger values.
# Operations:
- Insert:  O(log n)
- Search:  O(log n)
- Delete:  O(log n)
- Inorder traversal: O(n)
- Preorder traversal: O(n)
- Postorder traversal: O(n)



## AVL Tree (Advanced topic not much needed)
- Self-balancing Binary Search Tree.

# Balance Factor: Difference in heights of left and right subtrees (allowed values: -1, 0, +1).
# Rotations:
- LL (Right rotation)
- RR (Left rotation)
- LR (Left-Right rotation)
- RL (Right-Left rotation)

# Operations:
- Insert: O(log n)
- Delete: O(log n)





## Red-Black Tree
# A self-balancing binary search tree with properties that ensure balance.
# Properties:
- Every node is either Red or Black.
- Root is always Black.
- No two consecutive Red nodes.
- Equal number of Black nodes in all paths from root to leaves.

# Balancing Rules:-
- If the parent of a new node is Red, resolve violations by recoloring or rotations.
- Rotations: Similar to AVL tree rotations (LL, RR, LR, RL).

# Operations:-
- Insert:  O(log n)
- Delete:  O(log n)

# Search, Insert, Delete: O(log n) (looser balancing than AVL but still efficient).
# Used in implementations of associative containers 
  (e.g., TreeMap, TreeSet, std::map, std::set).











## Graphs
- It is a collection of nodes (vertices) and edges (connections) between them.
- It represents relationships (e.g., cities connected by roads, social network friendships).

=> Applications Of Graph:-
- GPS Navigation, Network Routing, Social Networks, Web Crawling, Recommendation Systems, Circuit Design, Task Scheduling, etc.

# Graph Types:-
- Directed Graph: Edges have direction (e.g., one-way roads).
- Undirected Graph: Edges have no direction (e.g., two-way roads).
- Weighted Graph: Edges have weights (e.g., distance, cost).
- Unweighted Graph: Edges have no weights.
- Cyclic Graph – Contains a cycle (can return to the starting node).
- Acyclic Graph – No cycles (e.g., DAG – Directed Acyclic Graph).
- Bipartite Graph - It is a graph if you can divide its nodes into two groups such that no two adjacent nodes are in the same group.
- Connected Graph – There is a path between every pair of vertices.
- Disconnected Graph – Some vertices are not reachable from others.
- Complete Graph – Every pair of distinct vertices is connected by a unique edge.
- Sparse Graph – Very few edges.
- Dense Graph – Large number of edges close to maximum possible.
- Multigraph – A graph where multiple edges between two nodes are allowed.
- Self-loop – An edge connecting a node to itself.
- Tree – A connected acyclic undirected graph.
- Forest – A collection of disjoint trees.

# Key Terms
- Nodes (Vertices) → A point in the graph.
- Edge → A connection between two vertices.
- Degree → Number of edges connected to a vertex.
- Incoming Edge (Indegree) → Number of edges coming into a node.
- Outgoing Edge (Outdegree) → Number of edges going out from a node.
- Path → A sequence of vertices where each adjacent pair is connected.
- Total degree of a graph = 2 * Edges

# Graph Representation:
- Adjacency List – Stores neighbors (better for sparse graphs).
- Adjacency Matrix – 2D array of connections (better for dense graphs).

---

## Graph Traversal Algorithms

# BFS (Breadth-First Search)
- Explores all neighbors level by level.
- Uses Queue (FIFO).
- Applications: Shortest path in unweighted graphs, Web Crawlers, Social Network Friend Suggestions.

# DFS (Depth-First Search)
- Explores as far as possible along each branch before backtracking.
- Uses Stack (or recursion).
- Applications: Cycle Detection, Maze Solving, Connected Components.

# Flood-fill Algorithm
- DFS/BFS based algorithm used in 2D grids.
- Applications: Image Fill, Region Coloring, Island Counting.

# Bipartite Graph Check
- Use BFS/DFS with 2-coloring to check whether a graph is bipartite.

# Union-Find / Disjoint Set Union (DSU)
- Used to detect cycles and manage connected components.
- Applications: Kruskal's MST, Network Connectivity.
- Operations:
  - `Find`: Determine root of the set.
  - `Union`: Combine two sets.
  - Optimized using Path Compression + Union by Rank.

---

### Graph Algorithms

## Shortest Path Algorithms

# Dijkstra's Algorithm
- Finds the shortest path from a source node to all other nodes (Uses Priority Queue).
- Cannot handle negative weights.
- Time: O((V + E) log V) with Min-Heap.

# Bellman Ford Algorithm
- Handles negative weights.
- Slower than Dijkstra.
- Detects negative weight cycles.
- Time: O(V * E)

# Floyd-Warshall Algorithm
- All-pairs shortest path algorithm.
- Time: O(V³)
- Works with negative weights (no negative cycles).

---

## Minimum Spanning Tree (MST) Algorithms
- A spanning tree is a subset of a graph that includes all vertices with the minimum number of edges (V-1) and no cycles.
- A minimum spanning tree (MST) is a spanning tree with the minimum possible total edge weight.
- Used in network design, clustering, and optimization problems.

# Prim’s Algorithm (Greedy Approach)
- Starts with any node and expands MST by adding the smallest edge that connects a new node.
- Uses a priority queue (Min-Heap) for efficient edge selection.
- Time Complexity: O(E log V)
- Best when the graph is dense.

# Kruskal’s Algorithm (Greedy + Disjoint Set)
- Sorts all edges by weight and adds the smallest edge that doesn’t form a cycle.
- Uses Union-Find (Disjoint Set) to detect cycles efficiently.
- Time Complexity: O(E log E)
- Best when the graph is sparse.

---

# Common Graph Problems & Their Solutions

| Problem                          | Solution                             |
|----------------------------------|--------------------------------------|
| Shortest Path (Unweighted)       | BFS                                  |
| Shortest Path (Weighted)         | Dijkstra, Bellman-Ford               |
| All-Pairs Shortest Path          | Floyd-Warshall                       |
| Minimum Spanning Tree (MST)      | Kruskal, Prim                        |
| Cycle Detection (Undirected)     | DFS, Union-Find                      |
| Cycle Detection (Directed)       | DFS + Recursion Stack                |
| Topological Sorting              | DFS, Kahn’s Algorithm                |
| Strongly Connected Components    | Kosaraju’s Algorithm                 |
| Bipartite Check                  | BFS/DFS with 2-coloring              |
| Counting Connected Components    | DFS/BFS                              |
| Bridge & Articulation Point      | Tarjan’s Algorithm (DFS + Low Time)  |

---

# Topological Sorting (Only for DAGs) 
- Linear ordering of vertices in a DAG (Directed Acyclic Graph) where every directed edge (u → v) ensures u appears before v.
- Applicable only to DAGs (Graphs with no cycles).
- Used in: Task Scheduling, CI/CD Pipelines, Course Scheduling, Instruction Scheduling in Compilers
- Algorithms:
  - DFS-based
  - Kahn’s Algorithm (BFS-based)

---

## Trees (as Special Graphs)
- Trees are connected acyclic undirected graphs.

### Special Types of Binary Trees:
- **Full Binary Tree**: Every node has 0 or 2 children.
- **Perfect Binary Tree**: All internal nodes have 2 children and all leaves at same level.
- **Complete Binary Tree**: All levels filled except possibly last, filled left to right.
- **Skewed Binary Tree**:
  - Left Skewed – All nodes have only left child.
  - Right Skewed – All nodes have only right child.
- **Balanced Binary Tree**: Height difference of left and right subtree is at most 1.

---

## Dynamic Programming (DP)

- A problem-solving technique used for optimization.
- Breaks down a complex problem into smaller subproblems and stores the results of solved subproblems to avoid redundant work.

=> Two main approaches:
- **Top-Down (Memoization)**: Solve the problem recursively and store results to avoid recomputation.
- **Bottom-Up (Tabulation)**: Solve the problem iteratively by solving all subproblems first.

---

# Common DP Problems

- **Fibonacci Number** → DP with Memoization / Tabulation
- **Longest Common Subsequence (LCS)** → DP with 2D table
- **Knapsack Problem (0/1)** → DP (2D or 1D optimization)
- **Coin Change (Unbounded Knapsack)** → DP
- **Longest Increasing Subsequence (LIS)** → DP (O(n²) or Binary Search O(n log n))
- **Edit Distance** → DP with 2D table
- **Matrix Chain Multiplication** → DP
- **Rod Cutting Problem** → DP
- **Palindrome Partitioning** → DP with substring checking
- **Subset Sum / Partition Equal Subset Sum** → DP
- **DP on Trees** → E.g., Max path sum, subtree sums, etc.

---








==================================================================================================
==================================================================================================






























