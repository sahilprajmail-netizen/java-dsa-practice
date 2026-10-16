//J8_5. Write a method findUser(String name) that returns Optional<String> — Optional.of(name) if the name is "Sahil", otherwise Optional.empty(). In main, call it with a matching and non-matching name, and for each result use .orElse("User not found") to print the outcome.
import java.util.Optional;

public class J8_5 {

    static Optional<String> findUser(String name) {
        if (name.equals("Sahil")) {
            return Optional.of(name);
        } else {
            return Optional.empty();
        }
    }

    public static void main(String[] args) {
        System.out.println(findUser("Sahil").orElse("User not found"));
        System.out.println(findUser("Rahul").orElse("User not found"));
    }
}
