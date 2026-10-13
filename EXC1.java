//EXC1. Write code that divides two numbers where the divisor is 0, wrapped in try/catch for ArithmeticException. Print a friendly message instead of letting it crash. Add a finally block that prints "Done".

public class EXC1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try{
            System.out.println(a/b);
        } catch (ArithmeticException e ){
            System.out.println("cant divide by zero");
        }finally {
            System.out.println("Done");
        }

    }
}
