//OOP7_5. Word-frequency counter: given a sentence (as a String), split it into words (you know .split(" ") from Strings), then use a HashMap<String, Integer> to count how many times each word appears. Print each word with its count.
import java.util.HashMap;
public class OOP7_5 {
    public static void main(String[] args) {
        String sentence = "java is fun and java is powerful";
        String[] words = sentence.split(" ");

        HashMap<String, Integer> frequency = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if (frequency.containsKey(word)) {
                frequency.put(word, frequency.get(word) + 1);
            } else {
                frequency.put(word, 1);
            }
        }

        for (String word : frequency.keySet()) {
            System.out.println(word + " --> " + frequency.get(word));
        }
    }
}
