//INT_7: interface A1 { void a(); }, interface B1 extends A1 { void b(); }. class C1 implements B1 with only b() implemented. Compile.Expected: error C is not abstract and does not override abstract method a() in A. Add a(), then call both (A method, B method).
interface A1{
    void a();
}
interface B1 extends A1{
    void b();
}
class C1 implements B1{
    @Override
    public void a() {
        System.out.println("A method");

    }

    @Override                //C1 is not abstract and does not override abstract method a() in A1

    public void b() {
        System.out.println("B method");
    }

}
public class OOP5_21 {
    public static void main(String[] args) {
C1 c = new C1();
c.a();
c.b();
    }
}
