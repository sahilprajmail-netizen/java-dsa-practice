//OOP3_11 (casting). Animal2 has sound() printing Some sound. Dog2 extends Animal2 overrides it to print Woof and adds fetch() printing Fetching. Cat extends Animal2 overrides it to print Meow. Do Animal2 a = new Dog2();, call a.sound(), then use instanceof and a cast to call fetch(). Then do Animal2 b = new Cat(); and print b instanceof Dog2. As a comment, also try a.fetch() directly and write down the error.
class Animal2{
    void sound(){
        System.out.println("Some sound");
    }
}
class Dog2 extends Animal2 {
    @Override
    void sound() {
        System.out.println("Woof");
    } void fetch() {
            System.out.println("Fetching");
        }
    }

class Cat extends Animal2{
    @Override
    void sound(){
        System.out.println("Meow");
    }
}
public class OOP3_11 {
    public static void main(String[] args) {
Animal2 a = new Dog2();
a.sound();
if(a instanceof Dog2){
    Dog2 d = (Dog2) a;
    d.fetch();
}
Animal2 b = new Cat();
        System.out.println(b instanceof Dog2);
        // a.fetch(); // Compiler error: cannot find symbol - method fetch()
    }
}
