import java.util.HashMap;
import java.util.TreeMap;
//CF_4: Counting words
//String sentence = "to be or not to be";. Use split(" ") and a loop to fill a HashMap<String,Integer> with word counts (use getOrDefault). Print new TreeMap<>(map).

public class OOP7_9 {
    public static void main(String[] args) {
String sentence = "to be or not to be";
String[] words = sentence.split(" ");
HashMap<String, Integer> map = new HashMap<>();
        for(String word : words){
            map.put(word, map.getOrDefault(word, 0) + 1 );
        }
        System.out.println(new TreeMap<>(map));
    }
}
