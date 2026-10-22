//OOP2_5. Make Student_3 with name and static int count. The constructor sets the name and does count++. Create 3 students (Amit, Riya, Karan), print each name, then print Student_3.count.
class Student_3{
    static int count = 0;
    String name;
    Student_3(String name){
        this.name=name;
        count++;
    }
}
public class OOP2_5 {
    public static void main(String[] args) {
Student_3 s1 = new Student_3("Amit");
        Student_3 s2 = new Student_3("Riya");
        Student_3 s3 = new Student_3("Karan");
        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s3.name);
        System.out.println(Student_3.count);
    }
}
