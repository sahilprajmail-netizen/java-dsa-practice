//OOP4_2. Create a class BankAccount with a private double balance. Add deposit(double amt) (only accept positive amounts) and withdraw(double amt) (only allow if amt <= balance, otherwise print "Insufficient funds"). Add getBalance(). Test deposit, a valid withdraw, and a withdraw that should fail.
class BankAccount{
    private double balance;
     void deposit (double amt){
         if(amt>0){
             balance = balance + amt;
         }
         }
         void withdraw(double amt){
         if(amt<=balance){
             balance = balance - amt;
         }else{
             System.out.println("Insufficient funds");
         }
         }

    public double getBalance() {
        return balance;
    }
}

public class OOP4_2 {
    public static void main(String[] args) {
        BankAccount BA = new BankAccount();
        BA.deposit(80000);
        System.out.println(BA.getBalance());
        BA.withdraw(100000);
        System.out.println(BA.getBalance());
        BA.withdraw(40000);
        System.out.println(BA.getBalance());

    }
}
