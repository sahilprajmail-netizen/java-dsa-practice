//OOP1_5. Create a class Movie with title, genre, and rating. Write two constructors — one that takes all three, and one that takes only title and sets a default genre = "Unknown" and rating = 0.0. Create one movie using each constructor and print both.
class Movie {
    String title;
    String genre;
    double rating;

    // Constructor with all three values
    Movie(String t, String g, double r) {
        title = t;
        genre = g;
        rating = r;
    }

    // Constructor with only title
    Movie(String t) {
        title = t;
        genre = "Unknown";
        rating = 0.0;
    }
}

public class OOP1_5 {
    public static void main(String[] args) {

        Movie m1 = new Movie("Inception", "Sci-Fi", 8.8);
        Movie m2 = new Movie("Titanic");

        System.out.println(m1.title);
        System.out.println(m1.genre);
        System.out.println(m1.rating);

        System.out.println();

        System.out.println(m2.title);
        System.out.println(m2.genre);
        System.out.println(m2.rating);
    }
}