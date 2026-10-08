//OOP5_3. Create interface Playable with method play(). Create classes Guitar implements Playable and Piano implements Playable, each printing a different message in play(). In main, create a Playable[] array holding a Guitar and a Piano, loop through and call play() on each.
interface Playable{
    void play();

}
class Guitar implements Playable{
    @Override
    public void play() {
        System.out.println("Guitar is playing");
    }
}
class Piano implements Playable{
    @Override
    public void play(){
        System.out.println("Piano is playing");
    }
}
public class OOP5_3 {
    public static void main(String[] args) {
        Playable[] instruments = {new Guitar(), new Piano()};
        for(int i=0; i < instruments.length; i++){
            instruments[i].play();
        }


    }
}