// OOP1_1. Create a class Book with instance variables title (String) and price (double). Write a constructor that sets both. In main, create two Book objects and print each one's title and price.
class Book {
    String title;
    double price;
    Book(String n , double p){
        title = n;
        price = p;
    }
}
public class OOP1_1 {
    public static void main(String[] args) {
        Book b1= new Book("Java Basics" ,257.5);
        Book b2= new Book("Clean Code" ,110.4);
        System.out.println(b1.title);
        System.out.println(b1.price);
        System.out.println(b2.title);
        System.out.println(b2.price);

    }
}
