interface MediaPlayer {
    void play(String fileName);
}

interface AdvancedMediaPlayer {
    void playVlc(String fileName);
    void playMp4(String fileName);
}

class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // do nothing
    }
}

class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        // do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}

class MediaAdapter implements MediaPlayer {
    @Override
    public void play(String fileName) {
        if (fileName.endsWith("mp4")) {
            new Mp4Player().playMp4(fileName);
        } else if (fileName.endsWith("vlc")) {
            new VlcPlayer().playMp4(fileName);
        }
    }
}

class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String fileName) {
        if (fileName.endsWith("mp3")) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        } else {
            new MediaAdapter().play(fileName);
        }
    }
}

public class AdapterPattern2 {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("hello.mp3");
        audioPlayer.play("hello.mp4");
    }
}
