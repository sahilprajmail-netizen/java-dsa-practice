// STR8. Take a String. Loop through it character by character using .charAt() and a for loop, and count how many vowels (a, e, i, o, u) it contains.
public class STR8 {
    public static void main(String[] args) {
        String word = "Programming";
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i)=='e' || word.charAt(i)=='i' || word.charAt(i)=='o' || word.charAt(i)=='u' ) {
                count ++;

            }

            }
        System.out.println("no. of vowels: " + count);


        }
    }
