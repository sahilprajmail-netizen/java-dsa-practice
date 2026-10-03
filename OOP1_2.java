// OOP1_2. Create a class Rectangle with length and width. Write a constructor that sets both, and a method area() that returns length * width. Create two rectangles with different sizes and print both areas.
class Rectangle {
    double length;
    double width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    double area() {
        return length * width;
    }
}

public class OOP1_2 {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(20.3, 10.5);
        Rectangle r2 = new Rectangle(25.5, 12.7);

        System.out.println(r1.area());
        System.out.println(r2.area());
    }
}