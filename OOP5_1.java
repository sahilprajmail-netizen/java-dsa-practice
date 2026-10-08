//OOP5_1. Create abstract class shape with abstract method area() and a normal method display() that prints "Area: " + area(). Create Rectangle extends Shape with length, width, constructor, and area() implementation. Create a Rectangle, call display().

abstract class shape {

    abstract double area();

    void display() {
        System.out.println("Area: " + area());
    }
}

class Rectangle2 extends shape {

    double length;
    double width;

    Rectangle2(double l, double w) {
        length = l;
        width = w;
    }

    double area() {
        return length * width;
    }
}

public class OOP5_1 {
    public static void main(String[] args) {

        Rectangle2 r = new Rectangle2(10, 5);
        r.display();
    }
}