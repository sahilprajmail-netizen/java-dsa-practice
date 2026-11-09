//INT_3: interface Notifier with void send(String msg);. EmailNotifier prints Email: + msg, SmsNotifier prints SMS: + msg. Put both in a Notifier[] and loop with send("Hello").
interface Notifier{
    void send(String msg);
}
class EmailNotifier implements Notifier{
    public void send(String msg){
        System.out.println("Email: " + msg);
    }
}
class SmsNotifier implements Notifier{
    public void send(String msg){
        System.out.println("SMS: " + msg);
    }
}
public class OOP5_17 {
    public static void main(String[] args) {
Notifier[] n = {new EmailNotifier(), new SmsNotifier()};
        for(int i = 0; i < n.length; i++){
            n[i].send("Hello");
        }
    }
}

