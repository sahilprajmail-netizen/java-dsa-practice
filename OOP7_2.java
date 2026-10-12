//OOP7_2. Create a HashSet<String> and add 3 city names, including one deliberate duplicate. Print the set’s .size() to confirm the duplicate was dropped, then check .contains() for one city that exists and one that doesn’t.
import java.util.HashSet;
public class OOP7_2 {
    public static void main(String[] args) {
        HashSet<String> city = new HashSet<>();
        city.add("Mumbai");
        city.add("New Delhi");
        city.add("Mumbai");
        city.add("Bengaluru");
        System.out.println(city.size());
        System.out.println(city.contains("Bengaluru"));
        System.out.println(city.contains("Jaipur"));

    }
}
