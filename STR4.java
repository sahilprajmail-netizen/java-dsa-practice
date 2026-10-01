
// STR4. Take a sentence. Check if it .contains() a specific word, and print "Found" or "Not found" based on the result.
public class STR4 {
    public static void main(String[] args) {
        String sentence = "He is practicing questions";
        if(sentence.contains("is")){
            System.out.println("Found");
        }else {
            System.out.println("Not found");
        }
    }
}