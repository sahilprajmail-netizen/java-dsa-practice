//OOP6_3. Build MyArrayList<T> (as shown above) with add(T item) and get(int index) and size(). In main, create a MyArrayList<String>, add 3 strings, loop through with a for loop (using size() and get(i)) and print each
class MyArrayList<T> {
    T[] items;
    int count = 0;

    MyArrayList() {
        items = (T[]) new Object[10];
    }

    public void add(T item) {
        items[count] = item;
        count++;
    }

    public T get(int index) {
        return items[index];
    }

    public int size() {
        return count;
    }
}

public class OOP6_3 {
    public static void main(String[] args) {

        MyArrayList<String> names = new MyArrayList<>();

        names.add("Sahil");
        names.add("Rahul");
        names.add("Rohan");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}