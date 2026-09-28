// F7. Make a Student class with an instance variable name and a static variable count. The constructor sets the name and adds 1 to count. Create 3 students, print each name, then print Student.count.
class Student {
    String name;
    static int count;

    Student(String name){
        this.name=name;
        count++;
    }
        }
public class F7 {
    public static void main(String[] args) {
        Student s1 =  new Student("sahil");
        Student s2 =  new Student("rahul");
        Student s3 =  new Student("rohan");

        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s3.name);
        System.out.println(Student.count);


    }
}
