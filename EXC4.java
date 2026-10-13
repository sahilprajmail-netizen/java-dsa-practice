//EXC4. Create a custom checked exception InvalidMarksException extends Exception. Write a method setMarks(int m) throws InvalidMarksException that throws it if m < 0 || m > 100. In main, call it in a try/catch, test with a valid and an invalid mark.

class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}

public class EXC4 {

    static void setMarks(int m) throws InvalidMarksException {
        if (m < 0 || m > 100) {
            throw new InvalidMarksException("Marks must be between 0 and 100");
        }

        System.out.println("Marks are valid: " + m);
    }

    public static void main(String[] args) {

        try {
            setMarks(85);
        } catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        }

        try {
            setMarks(120);
        } catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        }
    }
}

