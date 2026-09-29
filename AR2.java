// AR2. Create an int[] of 6 numbers. Find and print the largest number, without using any built-in max function.
public class AR2 {
    public static void main(String[] args) {
        int[] numbers = {3,5,2,8,7,9};
        int largest = numbers[0];
        for(int i = 1; i<numbers.length; i++){
            if(numbers[i]> largest){
             largest = numbers[i];
            }
        }
        System.out.println(largest);

    }
}
