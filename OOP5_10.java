//ABS_5: abstract class Beverage with final void prepare() that prints Boiling water, calls brew(), then prints Pouring in cup. abstract void brew();. Tea prints Steeping tea in brew(). Call new Tea().prepare().
abstract class Beverage {
    final void prepare() {
        System.out.println("Boiling water");
        brew();
        System.out.println("Pouring in cup");
    }

    abstract void brew();
}
class Tea extends Beverage{

    void brew(){
        System.out.println("Steeping tea");
    }
}
public class OOP5_10 {
    public static void main(String[] args) {
        new Tea().prepare();
    }
}
