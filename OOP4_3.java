
//OOP4_3. Create a class employee with private String name and private double salary. Add a constructor that sets both, and getters for each, but no setters — once created, these values can't change. In main, create an employee, print name and salary, and add a comment explaining why there's no setter (this is called an immutable field).
class employee{
    private String name;
    private double salary;
    employee (String n, double s){
        name = n;
        salary = s;
    }
    public String getName(){
        return name;
}
public double getSalary(){
        return salary;
}
}
public class OOP4_3 {
    public static void main(String[] args) {
        employee e = new employee("Sahil",500000);
        System.out.println(e.getName());
        System.out.println(e.getSalary());
// No setters because name and salary should not change after the employee is created.
    }
}
