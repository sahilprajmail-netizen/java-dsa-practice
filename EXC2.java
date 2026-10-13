//EXC2. Create an array of size 5. Deliberately access index 7 inside a try block, catch ArrayIndexOutOfBoundsException, print the exception’s message using e.getMessage().
public class EXC2 {
    public static void main(String[] args) {
        int[] array = new int[5];
        try{
            System.out.println(array[7]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

    }
}
