// AL4: Create an ArrayList<Integer> with 6 numbers of your choice. Loop through it and print the sum of all elements.
import java.util.ArrayList;
public class AL4 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(2);
        nums.add(4);
        nums.add(5);
        nums.add(8);
        nums.add(7);
        int sum = 0;
        for(int i = 0; i<nums.size(); i++) {
            sum = sum + nums.get(i);
        }
        System.out.println(sum);
    }
}
