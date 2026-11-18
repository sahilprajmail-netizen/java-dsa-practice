//GC_10: Size vs capacity
//Playlist holds String[] songs = new String[3] and int size. add(String s): if size == 3, print Playlist full, otherwise store it and increase size. Add A, B, C, D. Then print size and the songs.
class Playlist{
    String[] songs = new String[3];
    int size;
    void add(String s){
        if(size == 3){
            System.out.println("Playlist full");
        }
        else{
songs[size] = s;
size++;
        }
    }
}
public class OOP6_15 {
    public static void main(String[] args) {
Playlist p = new Playlist();
p.add("A");
p.add("B");
p.add("C");
p.add("D");
        System.out.println(p.size);
        for(int i = 0; i < p.size; i++){
            System.out.print(p.songs[i]+ " ");
        }
    }
}
