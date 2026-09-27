import java.util.Scanner;
// Q6.count digits in a number
public class Q6 {
    public static void main(String[] args) {
        System.out.println("enter the digit: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0;
        while(n>0){
            count = count + 1;
            n = n/10;

        }
        System.out.println(count);
    }
}
