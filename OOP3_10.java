//OOP3_10 (polymorphism). Notification has send() printing Sending notification. EmailNotification, SmsNotification and PushNotification each override send() to print Sending email, Sending SMS and Sending push. Make a Notification[] array holding one of each child, then loop and call send() on every element.
class Notification{
    void send(){
        System.out.println("Sending notification");
    }
}
class EmailNotification extends Notification{
    @Override
    void send(){
        System.out.println("Sending email");
    }
}
class SmsNotification extends Notification{
    @Override
    void send(){
        System.out.println("Sending SMS");
    }
}
class PushNotification extends Notification{
    @Override
    void send(){
        System.out.println("Sending push");
    }
}
public class OOP3_10 {
    public static void main(String[] args) {
Notification[] notification = {
        new EmailNotification(),
        new SmsNotification(),
        new PushNotification()
};
for(Notification n: notification){
    n.send();
}
    }
}
