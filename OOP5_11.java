//ABS_6: abstract class MathOps with abstract int add(int a, int b); and abstract int multiply(int a, int b);. BasicMath implements both. Call with 3 and 4.
abstract class MathOps{
    abstract int add(int a, int b);
    abstract int multiply(int a, int b);
}
class BasicMath extends MathOps{
    int add(int a, int b) {
        return a + b;
    }  int multiply(int a , int b){
            return a * b;
        }
}
public class OOP5_11 {
    public static void main(String[] args) {
BasicMath bm = new BasicMath();
        System.out.println(bm.add(3,4));
        System.out.println(bm.multiply(3,4));
    }
}
