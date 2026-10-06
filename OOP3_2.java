// OOP3_2. Create Shape with method area() returning 0.0. Create circle extends Shape with a radius field, constructor, and overridden area() returning Math.PI * radius * radius. Create a Circle, print its area.
class Shape{
  double area(){
      return 0;
  }
}
class circle extends Shape{
    double radius;

    public circle(double radius) {
        this.radius = radius;
    }
    @Override
                double area(){
            return Math.PI * radius * radius;
        }

    }
public class OOP3_2 {
    public static void main(String[] args) {
circle c = new circle(5);
        System.out.println(c.area());

    }
}
