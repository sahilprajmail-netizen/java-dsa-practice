//OOP4_1. Create a class student with a private int marks. Add a public method setMarks(int m) that only sets it if m >= 0 && m <= 100 (otherwise print "Invalid marks"). Add a public getMarks(). In main, try setting a valid mark, then an invalid one, print the result each time.
class student {
    private int marks;

    public void setMarks(int m) {
        if (m >= 0 && m <= 100) {
            marks = m;
        } else {
            System.out.println("Invalid marks");
        }
    }

    public int getMarks() {
        return marks;
    }
}

public class OOP4_1 {
    public static void main(String[] args) {

        student s = new student();

        // Valid mark
        s.setMarks(80);
        System.out.println(s.getMarks());

        // Invalid mark
        s.setMarks(120);
        System.out.println(s.getMarks());
    }
}
