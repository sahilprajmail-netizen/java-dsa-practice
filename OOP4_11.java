//OOP4_11: Protected method
//Animal_1 has protected void sound() printing Some sound. Dog_1 extends Animal_1 has void bark() that calls sound() and then prints Woof. Call bark() in main.
class Animal_1 {
    protected void sound() {
        System.out.println("Some sound");
    }
}
    class Dog_1 extends Animal_1{
        void bark(){
            sound();
            System.out.println("Woof");
        }
    }

public class OOP4_11 {
    public static void main(String[] args) {
     Dog_1 d = new Dog_1();
     d.bark();

    }
}
