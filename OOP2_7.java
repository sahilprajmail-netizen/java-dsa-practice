//OOP2_7. Make class Counter1 with int a = 0;, static int b = 0;, and a method inc() that does a++; b++;. Create c1 and c2. Call c1.inc() twice and c2.inc() once. Print c1.a, c2.a, then Counter1.b.
class Counter1{
    int a = 0;
    static int b = 0;
    void inc(){
         a++;
         b++;
    }
}
public class OOP2_7 {
    public static void main(String[] args) {
        Counter1 c1 = new Counter1();
        Counter1 c2 = new Counter1();
        c1.inc();
        c1.inc();
        c2.inc();
        System.out.println(c1.a);
        System.out.println(c2.a);
        System.out.println(Counter1.b);

    }
}
