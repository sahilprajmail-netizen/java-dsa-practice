//GC_5: Two type slots
//Make class Pair1<K, V> with a constructor and getKey(), getValue(). Create Pair1<String,Integer>("Ravi", 20) and Pair1<Integer,String>(1, "one"). Print key and value of each with a space between.
class Pair1<K,V>{
    K key;
    V value;
    Pair1(K key, V value){
this.key = key;
this.value = value;
    }
    K getKey(){
        return key;
    }
    V getValue(){
        return value;
    }
}
public class OOP6_10 {
    public static void main(String[] args) {
Pair1<String,Integer> p1 = new Pair1<>("Ravi" , 20);
Pair1<Integer, String> p2 = new Pair1<>(1 , "one");
        System.out.println(p1.getKey() +" " +  p1.getValue());
        System.out.println(p2.getKey() + " " + p2.getValue());
    }
}
