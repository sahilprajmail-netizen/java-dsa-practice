//OOP3_5. Create Employee with field salary and method bonus() returning salary * 0.1. Create Manager extends Employee overriding bonus() to return salary * 0.2. Create one Employee and one Manager with the same salary, print both bonuses to see the difference.
class Employee {
    int salary;
    double bonus(){
        return salary * 0.1;
    }
}
class Manager extends Employee{
    double bonus(){
        return salary * 0.2;
    }
}
public class OOP3_5 {
    public static void main(String[] args) {
        Employee e = new Employee();
        Manager m = new Manager();
        e.salary = 500000;
        m.salary = 500000;
        System.out.println(e.bonus());
        System.out.println(m.bonus());

    }
}
