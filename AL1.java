// AL1. Create an ArrayList<String> of 4 fruits using .add(). Print the whole list, then print just the fruit at index 2 using .get().
import java.util.ArrayList;
public class AL1 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("mango");
        fruits.add("apple");
        fruits.add("grapes");
        fruits.add("kiwi");
        System.out.println(fruits);
        System.out.println(fruits.get(2));
    }
}
