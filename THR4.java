//THR4. Demonstrate a race condition: create a Counter class with a plain int count and increment(). Start two threads that each call increment() 10000 times, join() both, print the final count. Run it several times and note it’s usually below 20000.
public class THR4 {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count: " + counter.count);
    }
}