// SB1. Create a StringBuilder, .append() three separate words one at a time to build a sentence, then print the final result.
public class SB1 {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("I");
        sb.append(" am");
        sb.append(" learning");
        sb.append(" java");
        System.out.println(sb);
    }
}
