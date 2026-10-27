//OOP3_9 (overriding with super). Shape1 has draw() printing Drawing a shape. Circle overrides draw() so it first calls super.draw(), then prints Drawing a circle. Create a Circle and call draw().
class Shape1{
void draw(){
    System.out.println("Drawing a shape");
}
}
class Circle extends Shape1{
    @Override
    void draw() {
        super.draw();
        System.out.println("Drawing a circle");
    }
}
public class OOP3_9 {
    public static void main(String[] args) {
Circle c = new Circle();
c.draw();
    }
}
