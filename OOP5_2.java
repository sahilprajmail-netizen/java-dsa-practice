//OOP5_2. Create abstract class employee1 with fields name, baseSalary, a constructor, and abstract method calculateSalary(). Create Manager extends employee1 where calculateSalary() returns baseSalary + 5000 (bonus), and Intern extends employee1 where it returns baseSalary (no bonus). Create one of each, print calculateSalary() for both.
abstract class employee1 {
    String name;
    double baseSalary;

    employee1(String n, double bs) {
        name = n;
        baseSalary = bs;
    }

    abstract double calculateSalary();
}

class Manager2 extends employee1 {

    Manager2(String n, double bs) {
        super(n, bs);
    }

    double calculateSalary() {
        return baseSalary + 5000;
    }
}

class Intern2 extends employee1 {

    Intern2(String n, double bs) {
        super(n, bs);
    }

    double calculateSalary() {
        return baseSalary;
    }
}

public class OOP5_2 {
    public static void main(String[] args) {

        Manager2 m = new Manager2("Sahil", 50000);
        Intern2 i = new Intern2("Rahul", 20000);

        System.out.println(m.calculateSalary());
        System.out.println(i.calculateSalary());
    }
}