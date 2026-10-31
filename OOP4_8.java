//OOP4_8: Default access, same package
//Class Box1 with int size = 5; (no modifier). Class Main2 in the same file reads b.size and prints it.
class Box1{
    int size = 5;

}
public class OOP4_8 {
    public static void main(String[] args) {
        Box1 b = new Box1();
        System.out.println(b.size);
    }
}
