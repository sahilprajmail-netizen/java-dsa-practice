import java.util.Scanner;
// Q9. print muliplication table of n
public class Q9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the digit: ");
        int a = s.nextInt();
        int i;
        for(i=1;i<=10;i++) {
            System.out.println(a + "*" + i + "=" + (a*i));
        }

    }
}
