//OOP3_4. Polymorphism demo: using the animal/dog classes from OOP3_1, also create cat extends animal overriding sound() to print "Meow". In main, create an animal[] array holding a dog and a cat (declared as animal), loop through it, call sound() on each — observe that each prints its own version.
class animal{
String name;
void sound(){
    System.out.println("Some generic sound");
}
}
class dog extends animal{
    void sound(){
        System.out.println("Woof");
    }
}
class cat extends animal {
    void sound(){
        System.out.println("Meow");
    }
}
public class OOP3_4 {
    public static void main(String[] args) {
        cat c = new cat();
        dog d = new dog();
         animal[] animals = {new dog() , new cat()};
        for(int i = 0;i< animals.length;i++){
            animals[i].sound();

        }
    }
}