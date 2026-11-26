import java.util.LinkedList;
import java.util.Queue;
import java.util.Deque;
import java.util.ArrayDeque;
//CF_5: Queue vs Stack
//Queue: Queue<String> q = new LinkedList<>(); offer A, B, C. Print poll(), peek(), size().
//Stack: Deque<Integer> st = new ArrayDeque<>(); push 1, 2, 3. Print pop(), then peek().

public class OOP7_10 {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.offer("A");
        q.offer("B");
        q.offer("C");
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.size());
        Deque<Integer> st = new ArrayDeque<>();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st.pop());
        System.out.println(st.peek());
    }
}
