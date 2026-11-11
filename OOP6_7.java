//GC_2: Generic methods and bounds
//Write static <T extends Comparable<T>> T max(T a, T b) using compareTo. Test max(3,9), max("apple","mango").

public class OOP6_7 {
    static <T extends Comparable<T>> T max(T a, T b){
        if(a.compareTo(b) > 0){
            return a;
        }else{
            return b;
        }
    }
    public static void main(String[] args) {
        System.out.println(max(3,9));
        System.out.println(max("apple", "mango"));
    }
}
