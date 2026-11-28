//CF_7: Removing while looping
//ArrayList<Integer> of 1 to 8. First, use a for-each loop that calls list.remove(Integer.valueOf(n)) for every even n. Run it and read the error. Then fix it by looping with an Iterator<Integer> and calling it.remove() for even numbers. Print the list.
import java.util.ArrayList;
import java.util.Iterator;
public class OOP7_12 {
    public static void main(String[] args) {
ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);
        num.add(7);
        num.add(8);
// for(Integer n : num){
   //  if(n%2==0){
      //  num.remove(Integer.valueOf(n));           ConcurrentModificationException
    // }
   // System.out.println(num);
// }
        Iterator<Integer> it = num.iterator();

        while (it.hasNext()) {
            Integer n = it.next();

            if (n % 2 == 0) {
                it.remove();
            }
        }

        System.out.println(num);

    }
}
