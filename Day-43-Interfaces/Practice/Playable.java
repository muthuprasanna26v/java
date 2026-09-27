interface Playable {
    void play();
    void pause();
    void stop();
}

class MusicPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Playing music");
    }
    
    @Override
    public void pause() {
        System.out.println("Pausing music");
    }
    
    @Override
    public void stop() {
        System.out.println("Stopping music");
    }
}

public class PlayableDemo {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        player.play();
        player.pause();
        player.stop();
    }
}
