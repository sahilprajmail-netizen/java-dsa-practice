//INT_4: interface Config1 { int MAX_USERS = 5; }. Print Config1.MAX_USERS. Then try Config1.MAX_USERS = 10;.
interface Config1 {
    int MAX_USERS = 5;
}
public class OOP5_18 {
    public static void main(String[] args) {
        System.out.println(Config1.MAX_USERS);
     //   Config1.MAX_USERS = 10;          cannot assign a value to static final variable MAX_USERS
    }
}
