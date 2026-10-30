//OOP4_6: Basic encapsulation
//Class Person1 with private name and age. Add a getter and a setter for each (no checks). In main: set name “Rahul” and age 20, then print both.
class Person1{
    private String name;
    private  int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class OOP4_6 {
    public static void main(String[] args) {
        Person1 p = new Person1();
        p.setName("Rahul");
        p.setAge(20);
        System.out.println(p.getName() + " " + p.getAge());
    }
}
