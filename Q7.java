import java.util.Scanner;
// Q7. find the largest of three numbers( without array)
public class Q7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int max =a;
        if(b>max) {
            max = b;
          if(c>max)
                max=c;

            }
        System.out.println( max);



    }
}
