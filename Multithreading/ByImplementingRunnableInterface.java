// Create a thread by implementing Runnable interface


package multithreading;

public class RunnableClass implements Runnable{
    @Override
    public void run() {
        System.out.println("runnable class running");
    }
}




public class mainRunnable {
    public static void main(String[] args) {
        Thread t =  new Thread(new RunnableClass());
        t.start();
        System.out.println("main runnable running");
    }
}




// Output
Main thread running (the order is not guaranteed in multithreading program so anything can be printed here first)
Runnable running
