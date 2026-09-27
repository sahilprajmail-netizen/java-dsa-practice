import java.util.Scanner;
// Q8. simple calculator (add,sub,mul,div using switch)
public class Q8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double a = s.nextInt();
        System.out.println("enter operator (+,-,*,/): ");
        String op = s.next();
        System.out.println("enter second number: ");
        double b = s.nextInt();
        switch(op){
            case"+":
                System.out.println("result: " + (a+b));
                break;
            case"-":
                System.out.println("result: " + (a-b));
                break;
            case"*":
                System.out.println("result: " +(a*b));
                break;
            case"/":
                if(b==0){
                    System.out.println("npt divisible by 0");
                } else{
                    System.out.println("result: " + (a/b));
                }
                break;
            default:
                System.out.println("operator npt invalid");
        }
        s.close();

    }
}
