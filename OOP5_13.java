//ABS_8: abstract class Payment with abstract double fee(double amt);. Upi returns 0, Card returns 2% of amt, NetBanking returns a flat 10. Make a Payment[] with all three, and for amount 1000 print each fee and the total.
abstract class Payment{
    abstract double fee(double amt);
}
class Upi extends Payment{
    double fee(double amt){
        return 0;
    }
}
class Card extends Payment{
    double fee(double amt) {
        return amt * 2/100;
    }
}
class NetBanking extends Payment{
    double fee(double amt) {
        return 10;
    }
}

public class OOP5_13 {
    public static void main(String[] args) {
        Payment[] p = {new Upi(), new Card(), new NetBanking()};
        double total = 0;
        for(int i = 0; i < p.length; i++){
            System.out.println(p[i].fee(1000));
            total = total + p[i].fee(1000);
        }
        System.out.println("Total: " +  total);
    }
}
