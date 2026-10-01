// STR5. Take a sentence with extra spaces around it, like " Hello World ". Use .trim() to clean it, then print the cleaned version with its new length.
public class STR5 {
    public static void main(String[] args) {
        String sentence = "    Hello World    ";
      sentence =   sentence.trim();
        System.out.println(sentence + " " + sentence.length());
    }
}
