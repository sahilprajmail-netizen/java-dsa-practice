//OOP4_9: Rectangle
//Class Rectangle_1 with private length and width. Constructor sets both. Public getArea() returns length × width. In main: new Rectangle_1(4, 5), print the area.
class Rectangle_1{
    private int length;
    private int width;
    Rectangle_1(int length ,int width){
        this.length = length;
        this.width = width;
    }
    public int getArea(){
        return length * width;
    }
}
public class OOP4_9 {
    public static void main(String[] args) {
        Rectangle_1 r = new Rectangle_1(4,5);
        System.out.println(r.getArea());
    }
}
