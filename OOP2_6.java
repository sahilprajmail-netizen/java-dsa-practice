//OOP2_6. Make class Calc with static int add(int a, int b) and static int max(int a, int b). Call them as Calc.add(4, 5) and Calc.max(7, 3) without new. Then, as a comment, try using a normal field inside a static method, and write down the error message.
class Calc{
    static int add(int a, int b){
        return a + b;
    }
    static int max(int a, int b){
        if(b>a){
            return b;
        } else {
            return a;
        }
    }
    /*
    static void test() {
        System.out.println(number);
    }

    Error:
    non-static variable number cannot be referenced
    from a static context
    */
}
public class OOP2_6 {
    public static void main(String[] args) {
        System.out.println(Calc.add(4,5));
        System.out.println(Calc.max(7,3));
    }
}
