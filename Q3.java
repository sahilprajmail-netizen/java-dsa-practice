import java.util.Scanner;
// Q3. sum of digits of a number (eg 123 --> 1+2+3=6)
public class Q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number ");
        int n = s.nextInt();
        int sum = 0;
        while(n > 0){
            sum= sum+(n%10);
            n=n/10;
        }
        System.out.println("sum: " + sum);
    }
}
