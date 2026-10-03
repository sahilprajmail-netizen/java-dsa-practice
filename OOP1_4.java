/*
OOP1_4. Create a class BankAccount with accountHolder and balance. Write a constructor that takes the holder's name and sets a starting balance of 0. Add two methods: deposit(double amount) that adds to balance, and withdraw(double amount) that subtracts from it (only if there's enough balance, otherwise print "Insufficient funds"). Create one account, deposit some money, withdraw some, and print the final balance.
*/class BankAccount1 {
    String accountHolder;
    double balance;

    BankAccount1(String name) {
        accountHolder = name;
        balance = 0;
    }

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
}

public class OOP1_4 {
    public static void main(String[] args) {

        BankAccount1 account = new BankAccount1("Sahil");

        account.deposit(1000);
        account.withdraw(300);

        System.out.println(account.accountHolder);
        System.out.println(account.balance);
    }
}

