// Start two threads that print numbers 1–50 concurrently


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
    
        t2.start();
    }
}




// Output
// Numbers will be printed alternately in random order
1
2
3
1
4
5
2
3 .......
