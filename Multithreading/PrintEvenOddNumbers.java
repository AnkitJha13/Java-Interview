// One thread prints even numbers, another prints odd numbers up to 10

package multithreading;

public class EvenThread extends Thread{

    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}



public class OddThread extends Thread{

    public void run() {
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("Odd: " + i);
        }
    }
}



public class EvenOddDemo {
    public static void main(String[] args) {
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();

        evenThread.start();
        oddThread.start();

    }
}




// Output
Even: 2
Even: 4
Even: 6
Even: 8
Even: 10
Odd: 1
Odd: 3
Odd: 5
Odd: 7
Odd: 9
