// OOP1_3. Create a class Student with name, age, and marks. Write a constructor for all three. Add a method isPassing() that returns true if marks >= 40. Create two students — one passing, one not — and print their names with "Passing" or "Failing".
class Student2 {
    String name;
    int age;
    double marks;

    Student2(String n, int a, double m) {
        name = n;
        age = a;
        marks = m;
    }

    boolean isPassing() {
        return marks >= 40;
    }
}

public class OOP1_3 {
    public static void main(String[] args) {

        Student2 s1 = new Student2("Sahil", 20, 75.5);
        Student2 s2 = new Student2("Shlok", 21, 32.5);

        if (s1.isPassing()) {
            System.out.println(s1.name + " - Passing");
        } else {
            System.out.println(s1.name + " - Failing");
        }

        if (s2.isPassing()) {
            System.out.println(s2.name + " - Passing");
        } else {
            System.out.println(s2.name + " - Failing");
        }
    }
}