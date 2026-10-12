//OOP7_3. Create a LinkedList<Integer> of 5 numbers using .add(). Use .addFirst() to insert a number at the front and .addLast() to insert one at the end. Print the full list.
import java.util.LinkedList;
public class OOP7_3 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(4);
        numbers.add(64);
        numbers.add(33);
        numbers.add(86);
        numbers.add(74);
        numbers.addFirst(10);
        numbers.addLast(23);
        System.out.println(numbers);
    }
}
