//Create an ArrayList<Integer> with 6 numbers. Loop through it and count how many are greater than 10.
import java.util.ArrayList;
public class AL5 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(4);
        nums.add(11);
        nums.add(55);
        nums.add(12);
        nums.add(9);
        int count = 0;
        for(int i = 0; i<nums.size();i++){
            if(nums.get(i) > 10){
                count ++;

            }
        }
        System.out.println(count);
    }
}
