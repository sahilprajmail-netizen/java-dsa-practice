// SB3. Create a StringBuilder with a sentence. Use .insert() to add a word at the beginning, and print the result.
public class SB3 {
    public static void main(String[] args) {
        StringBuilder sentence =  new StringBuilder("am learning java");
        System.out.println(sentence.insert(0, "I "));


    }
}
