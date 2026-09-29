// A1: Create an int[] of 5 numbers of your choice (using the {} shortcut). Print all 5 using a for loop. Then print the sum of all 5 numbers.
public class AR1 {
    public static void main(String[] args) {
        int[] marks = {70,78,80,85,90};
        for(int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        int sum =0;
        for(int i =0; i< marks.length;i++){
            sum = sum + marks[i];
        }
        System.out.println(sum);
    }
}
