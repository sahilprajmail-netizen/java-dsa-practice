// OOP2_2. Create a class Counter with a static block that initializes static int startValue = 100; and prints "Counter initialized". Add an instance variable id set in the constructor to startValue, then increment startValue for the next object. Create 3 counters and print each one's id.
class Counter2 {
    static int startValue;

    static {
        startValue = 100;
        System.out.println("Counter initialized");
    }

    int id;

    Counter2() {
        id = startValue;
        startValue++;
    }
}

public class OOP2_2 {
    public static void main(String[] args) {

        Counter2 c1 = new Counter2();
        Counter2 c2 = new Counter2();
        Counter2 c3 = new Counter2();

        System.out.println(c1.id);
        System.out.println(c2.id);
        System.out.println(c3.id);
    }
}