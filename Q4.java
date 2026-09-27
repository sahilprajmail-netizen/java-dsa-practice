import java.util.Scanner;
// Q4. reverse a number(eg 1234 --> 4321)
public class Q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = s.nextInt();
        int reverse = 0;
        int lastdigit;
        while( n > 0){
             lastdigit = n%10;
            reverse = reverse*10 + lastdigit;
             n = n/10;
        }
        System.out.println(reverse);

    }
}
