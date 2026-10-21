//OOP1_7. Rectangle1 with width and height (int), a constructor, and a method int area() that returns width * height. Create Rectangle(4, 5) and print its area.
class Rectangle1{
    int width;
    int height;
    Rectangle1(int w , int h) {
        width = w;
        height = h;
    }
     int area() {
            return width * height;
        }
    }
public class OOP1_7 {
    public static void main(String[] args) {
        Rectangle1 r = new Rectangle1(4,5);
        System.out.println(r.area());

    }
}
