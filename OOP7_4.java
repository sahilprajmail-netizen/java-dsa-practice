//OOP7_4. Create a TreeMap<String, Integer> with 5 names and ages added in random order. Loop through and print it — observe the names come out sorted alphabetically, unlike a HashMap.
import java.util.TreeMap;
public class OOP7_4 {
    public static void main(String[] args) {
        TreeMap<String, Integer> names = new TreeMap<>();
        names.put("Sahil", 21);
        names.put("Shlok", 22);
        names.put("Ritik", 23);
        names.put("Ralph", 17);
        names.put("Henry", 18);
        for(String keys: names.keySet()){
            System.out.println(keys + "-->" + names.get(keys));
        }

    }
}
