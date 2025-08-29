// Create a thread by extending Thread class


package multithreading;

public class myThread extends Thread{

    public void run(){
        System.out.println("thread is running");
    }
}




public class mainThread {
    public static void main(String[] args) {
        myThread t = new myThread();
        t.start();
        System.out.println("main thread is running");
    }
}





// Output
Main thread running (the order is not guaranteed in multithreading program so anything can be printed here first)
Thread running
