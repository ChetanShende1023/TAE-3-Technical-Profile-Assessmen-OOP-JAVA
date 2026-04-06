/* 
 * QUESTION: 
 * Since Java doesn't support multiple inheritance with classes, 
 * show how a class 'SmartPhone' can implement multiple interfaces 
 * like 'Camera' and 'MusicPlayer'.
 */

interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

class SmartPhone implements Camera, MusicPlayer {
    public void takePhoto() { System.out.println("Capturing photo..."); }
    public void playMusic() { System.out.println("Playing MP3..."); }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        phone.takePhoto();
        phone.playMusic();
    }
}
