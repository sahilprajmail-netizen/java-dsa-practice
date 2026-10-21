//OOP1_6. Pen with color (String) and price (int), plus a constructor. Create Pen("Blue", 10) and print both values.
class Pen {
    String color;
    int price;
    Pen(String c, int p){
         color = c;
        price = p;
    }
}
public class OOP1_6 {
    public static void main(String[] args) {
Pen p1 = new Pen("Blue " , 10);
        System.out.println(p1.color);
        System.out.println(p1.price);
    }
}
