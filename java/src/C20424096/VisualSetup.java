package C20424096;

import ie.tudublin.Visual;
import processing.core.*;

public class VisualSetup extends Visual {

    public void settings() {
        size(800, 800, P3D);
        println("CWD: " + System.getProperty("user.dir"));
    }

    // Set variables
    int VisInt = 0;
    boolean paused = true;
    PImage img;
    PImage bg;
    PImage JulBG;

    // Keyboard music controls
    public void keyPressed() {
        if (key >= '0' && key <= '4') {
            VisInt = key - '0';
        }

        switch (key) {
            case ' ': {
                // If the paused boolean variable is true play the file, otherwise pause it
                if (paused) {
                    getAudioPlayer().play();
                    paused = false;
                }

                else {
                    getAudioPlayer().pause();
                    paused = true;
                }

                break;
            }

            // Play audio file
            // add , '3', '4' when adding visual
            case '1', '2', '3', '4' : {
                getAudioPlayer().play();
                break;
            }

        }
    }

    // Project setup
    public void setup() {
        colorMode(HSB);
        noCursor();

        setFrameSize(1024);
        frameRate(60);

        // load background image
        img = loadImage("start.png");
        bg = loadImage("fortnite.jpg");
        JulBG =loadImage("Juliet.png");

        // Start minim and load audio file
        startMinim();
        loadAudio("Charmander.mp3");
        ap.loop();
    }

    // Declaration of each indivduial visualisation
    Sean SeanVis = new Sean(3440);
    Domi DomiVis = new Domi();
    Keith KeithVis = new Keith();
    Juliet JulietVis = new Juliet();

    public void draw() {
        switch (VisInt) {

            case 0: {
                background(img);
                ap.pause();
                break;
            }

            case 1: {
                background(bg);
                SeanVis.render(this);
                break;
            }

            case 2: {
                background(0);
                DomiVis.render(this);
                break;
            }

            case 3: {
                background(0);
                KeithVis.render(this);
                break;
            }

         
            case 4:
              {
              background(JulBG);
              JulietVis.render(this);
              break;
              }
        

        }

    }

}
