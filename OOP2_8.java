//OOP2_8. Make class Config with static String mode; and a static block that sets mode = "DEBUG" and prints Loading config. In main, print Start, then print Config.mode twice.
class Config{
    static String mode;
    static {
        mode = "DEBUG";
        System.out.println("Loding config. ");
    }
}
public class OOP2_8 {
    public static void main(String[] args) {
        System.out.println("Start");
        System.out.println(Config.mode);
        System.out.println(Config.mode);
    }
}
