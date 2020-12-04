package Waresa01;

import javax.sound.sampled.*;
import java.io.IOException;
import java.net.URL;


public class Sonidos {

     URL url;
     Clip clip;
     AudioInputStream audioIn;


    Sonidos(String direccion){
        try {
            url = this.getClass().getClassLoader().getResource(direccion);
            audioIn = AudioSystem.getAudioInputStream(url);
            clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

}

