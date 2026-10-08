// OOP5_5. Create a class Robot that implements two interfaces: Walkable (method walk()) and Talkable (method talk()). Implement both methods in Robot with any print statements. In main, create a Robot and call both methods.
interface Walkable {
    void walk();
}

interface Talkable {
    void talk();
}

class Robot implements Walkable, Talkable {

    @Override
    public void walk() {
        System.out.println("Robot is walking");
    }

    @Override
    public void talk() {
        System.out.println("Robot is talking");
    }
}

public class OOP5_5 {
    public static void main(String[] args) {

        Robot r = new Robot();

        r.walk();
        r.talk();
    }
}
