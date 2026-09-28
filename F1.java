// F1. Write three area methods: area(int side) for a square, area(int length, int width) for a rectangle, and area(double radius) for a circle. Call all three from main and print the results.
public class F1 {
    public static void main(String[] args) {
 int result = area(4);
        System.out.println(result);
        int rectangle = area(5,6);
        System.out.println(rectangle);
        double circle = area(5.0);
        System.out.println(circle);
    }
    static int area(int side) {
        return side * side;
    }
        static int area(int length, int width){
        return length * width;
        }
        static double area(double radius){
        return Math.PI * radius * radius;
        }


    }


