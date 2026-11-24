import java.util.HashSet;
//CF_2: HashSet (no duplicates)
//Add "Ravi","Asha","Ravi","Imran","Asha" to a HashSet<String>. Print size(). Print the result of set.add("Zed"), then set.add("Ravi"), then set.contains("Asha"). Don't print the whole set, because HashSet order isn't guaranteed.
public class OOP7_7 {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Ravi");
        names.add("Asha");
        names.add("Ravi");
        names.add("Imran");
        names.add("Asha");
        System.out.println(names.size());
        System.out.println( names.add("Zed"));
        System.out.println(names.add("Ravi"));
        System.out.println(names.contains("Asha"));
    }
}
