//J8_4. Using the same list, use a stream with .map() to square every number, then print the result. Then use .filter() + .count() in one chain to count how many numbers in the original list are even.
import java.util.List;
import java.util.stream.*;
public class J8_4 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(5, 12, 8, 20, 3, 15);
        List<Integer> result =  nums.stream()
                .map(n->n*n)
                .toList();
        System.out.println(result);
 long count = nums.stream()
        .filter(n->n%2==0)
        .count();
        System.out.println(count);
    }
}
