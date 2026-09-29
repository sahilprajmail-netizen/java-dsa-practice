// AR8. Create an ArrayList<Integer> (instead of a plain array), add 5 numbers to it using .add(), then print the whole list and its size using .size().
import java.util.ArrayList;
public class AR8 {
    public static void main(String[] args) {
      ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(3);
        numbers.add(6);
        numbers.add(7);
        System.out.println(numbers);
        System.out.println(numbers.size());
    }
}
