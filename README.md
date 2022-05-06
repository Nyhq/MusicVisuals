# Music Visualiser Project
 
| Name | Student No. |
|-----------|-----------|
|Seán Breen | C20424096 |
|Dominika Adamczewska  | C20422036 |
|Keith Gore | C20432034 |
|Juliet Mullarney | C20432604 |

## Instructions
- Fork this repository and use it a starter project for your assignment
- Create a new package named your student number and put all your code in this package.
- You should start by creating a subclass of ie.tudublin.Visual
- There is an example visualiser called MyVisual in the example package
- Check out the WaveForm and AudioBandsVisual for examples of how to call the Processing functions from other classes that are not subclasses of PApplet

# Description of the assignment

We have four java processing visualisations in this assignment. Each section was created by a member of the group. Our visualisations change colors, forms, and sizes in response to the volume and frequency of the music. We utilized the audio minim library to extract audio from an mp3 file.


# Instructions
- Run "main.java" contained within the ie\tudublin package
- Follow instructions prompted on the screen

# How it works

Our code works by firstly housing each visualisation in it's own class, named after each group member (Sean.java... etc.). The driving code for this project is housed within "VisualSetup.java". Within this file is all of the setup code needed to render and switch the visualisations.

```Java
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

            /*
             * case 4:
             * {
             * background(0);
             * JulietVis.render(this);
             * break;
             * }
             */

        }

    }
```

Above is an example of how the switching mechanic works in our project. User input is taken from the keyboard and used to changed the variable "VisInt", this selects the current visualisation that is displayed to the screen.

# What I am most proud of in the assignment

<a href="https://youtu.be/JYBWuL0Xx7s?list=LL" target="_blank">
 <img src="https://img.youtube.com/vi/JYBWuL0Xx7s/0.jpg" alt="Watch the video" width="240" height="180" border="10" />
</a>

