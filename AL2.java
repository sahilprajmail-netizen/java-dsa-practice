// AL2: Create an ArrayList<Integer> and add 5 numbers using .add(). Then use .remove() to delete the number at index 2. Print the list before and after removing, so you can see the difference.
import java.util.ArrayList;
public class AL2 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(1);
        nums.add(3);
        nums.add(7);
        nums.add(6);
        System.out.println(nums);
        nums.remove(2);
        System.out.println(nums);

    }
}