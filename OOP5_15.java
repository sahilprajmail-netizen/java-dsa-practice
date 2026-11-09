//INT_1: interface Power with void on();. Bulb implements Power printing Bulb on. Use Power p = new Bulb(); p.on();
interface Power{
    void on();
}
class Bulb implements Power{
 public void on(){
        System.out.println("Bulb on");
    }
}
public class OOP5_15 {
    public static void main(String[] args) {
Power p = new Bulb();
        p.on();
    }
}
