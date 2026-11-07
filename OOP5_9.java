//ABS_4: abstract class Book2 with a title field, a constructor, and abstract double price();. Novel returns 250, Textbook returns 600. Print title + " " + price() for new Novel("Wings of Fire") and new Textbook("Physics").
abstract class Book2{
    String title;
    Book2(String t){
        this.title = t;
    }
    abstract double price();
}
class Novel extends Book2{
    Novel(String t){
        super(t);
    }
     double price(){
         return 250;
     }
}
class Textbook extends Book2{
    Textbook(String t){
        super(t);
    }
    double price(){
        return 600;
    }
}
public class OOP5_9 {
    public static void main(String[] args) {
        Novel n = new Novel("Wings of Fire");
        Textbook t = new Textbook("Physics");
        System.out.println(n.title + " " + n.price());
        System.out.println(t.title + " " + t.price());
    }
}
