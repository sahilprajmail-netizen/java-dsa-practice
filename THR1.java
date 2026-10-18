//THR1. Create a class implementing Runnable that prints "Hello from " + Thread.currentThread().getName(). Start 3 threads from it in main. Run it a few times and notice the output order can change between runs.
class Task implements Runnable{
    public void run(){
      //  System.out.println("Hello from " + Thread.currentThread().getName());
    }
}
public class THR1 {
    public static void main(String[] args) {
        Task task = new Task();
        Thread t1 = new Thread(task , "Worker 1");
        t1.start();
        Thread t2 = new Thread(task , "Worker 2");
        t2.start();
        Thread t3 = new Thread(task , "Worker 3");
        t3.start();

    }
}
