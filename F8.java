// F8. Make a Rectangle class with instance variables length and width and an instance method area() that returns length × width. Create two rectangles with different sizes and print both areas.
class rectangle {
    int length;
    int width;

    int area(){
        return length * width;
    }
        }
public class F8 {
    public static void main(String[] args) {
        rectangle r1 = new rectangle();
        r1.length = 4;
        r1.width = 5;

        rectangle r2 = new rectangle();
        r2.length = 10;
        r2.width = 3;

        System.out.println(r1.area());
        System.out.println(r2.area());


    }
}
