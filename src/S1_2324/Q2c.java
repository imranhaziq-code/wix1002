package S1_2324;

import java.util.*;
import java.io.*;

public class Q2c {
    public static void main(String[] args) {
        Playable[] instruments = new Playable[2];
        
        instruments[0] = new Guitar();
        instruments[1] = new Piano();
        
        for (int i = 0; i < instruments.length; i++) {
            Playable instrument = instruments[i];
            instrument.play();
        }
    }
}

interface Playable {
    public void play();
}

class Guitar implements Playable {
    public void play(){
        System.out.println("Playing Guitar!");
    }
}

class Piano implements Playable {
    public void play(){
        System.out.println("Playing Piano!");
    }
}