import java.util.ArrayList;
//CF_1: ArrayList and the remove trap
//ArrayList<Integer> holding 10, 20, 30, 40. Print the list, size() and get(2). Then remove(1) and print the list. Then remove(Integer.valueOf(40)) and print the list.
public class OOP7_6 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        System.out.println(num);
        System.out.println(num.size());
        System.out.println(num.get(2));
        num.remove(1);
        System.out.println(num);
        num.remove(Integer.valueOf(40));
        System.out.println(num);
    }
}
