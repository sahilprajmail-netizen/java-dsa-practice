//OOP3_6 (inheritance). Animal1 has name and eat(), which prints name + " is eating". Dog1 extends Animal1 adds bark(), which prints name + " says Woof". Create a Dog1, set the name to "Rex", and call eat() then bark().
class Animal1{
    String name;
    void eat(){
        System.out.println(name + " is eating");
    }
}
class Dog1 extends Animal1{
void bark(){
    System.out.println(name + " says Woof");
}
}
public class OOP3_6 {
    public static void main(String[] args) {
Dog1 d = new Dog1();
d.name = "Rex";
       d.eat();
       d.bark();
    }
}
