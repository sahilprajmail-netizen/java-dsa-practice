//ABS_1: abstract class Bird with abstract void fly();. Sparrow implements it printing Sparrow flies. Call it.
abstract class Bird{
    abstract void fly();
}
class Sparrow extends Bird{
void fly(){
    System.out.println("Sparrow flies");
}
}
public class OOP5_6 {
    public static void main(String[] args) {
Sparrow s = new Sparrow();
s.fly();
    }
}
