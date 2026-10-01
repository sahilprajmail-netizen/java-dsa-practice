//STR7. Take a sentence with multiple words. Use .split(" ") to break it into a String[], then loop through and print each word on its own line.
public class STR7 {
    public static void main(String[] args) {
        String sentence = "I am learning java and practicing everyday";
        String[] words = sentence.split(" ");
        for (int i=0;i<words.length; i++ ){
            System.out.println(words[i]);

        }
    }
}
