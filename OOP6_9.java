//GC_4: The fix
//Make class Box3<T> with private T value;, void set(T v) and T get(). Make a Box3<Integer> holding 10 and a Box3<String> holding “Java”, and print both. Then try intBox.set("x");.
class Box3<T>{
    private T value;
    void set(T v){
this.value = v;
    }
    T get(){
        return value;
    }
}
public class OOP6_9 {
    public static void main(String[] args) {
Box3<Integer> b = new Box3<>();
Box3<String> b1 = new Box3<>();
b.set(10);
b1.set("Java");
        System.out.println(b.get());
        System.out.println(b1.get());
       //  b.set("x");                     java.lang.String cannot be converted to java.lang.Integer
    }
}
