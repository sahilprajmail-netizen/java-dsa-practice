//OOP4_5: Static counter with private state
//Ticket has a private static count and a private id. The constructor increments count and assigns id = count. Add getId() and a static getCount(). In main, create 3 tickets, print each id, then print the count. Also try Ticket.count in main.
class Ticket{
    private static int count = 0;
    private int id;
    Ticket(){
        count++;
        id = count;
    }

    public int getId() {
        return id;
    }
    static int getCount(){
        return count;
    }
}
public class OOP4_5 {
    public static void main(String[] args) {
Ticket t1 = new Ticket();
Ticket t2 = new Ticket();
Ticket t3 = new Ticket();
        System.out.println(t1.getId());
        System.out.println(t2.getId());
        System.out.println(t3.getId());
        System.out.println("Total: " + Ticket.getCount());
       // System.out.println(Ticket.count);    count has private access in Ticket
    }
}
