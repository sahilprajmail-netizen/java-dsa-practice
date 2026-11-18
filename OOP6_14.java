//GC_9: Copy into a bigger array
//In main, make int[] small = {1, 2, 3}; and int[] big = new int[6];. Copy with a loop, then print all 6 elements of big.

public class OOP6_14 {
    public static void main(String[] args) {
        int[] small = {1, 2, 3};
        int[] big = new int[6];
        for(int i = 0; i < small.length; i++){
            big[i] = small[i];
        }
        for(int i = 0; i < big.length; i++){
            System.out.println(big[i]);
        }
    }
}
