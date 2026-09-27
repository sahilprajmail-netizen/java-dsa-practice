import java.util.Scanner;
// Q1. Print numbers 1 to n
public class Q1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = s.nextInt();
        int i;
        for(i=1;i<=n;i++ ){
            System.out.println(i);
        }
    }
}
