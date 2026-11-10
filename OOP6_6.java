//GC_1: Generic class (and the compile error it gives you)
//Box2<T> with set(T) and get(). Use Box2<Integer> (10) and Box2<String> (“Java”), print both. Then try intBox2.set("x") and Box2<int>.
class Box2<T>{
    T item;
    void setItem(T item){
        this.item = item;
    }
    T getItem(){
        return item;
    }
}
public class OOP6_6 {
    public static void main(String[] args) {
Box2<Integer> b = new Box2<>();
b.setItem(10);
Box2<String> b2 = new Box2<>();
b2.setItem("Java");
        System.out.println(b.getItem());
        System.out.println(b2.getItem());
        b2.setItem("X");
      //  Box2<int> b3 = new Box2<>();               unexpected type
        //  required: reference
        //  found:    int
      //  b.setItem("x");             incompatible types: java.lang.String cannot be converted to java.lang.Integer

    }
}
