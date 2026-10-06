//OOP3_3. Create Vehicle with field speed and method move() printing "Moving at " + speed. Create Car extends Vehicle and Bike extends Vehicle — no overrides needed. In main, create one of each, set their speed, call move() on both.
class Vehicle{
    double speed;
    void move(){
        System.out.println("Moving at " + speed);
    }
}
class Car extends Vehicle{

}
class Bike extends Vehicle{

}
public class OOP3_3 {
    public static void main(String[] args) {
        Car c = new Car();
        Bike b = new Bike();
        c.speed= 75.5;
        b.speed = 80.2;
        c.move();
        b.move();


    }
}
