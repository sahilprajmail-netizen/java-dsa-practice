//OOP4_10: Password check
//Class Account with a private password set through the constructor. No getter. Add boolean check(String p) returning true if it matches. Test with the right and wrong passwords.
class Account{
    private String password;
    Account(String p){
        this.password = p;
    }
    boolean check(String p){
        return password.equals(p);
        }
    }

public class OOP4_10 {
    public static void main(String[] args) {

        Account a = new Account("Sahil06");
        System.out.println(a.check("Sahil06"));
        System.out.println(a.check("sahill06"));
    }
}