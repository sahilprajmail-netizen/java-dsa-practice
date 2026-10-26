//OOP3_8 (super constructor). Person has name, and a constructor that sets it and prints Person created. Student_1 extends Person adds int marks, and its constructor takes (String n, int m), calls super(n), sets marks, and prints Student created. Create Student_1("Amit", 80), then print the name and the marks.
class Person{
    String name;
    Person(String name){
        this.name = name;
        System.out.println("Person created");
    }
}
class Student_1 extends Person{
    int marks;
    Student_1(String n, int m){
        super(n);
        this.marks = m;
        System.out.println("Student created");
    }
}

public class OOP3_8 {
    public static void main(String[] args) {
Student_1 s1 =new Student_1("Amit" ,  80);
        System.out.println(s1.marks);
        System.out.println(s1.name);
    }
}
