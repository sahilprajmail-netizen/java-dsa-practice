//AR6. Create a String[] of 4 names. Loop through and print each name with its index, like 0: Sahil, 1: Rahul, etc.
public class AR6 {
    public static void main(String[] args) {
        String[] names = {"sahil","rohan","shlok","vidit"};
        for(int i = 0;i<names.length;i++){
            System.out.println(i + ": " + names[i]);
        }

    }
}
