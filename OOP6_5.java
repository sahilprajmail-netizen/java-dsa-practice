//OOP6_5. Add resizing to MyArrayList<T>: when add() is called and size == data.length (array is full), create a new array double the size, copy all existing elements into it, then continue the add. Test by adding 12 items (more than the initial capacity of 10) and printing all of them to confirm nothing was lost.

class MyArrayList3<T> {
    T[] data;
    int count = 0;

    MyArrayList3() {
        data = (T[]) new Object[10];
    }

    public void add(T item) {
        if (count == data.length) {
            T[] newData = (T[]) new Object[data.length * 2];

            for (int i = 0; i < count; i++) {
                newData[i] = data[i];
            }

            data = newData;
        }

        data[count] = item;
        count++;
    }

    public T get(int index) {
        return data[index];
    }

    public int size() {
        return count;
    }
}

public class OOP6_5 {
    public static void main(String[] args) {
        MyArrayList3<Integer> numbers = new MyArrayList3<>();

        for (int i = 1; i <= 12; i++) {
            numbers.add(i);
        }

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}


