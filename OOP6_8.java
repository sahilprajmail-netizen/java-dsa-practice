//GC_3: Start MyArrayList (fixed size)
//MyArrayList1<T> with Object[] data = new Object[2] and int size. Methods: add(T) with no resizing, size(), and get(int) returning (T) data[i] (use @SuppressWarnings("unchecked")). Add 10 and 20, print size and both values, then add 30.;

class MyArrayList1<T> {
    Object[] data = new Object[2];
    int size = 0;

    // Add an element
    void add(T item) {
        data[size] = item;
        size++;
    }

    // Return the number of elements
    int size() {
        return size;
    }

    // Get an element by index
    @SuppressWarnings("unchecked")
    T get(int i) {
        return (T) data[i];
    }
}

public class OOP6_8 {
    public static void main(String[] args) {

        MyArrayList1<Integer> ar = new MyArrayList1<>();

        ar.add(10);
        ar.add(20);

        System.out.println("Size: " + ar.size());
        System.out.println(ar.get(0));
        System.out.println(ar.get(1));

        ar.add(30); // This causes an ArrayIndexOutOfBoundsException
    }
}
