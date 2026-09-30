// AL3: Create an ArrayList<Integer> with 5 numbers. Use .set() to change the value at index 3 to 100. Print the list before and after.
import java.util.ArrayList;
public class AL3 {
    public static void main(String[] args) {
        ArrayList<Integer> nums =  new ArrayList<>();
        nums.add(3);
        nums.add(2);
        nums.add(6);
        nums.add(8);
        nums.add(4);
        System.out.println(nums);
        nums.set( 3,100);
        System.out.println(nums);
    }
}
