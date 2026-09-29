// AR5. Create an int[] of 5 numbers. Count and print how many of them are even.
public class AR5 {
    public static void main(String[] args) {
        int[] numbers = { 2,3,1,4,8};
        int count = 0;
        for(int i = 0;i<=numbers.length - 1;i++){
          if(numbers[i]%2 == 0) {
              count ++ ;
          }

        }
        System.out.println("no. of even numbers: " + count);

        }
    }

