import java.util.Scanner;
// Q10. sum of first n natural number
public class Q10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the digit: ");
        int n = s.nextInt();
        int i;
        int sum = 0;
        for(i=0;i<=n;i++){
            sum = sum + i;
        }
        System.out.println(sum);



    }
}
