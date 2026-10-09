//OOP6_2. Create a generic class Box<T> with set(T val) and get(). Create two Box objects — one Box<Integer>, one Box<String> — set and print each.
class Box<T>{
    T value;
    public void set(T val){
        value = val;
    }
    public T get(){
        return value;
    }
}
public class OOP6_2 {
    public static void main(String[] args) {
        Box<Integer> b = new Box<>();
        b.set(21);
        Box<String>  b1 = new Box<>();
        b1.set("Sahil");
        System.out.println(b.get());
        System.out.println(b1.get());


    }
}
