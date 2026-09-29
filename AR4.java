// AR4. Create an int[] of 5 numbers. Print them in reverse order using a loop (don't create a new array — just loop backwards through the same one).
public class AR4 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        for(int i = 4; i>=0; i--){      // for(int i =  numbers.length - 1 ;i>=0;i--) use numbers.length - 1 so it works for any array size, not just this specific one
            System.out.println(numbers[i]);

        }
    }
}
