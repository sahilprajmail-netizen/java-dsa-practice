// OOP1_6. Create a class Circle with radius. Write a constructor that sets it. Add a method calculateArea() using Math.PI * radius * radius. Create 3 circles with different radii, store them in an ArrayList<Circle>, loop through, and print each one's area.
import java.util.ArrayList;

class Circle {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class OOP1_6 {
    public static void main(String[] args) {

        Circle c1 = new Circle(5);
        Circle c2 = new Circle(10);
        Circle c3 = new Circle(15);

        ArrayList<Circle> circles = new ArrayList<>();

        circles.add(c1);
        circles.add(c2);
        circles.add(c3);

        for (int i = 0; i < circles.size(); i++) {
            System.out.println(circles.get(i).calculateArea());
        }
    }
}