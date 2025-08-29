// What happens if you call run() instead of start()

package multithreading;

public class RunVsStart extends Thread{
    public void run(){
        System.out.println("Running in thread: " + Thread.currentThread().getName());
    }
}



public class mainRunVsStart {
    public static void main(String[] args) {
        RunVsStart runVsStart = new RunVsStart();
      //  runVsStart.run();  // Direct call - no new thread  (use alternatively b/w run and start)


        runVsStart.start(); // Correct way - creates new thread
    }
}



// Output
Running in thread: main  (use run for this)
Running in thread: Thread-0 (use start for this)
