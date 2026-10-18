//THR2. Create two threads using lambdas: one prints numbers 1 to 5, the other prints letters A to E, each with Thread.sleep(500) between prints. Start both and observe the interleaving.
public class THR2 {
    public static void main(String[] args) {
Runnable task1 = () -> {
    for(int i = 1;i<=5; i++){
        System.out.println(i);
        try{
            Thread.sleep(500);
        } catch (InterruptedException e ){
                System.out.println(e);
            }
        }
};
Runnable task2 = () -> {
    for(char ch = 'A'; ch<='E'; ch++) {
        System.out.println(ch);
        try{
            Thread.sleep(500);
        } catch (InterruptedException e){
            System.out.println(e);
        }
    }
};
Thread t1 = new Thread(task1);
t1.start();
Thread t2 = new Thread(task2);
        t2.start();
    }
}
