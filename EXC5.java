//EXC5. Create a custom exception BankException extends RuntimeException (unchecked this time — no throws needed). Write a method withdraw(double amt, double balance) that throws BankException("Insufficient funds") if amt > balance. Test it with a try/catch for both a successful and failing withdrawal.

class BankException extends RuntimeException {
    public BankException(String message) {
        super(message);
    }
}

public class EXC5 {

    static void withdraw(double amt, double balance) {
        if (amt > balance) {
            throw new BankException("Insufficient funds");
        }

        System.out.println("Withdrawal successful: " + amt);
    }

    public static void main(String[] args) {

        // Successful withdrawal
        try {
            withdraw(2000, 5000);
        } catch (BankException e) {
            System.out.println(e.getMessage());
        }

        // Failed withdrawal
        try {
            withdraw(6000, 5000);
        } catch (BankException e) {
            System.out.println(e.getMessage());
        }
    }
}
