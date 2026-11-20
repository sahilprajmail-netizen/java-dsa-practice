//GC_11: Removing from the end
//IntStack has int[] items = new int[5] and int size. push(int x) stores at size and increases it. pop() decreases size and returns items[size]. Push 1, 2, 3. Print pop(), pop(), then size.
class IntStack{
    int[] items = new int[5];
    int size;
    void push(int x){
        items[size] = x;
size++;
    }
    int pop(){
        size--;
        return items[size];
    }
}
public class OOP6_16 {
    public static void main(String[] args) {
IntStack ins = new IntStack();
ins.push(1);
ins.push(2);
ins.push(3);
        System.out.println(ins.pop());
        System.out.println(ins.pop());
        System.out.println(ins.size);
    }
}
