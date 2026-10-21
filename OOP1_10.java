//OOP1_10. Add withdraw(int amount) to your BankAccount. If amount > balance, print Not enough balance and change nothing. Otherwise subtract it. Start with 100. Withdraw 30, show, withdraw 500, show.
class BankAccount3{
    int balance;
    BankAccount3(int balance){
        this.balance = balance;
    }
    void deposit(int amount){
        balance = balance + amount;
    }
    void withdraw(int amount){
        if(amount > balance){
            System.out.println("Not enough balance");
        }else{
            balance = balance - amount;
        }
    }
    void showBalance(){
        System.out.println("Balance: " + balance);
    }
}
public class OOP1_10 {
    public static void main(String[] args) {
        BankAccount3 B3 = new BankAccount3(100);
        B3.withdraw(30);
        B3.showBalance();
        B3.withdraw(500);
        B3.showBalance();

    }
}
