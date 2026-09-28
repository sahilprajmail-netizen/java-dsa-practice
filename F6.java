// F6. Create static int x = 50; at class level. Write test(int x) that prints both the parameter x and the class-level x. Call test(10). It should print 10 and 50.
public class F6 {
    static int x = 50;
    public static void main(String[] args) {
test(10);
    }
   static void test(int x){
       System.out.println(x);
       System.out.println(F6.x);
   }

}
