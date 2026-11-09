//INT_2: interface Remote with volumeUp() and volumeDown(). TV implements Remote with an int volume = 10 and a getVolume(). Call up, up, down, then print the volume.
interface Remote{
    void volumeUp();
    void volumeDown();
}
class TV implements Remote{
    int volume = 10;

    @Override
    public void volumeUp() {
volume++;
    }

    @Override
    public void volumeDown() {
volume--;
    }

    public int getVolume(){
        return volume;
    }
}
public class OOP5_16 {
    public static void main(String[] args) {
        TV r = new TV();
        r.volumeUp();
        r.volumeUp();
        r.volumeDown();
        System.out.println(r.getVolume());
    }
}
