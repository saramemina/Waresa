package Waresa01;

import javax.sound.sampled.*;
import java.io.IOException;
import java.net.URL;


public class Sonidos {

    private URL url;
    private Clip clip;

    private AudioInputStream audioIn;


    Sonidos(String relativePath){
        try {
            url = this.getClass().getClassLoader().getResource(relativePath);
            audioIn = AudioSystem.getAudioInputStream(url);
            clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }


    public void stop(){
        if (clip!= null & clip.isRunning()){

            clip.stop();
            clip.close();
        }
    }

    public  void start(){
        clip.start();
    }

}

