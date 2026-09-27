import java.util.Scanner;
// Q2. print even/odd numbers from 1 to n
public class Q2 {
    public static void main(String[] args) {
        System.out.print(" enter number: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i;
        for(i=1;i<=n;i++) {
            if(i%2==0) {
                System.out.println(i + "even");
            } else {
                  System.out.println(i + "odd");
                }

        }


    }
}
