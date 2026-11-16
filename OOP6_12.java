//GC_7: Generic method on arrays
//static <T> void printArray(T[] arr) loops and prints elements with spaces. Call with new Integer[]{1,2,3} and new String[]{"a","b"}. Then try new int[]{1,2,3}.

public class OOP6_12 {
    static <T> void printArray(T[] arr){
        for(int i = 0; i <arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
 Integer[] i = new Integer[]{1,2,3};
 String[] s = new String[]{"a","b"};
 printArray(i);
 printArray(s);
      //  printArray(new int[]{1,2,3});            int is a primitive type, and generic type parameters must use reference types.
    }
}
