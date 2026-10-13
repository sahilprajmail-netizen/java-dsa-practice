//EXC3. Write a method checkAge(int age) that throws an IllegalArgumentException if age < 0 or age > 150. In main, call it inside a try/catch with a valid age and an invalid age, observe both outcomes.

public class EXC3 {

    static void checkAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Invalid age");
        }

        System.out.println("Age is valid");
    }

    public static void main(String[] args) {

        try {
            checkAge(25);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            checkAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}