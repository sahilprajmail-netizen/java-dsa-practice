//F5. Write factorial(int n) with a local variable result inside it. Call it twice from main: factorial(3) and factorial(5). Then explain in one line why result from the first call doesn't affect the second.
public class F5 {
    public static void main(String[] args) {
int first =  factorial(5);
        System.out.println(first);
        int second = factorial(4);
        System.out.println(second);
    }
    static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
             result = i * result;
        }
        return result;
    }
}
