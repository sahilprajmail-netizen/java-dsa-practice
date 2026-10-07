//OOP4_4. Create two classes Parent and Child extends Parent in the same file (or same package). Give Parent a protected int value = 10;. In Child, add a method that prints value directly (no getter) — confirm protected lets a subclass access it directly, unlike private.
class Parent{
   protected int value = 10;
}
class Child extends Parent{
void showValue(){
    System.out.println(value);
}

}
public class OOP4_4 {
    public static void main(String[] args) {
        Child c = new Child();
c.showValue();
        }

}
