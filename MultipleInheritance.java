interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

class SmartPhone implements Camera, MusicPlayer {

    @Override
    public void takePhoto() {
        System.out.println("Taking photo");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music");
    }
}

public class MultipleInheritance{
    public static void main(String[] args) {

        SmartPhone s = new SmartPhone();

        s.takePhoto();
        s.playMusic();
    }
}