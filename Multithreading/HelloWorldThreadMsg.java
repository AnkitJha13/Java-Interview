// One thread prints “Hello” and another prints “World”

package multithreading;

public class HelloWorldThread extends Thread{
    private String msg;

    HelloWorldThread(String msg){
        this.msg = msg;
    }

    public void run(){
        System.out.println(msg);
    }
}




public class HelloWorldThreadClass {
    public static void main(String[] args) {
        HelloWorldThread t1 = new HelloWorldThread("Hello");
        HelloWorldThread t2 = new HelloWorldThread("World");

        t1.start();
        t2.start();


    }
}




// Output
Hello
World

