//J8_1. Create a functional interface Calculator with one method int operate(int a, int b). In main, use a lambda to implement it for addition, call it, print the result. Then create a second lambda for multiplication using the same interface, call and print that too.
import java.util.Arrays;
import java.util.List;
@FunctionalInterface
interface Calculator{
    int operate(int a, int b);
}
public class J8_1 {
    public static void main(String[] args) {
        // Lambda for addition
        Calculator addition = (a,b)->a+b;
        System.out.println(addition.operate(5,5));

        // Lambda for multiplication
        Calculator multiplication = (a,b)->a*b;
        System.out.println(multiplication.operate(5,3));
    }
}
