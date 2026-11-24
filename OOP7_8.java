import java.util.HashMap;
//CF_3: HashMap basics
//HashMap<String,Integer>: put pen=10, book=5, then put("pen", 12). Print get("pen"), get("book"), get("bag"), getOrDefault("bag", 0), and size().
public class OOP7_8 {
    public static void main(String[] args) {
        HashMap<String, Integer> prices = new HashMap<>();
        prices.put("pen" , 10);
        prices.put("book" , 5);
        prices.put("pen" , 12);
        System.out.println(prices.get("pen"));
        System.out.println(prices.get("book"));
        System.out.println(prices.get("bag"));
        System.out.println(prices.getOrDefault("bag" , 0));
        System.out.println(prices.size());
    }
}
