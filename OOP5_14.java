//ABS_9: abstract class Staff with a name, a constructor, abstract double salary();, and a normal payslip() printing name + " earns " + salary(). Three subclasses: Teacher (40000), Clerk (25000), Driver (18000). Make a Staff[] with Asha (Teacher), Ravi (Clerk), Imran (Driver). Loop payslip(), then print the name of the highest earner using a loop (don’t hardcode  it).
abstract class Staff{
    String name;
    Staff(String n){
        this.name = n;
    }
    abstract double salary();
   void payslip(){
       System.out.println(name + " earns " + salary());
    }
}
class Teacher extends Staff{
    Teacher(String n){
        super(n);
    }
    double salary() {
        return 40000;
    }
}
class Clerk extends Staff{
       Clerk(String n){
        super(n);
    }
    @Override
    double salary() {
        return 25000;
    }
}
class Driver extends Staff{
    Driver(String n){
        super(n);
    }
    @Override
    double salary() {
        return 18000;
    }
}
public class OOP5_14 {
    public static void main(String[] args) {
        Staff[] s = {new Teacher("Asha"), new Clerk("Ravi"), new Driver("Imran")};
        for (int i = 0; i < s.length; i++) {
            s[i].payslip();
        }
        Staff highest = s[0];
        for (int i = 1; i < s.length; i++) {
            if (s[i].salary() > highest.salary()) {
                highest = s[i];
            }
        }
            System.out.println("Highest earner: " + highest.name);
        }
    }

