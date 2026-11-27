import java.util.TreeSet;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashSet;
//CF_6: Three Set flavors
//List [4, 2, 4, 7, 2, 9, 1]. Print new LinkedHashSet<>(list), then new TreeSet<>(list), then new HashSet<>(list).size().

public class OOP7_11 {
    public static void main(String[] args) {
ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(4);
        list.add(7);
        list.add(2);
        list.add(9);
        list.add(1);
        System.out.println(new LinkedHashSet<>(list));
        System.out.println(new TreeSet<>(list));
        System.out.println(new HashSet<>(list).size());
    }
}
