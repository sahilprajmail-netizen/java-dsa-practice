//ABS_3: abstract class Fruit with abstract String taste();. Mango returns Sweet, Lemon returns Sour. Use one reference: Fruit f = new Mango(); print f.taste(), then f = new Lemon(); print again.
abstract class Fruit{
    abstract String taste();
}
class Mango extends Fruit{
    String taste(){
       return "Sweet";
    }
}
class Lemon extends Fruit{
    String taste(){
        return "Sour";
    }
}
public class OOP5_8 {
    public static void main(String[] args) {
Fruit f = new Mango();
        System.out.println(f.taste());
f = new Lemon();
        System.out.println(f.taste());

    }
}
