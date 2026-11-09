//INT_5: interface Converter with double convert(double v);. CelsiusToF returns v * 9 / 5 + 32. Print convert(100) and convert(0).
interface Converter{
    double convert(double v);
}
class CelsiusToF implements Converter{
    @Override
    public double convert(double v) {
        return v * 9 / 5 + 32;
    }
}
public class OOP5_19 {
    public static void main(String[] args) {
        CelsiusToF c = new CelsiusToF();
        System.out.println(c.convert(100));
        System.out.println(c.convert(0));
    }
}
