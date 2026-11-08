//ABS_7: Three levels. abstract class A with abstract x() and y(). abstract class B extends A implements only x() (prints x done). class C extends B implements y() (prints y done). Call both on new C(). Then try new B().
abstract class A {
    abstract void x();
    abstract void y();
}
abstract class B extends A{
    void x() {
        System.out.println("x done");
    }
}
class C extends B{
    void y() {
        System.out.println("y done");
    }
}
public class OOP5_12 {
    public static void main(String[] args) {
        C c = new C();
       // B b = new B();   B is abstract and cannot be initialized
        c.x();
        c.y();
    }
}
