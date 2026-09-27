// Q5. check if the number is palindrome (121 --> yes, 123--> no)
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the digit: ");
        int n = s.nextInt();
        int lastdigit;
        int original = n;
        int reverse = 0;
        while(n > 0) {
            lastdigit = n % 10;
            reverse = reverse * 10 + lastdigit;
            n = n / 10;
        }
          if(original==reverse) {
              System.out.println("palindrome");
          } else {
              System.out.println("not palindrome");
          }



        }
    }

