// OOP3_1. Create Animal with a name field and method sound() that prints "Some generic sound". Create Dog extends Animal overriding sound() to print "Woof". In main, create a Dog, set its name, call sound().
class Animal{
    String name;
    void sound(){
        System.out.println("Some generic sound");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Woof");
    }
}
public class OOP3_1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.name = "Tuffy";
        d.sound();
    }
}

