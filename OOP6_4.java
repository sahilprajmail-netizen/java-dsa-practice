//OOP6_4. Add a remove(int index) method to your MyArrayList<T> from OOP6_3 — it should shift every element after index one position left, then decrease size. Test it: add 4 items, remove index 1, print all remaining items to confirm the shift worked.
class MyArrayList2<T> {
    T[] items;
    int count = 0;

    MyArrayList2() {
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

    public void remove(int index) {
        for (int i = index; i < count - 1; i++) {
            items[i] = items[i + 1];
        }
        count--;
    }
}

public class OOP6_4 {
    public static void main(String[] args) {
        MyArrayList2<String> names = new MyArrayList2<>();

        names.add("Sahil");
        names.add("Rahul");
        names.add("Rohan");
        names.add("Shlok");

        names.remove(1);

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}