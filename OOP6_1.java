//OOP6_1. Create a generic class Pair<A, B> with two fields first and second (of types A and B), a constructor setting both, and getters getFirst()/getSecond(). In main, create a Pair<String, Integer> holding ("Sahil", 20), print both values.
class Pair<A, B> {
    A first;
    B second;

    Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    A getFirst() {
        return first;
    }

    B getSecond() {
        return second;
    }
}

public class OOP6_1 {
    public static void main(String[] args) {

        Pair<String, Integer> p = new Pair<>("Sahil", 20);

        System.out.println(p.getFirst());
        System.out.println(p.getSecond());
    }
}