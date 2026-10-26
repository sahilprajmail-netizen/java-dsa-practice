//OOP3_7 (multilevel). Vehicle1 has start() printing Vehicle1 starts. Car1 extends Vehicle1 has drive() printing Car1 drives. SportsCar extends Car1 has turbo() printing Turbo on. Create a SportsCar and call all three methods.
class Vehicle1{
    void starts(){
        System.out.println("Vehicle1 starts");
    }
}
class Car1 extends Vehicle1 {
    void drive(){
        System.out.println("Car1 drives");
    }
}
class SportsCar extends Car1{
    void turbo(){
        System.out.println("Turbo on");
    }
}
public class OOP3_7 {
    public static void main(String[] args) {
        SportsCar SC = new SportsCar();
        SC.starts();
        SC.drive();
        SC.turbo();
    }
}
