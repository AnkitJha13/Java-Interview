// Start two threads that print numbers 1–50 using Join


package multithreading;

public class NumberThread extends Thread{

    String name;

    NumberThread(String name){
        this.name = name;
    }

    public void run(){
        for(int i=1;i<=50;i++){
            System.out.println(name + "prints " + i);
        }
    }
}




public class mainNumberThread {
    public static void main(String[] args) throws InterruptedException {
        NumberThread t1 = new NumberThread("Thread-1");
        NumberThread t2 = new NumberThread("Thread-2");

        t1.start();

        t1.join();  // Main thread waits until t1 finishes
        t2.start();
    }
}




// Output
// Numbers will be printed like when first thread finishes then second thread starts printing values
1
2
till 50 for thread t1
then 
1
2
till 50 for thread t2
