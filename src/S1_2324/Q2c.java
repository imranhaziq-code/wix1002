package S1_2324;

import java.util.*;
import java.io.*;

public class Q2c {
    public static void main(String[] args) {
        // Create an array of Playable objects
        Playable[] instruments = new Playable[2];
        
        // Initialize the array with Guitar and Piano instances
        instruments[0] = new Guitar();
        instruments[1] = new Piano();
        
        // Iterate through the array and invoke the play() method on each object
        for (Playable instrument : instruments) {
            instrument.play(); // Polymorphism in action
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