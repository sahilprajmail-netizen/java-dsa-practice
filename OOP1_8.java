//OOP1_8. Student1 with name and marks. Create two students: ("Amit", 70) and ("Riya", 80). Print both marks. Then set s1.marks = 90 and print both again. This shows that each object has its own copy.
class Student1{
    String name;
    int marks;
    Student1(String name , int marks){
        this.name = name;
        this.marks=marks;
    }
}
public class OOP1_8 {
    public static void main(String[] args) {
        Student1 s1 = new Student1("Amit ", 70);
        Student1 s2 = new Student1("Riya " , 80);
        System.out.println(s1.marks);
        System.out.println(s2.marks);
        s1.marks = 90;
        System.out.println(s1.marks);
        System.out.println(s2.marks);
    }
}
