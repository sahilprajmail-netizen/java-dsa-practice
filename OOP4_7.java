//OOP4_7: Private method
//Class Greeter with a private method line() that prints Welcome. Add a public method greet() that calls line(). In main, call greet(), then try line().
class Greeter{
    private void line(){
        System.out.println("Welcome");
    }
    public void greet(){
         line();
    }
}
public class OOP4_7 {
    public static void main(String[] args) {
        Greeter g = new Greeter();
        g.greet();
      //  g.line();           line() has private access in Greeter
    }
}
