// AR7. Create an int[] of 5 numbers. Search for a specific number (pick one that's in the array) using a loop, and print "Found at index X" or "Not found" if it isn't there.
import java.util.Scanner;
public class AR7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numbers = {2,4,6,8,1};
        System.out.println("enter the number: ");
        int n = s.nextInt();
        boolean found = false;
        for(int i = 0; i < numbers.length; i++){
            if( n == numbers[i] ) {
                System.out.println("Found at index: " + i);
                found = true;
            }
            }
             if(found == false){
                 System.out.println("not found");
             }


    }
}
