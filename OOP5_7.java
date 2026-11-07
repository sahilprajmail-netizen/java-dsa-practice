//ABS_2: abstract class Appliance with abstract void turnOn(); and a normal void plugIn() printing Plugged in. Fan prints Fan running in turnOn(). Call plugIn() then turnOn().
abstract class Appliance{
    abstract void turnOn();
    void plugIn(){
        System.out.println("Plugged in");
    }
}
class Fan extends Appliance{
    void turnOn(){
        System.out.println("Fan running");
    }
}
public class OOP5_7 {
    public static void main(String[] args) {
        Fan f = new Fan();
        f.plugIn();
        f.turnOn();
    }
}
