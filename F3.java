// F3. Write three show methods, each printing something different: show(String name), show(String name, int age) and show(int age, String name). Call each one and check that the right one runs.
public class F3 {
    public static void main(String[] args) {
show("sahil");
show( "rahul",17);
show(20, "ron");

    }
    static  void show(String name){
        System.out.println(name);
    }
    static void show(String name , int age){
        System.out.println(name + " " + age);
    }
    static void show(int age , String name){
        System.out.println(age + " " + name);
    }
}
