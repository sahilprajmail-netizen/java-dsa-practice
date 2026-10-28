//OOP3_13 (toString). Book1 has String title and int price, and a constructor. First println a Book1 without toString, and write down in a comment what it printed. Then override toString() to return "Book1: " + title + ", Rs " + price and print it again. Use Book1("Java Basics", 300).
class Book1{
    String title;
    int price;
    Book1(String t , int p){
        this.title = t;
        this.price = p;
    }
    @Override
    public String toString() {
        return "Book1: " + title + ", Rs " + price;
    }
}
public class OOP3_13 {
    public static void main(String[] args) {
        Book1 b = new Book1("Java Basics" , 300);
       // System.out.println(b); // Without toString(): prints Book1@5f184fc6
        System.out.println(b);
    }
}
