//THR3. Use join(): start a thread that prints "Worker done" after a sleep(1000). In main, call join() on it, then print "Main finished". Confirm “Main finished” always prints last. Then remove the join() and observe the difference.
public class THR3 {
    public static void main(String[] args) {

        Thread worker = new Thread(() -> {
            try {
                Thread.sleep(1000);
                System.out.println("Worker done");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        worker.start();

        try {
            worker.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Main finished");
    }
}