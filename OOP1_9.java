//OOP1_9. BankAccount2 with balance (int), a constructor, a method deposit(int amount) that adds to the balance, and a method showBalance() that prints Balance: followed by the value. Start with 100, deposit 50, show.
class BankAccount2{
    int balance;
    BankAccount2(int balance){
        this.balance = balance;
    }
    void deposit(int amount){
      balance = balance + amount;
    }
    void showBalance(){
        System.out.println("Balance: " + balance);
    }
}
public class OOP1_9 {
    public static void main(String[] args) {
        BankAccount2 B2 = new BankAccount2(100);
         B2.deposit(50);
         B2.showBalance();

    }
}
