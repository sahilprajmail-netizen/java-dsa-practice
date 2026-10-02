// SB4. Write a method isPalindrome(String s) that checks if a word reads the same forwards and backwards (like "madam"). Use StringBuilder's .reverse() internally to help check it, and return true/false. Test it with one palindrome and one non-palindrome.
public class SB4 {

    static boolean isPalindrome(String s) {

        StringBuilder sb = new StringBuilder(s);

        sb.reverse();

        return s.equals(sb.toString());
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("hello"));
    }
}