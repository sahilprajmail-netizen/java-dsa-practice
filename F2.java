// F2. Write max(int a, int b), max(int a, int b, int c) and max(double a, double b). Each returns the biggest value. Call all three.
public class F2 {
    public static void main(String[] args) {
        int result = max(7,6);
        System.out.println(result);
        int result2 = max(5,6,8);
        System.out.println(result2);
        double result3 = max(5.2,5.3);
        System.out.println(result3);

    }

    static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    static int max(int a, int b,int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }
static double max(double a , double b){
            if ( a >b){
                return a;
            }else{
                return b;
            }
        }
    }


