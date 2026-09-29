// AR3. Create an int[] of 6 numbers. Find and print the smallest number.
public class AR3 {
    public static void main(String[] args) {
        int[] numbers = {5,6,2,7,1,9};
        int smallest = numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(numbers[i]<smallest){
                smallest = numbers[i];
            }
        }
        System.out.println(smallest);
    }
}
