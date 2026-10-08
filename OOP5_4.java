//OOP5_4. Create interface Discountable with method applyDiscount(double price) returning a double. Create class Product implements Discountable where applyDiscount returns price - (price * 0.1) (10% off). Create a Product, call applyDiscount(1000), print the result.
interface Discountable{
    double applyDiscount(double price);

}
class Product implements Discountable{
    @Override
    public double applyDiscount(double price) {
        return price - (price * 0.1);
    }
}
public class OOP5_4 {
    public static void main(String[] args) {
        Product p = new Product();

        System.out.println(p.applyDiscount(1000));
    }
}
