//J8_3. Given List<Integer> nums = List.of(5, 12, 8, 20, 3, 15);, use a stream to filter out numbers greater than 10, then print the resulting list.
import java.util.List;
import java.util.stream.*;
public class J8_3 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(5, 12, 8, 20, 3, 15);
       List<Integer> result =  nums.stream()
            .filter(n->n>10)
               .toList();
        System.out.println(result);
    }
}
