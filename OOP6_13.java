//GC_8: Bounded generic
//static <T extends Comparable<T>> T bigger(T a, T b) returns a.compareTo(b) > 0 ? a : b. Test bigger(3, 9), bigger("apple", "mango"), bigger(2.5, 1.5).

public class OOP6_13 {
    static <T extends Comparable<T>> T bigger(T a, T b) {
        return a.compareTo(b) > 0 ? a : b;

    }
    public static void main(String[] args) {
        System.out.println(bigger(3, 9));
        System.out.println(bigger("apple", "mango"));
        System.out.println(bigger(2.5, 1.5));

    }
}
