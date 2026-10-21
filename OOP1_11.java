//OOP1_11. Make an array of 3 Student3 objects: Student3[] list = new Student[3]; Fill it with new Student(...) for each slot, then loop and print each name. Each slot starts empty (null), so you must create the object before using it.
class Student3{
String name;
Student3(String name){
    this.name = name;
}
}
public class OOP1_11 {
    public static void main(String[] args) {
Student3[] list = new Student3[3];
list[0] = new Student3("Karan");
list[1] = new Student3("Vyom");
list[2] = new Student3("Shlok");
for(int i = 0; i < list.length; i++){
    System.out.println(list[i].name);
}
    }
}
