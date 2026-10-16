//J8_2. Using built-in functional interfaces: create a Predicate<Integer> that checks if a number is greater than 10, and a Function<Integer, Integer> that doubles a number. Test both with a few values.
import java.util.function.Predicate;
import java.util.function.Function;
public class J8_2 {
    public static void main(String[] args) {
        Predicate<Integer> p = n->n>10;
        System.out.println(p.test(7));
        System.out.println(p.test(10));
        Function<Integer,Integer> doubleIt = n->n*2;
        System.out.println(doubleIt.apply(3));
        System.out.println(doubleIt.apply(0));

    }
}
