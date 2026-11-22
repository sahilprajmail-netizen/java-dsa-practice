//GC_12: Removing from the middle (shifting)
//In main only: int[] a = {10, 20, 30, 40}; int size = 4;. Remove index 1 by shifting left with for (int i = 1; i < size - 1; i++) a[i] = a[i+1]; and then size--. Print the first size elements.

public class OOP6_17 {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40};
        int size = 4;
        for(int i = 1; i < size - 1; i++){
            a[i] = a[i+1];
        }
        size--;
        for (int i = 0; i < size; i++) {
            System.out.println(a[i]);
        }
    }
}
