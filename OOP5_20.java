//INT_6: interface Swimmer { void swim(); } and interface Flyer { void fly(); }. Duck implements both (prints Duck swims and Duck flies). Write a static method letSwim(Swimmer s) in main’s class that calls s.swim(). Pass a Duck to it, then call fly() on the duck.
interface Swimmer{
    void swim();
}
interface Flyer{
    void fly();
}
class Duck implements Swimmer, Flyer{
    @Override
    public void swim() {
        System.out.println("Duck swims");
    }

    @Override
    public void fly() {
        System.out.println("Duck flies");
    }
}
public class OOP5_20 {
    static void letSwim(Swimmer s){
        s.swim();
    }
    public static void main(String[] args) {
        Duck d = new Duck();
        letSwim(d);
            d.fly();

    }
}
