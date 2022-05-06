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

## Video of assignment running

<a href="https://youtu.be/JYBWuL0Xx7s?list=LL" target="_blank">
 <img src="https://img.youtube.com/vi/JYBWuL0Xx7s/1.jpg" alt="Watch the video" width="800" height="800" border="10" />
</a>



# Instructions
- Run "main.java" contained within the ie\tudublin package
- Follow instructions prompted on the screen

# How it works

Our code works by firstly housing each visualisation in it's own class, named after each group member and also one combining all of the visualisations (Sean.java... etc.). The driving code for this project is housed within "VisualSetup.java". Within this file is all of the setup code needed to render and switch the visualisations.

```Java
  // Declaration of each indivduial visualisation
    Sean SeanVis = new Sean(3440);
    Domi DomiVis = new Domi();
    Keith KeithVis = new Keith();
    Juliet JulietVis = new Juliet();
    KeithMini Keith = new KeithMini();

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

              case 5:
              {
              background(bg);
              SeanVis.render(this);
              DomiVis.render(this);
              Keith.render(this);
              break;
              }
        

        }

    }
```

Above is an example of how the switching mechanic works in our project. User input is taken from the keyboard and used to changed the variable "VisInt", this selects the current visualisation that is displayed to the screen.

## Visual 1 - Seán

The visualisation I designed was a relatively simple concept. I took the idea of a traditional music visualiser and added it to an extra border so that it would display on both the top and bottom of the output screen. A lerped audio buffer was used to change the visual elements, drawn as smoothed rectangles, this made them responsive to both sound and colour.

Finally, I restricted the domain in which the colours can appear to match them to the background image, which was chosen specifically to encompass all of our group's interests.

![image](https://user-images.githubusercontent.com/72255273/167148188-dd6cb189-120d-4f42-840f-9d9e8b333c72.png)


## Visual 2 - Domi

My visualisation was inspired by the circles on a classic speaker. I thought it would be cool to make them audio reactive, however I also wanted it to be less basic than just reactive circles. 

The visualisation is made up of a rectangle border containing three 3D spheres, which in turn are made up of small circular particles. The size of these circle particles depends on the amplitude of the music. In order to create rainbow colours for a trippy effect, I gave the stroke a random value of 0-255. You can also rotate the visualiation using your mouse.

I also added in rainbow circles of a random size from 0-90 to each corner and to the middle of the visualizer. These circles do not react to music, but give the illusion of doing so.

![image](https://user-images.githubusercontent.com/72255273/167148236-dce4e284-1d28-4847-9ba3-9a3abf464b83.png)

## Visual 3 - Keith

![image](https://user-images.githubusercontent.com/72255273/167148290-3ff06fd2-6b0f-41f5-bfb6-329322a13688.png)

## Visual 4 - Juliet

![image](https://user-images.githubusercontent.com/72255273/167148337-08ad0682-3d51-4cbc-852e-22dea63b2c4a.png)

## Visual 5 - Combined

![image](https://user-images.githubusercontent.com/72255273/167148377-a18024ef-3565-412e-b289-b741f6bd62e9.png)




# What I am most proud of in the assignment

Our team worked incredibly hard to make this project the best we could. We are very proud of being able to deal with the challenges we faced along the way, and making it all work and come together to form a great project.

We believe we succeeded in making a very object oriented program through our use of classes, inheritance, and the PApplet library. We are also proud of using more foreign concepts - such as creating shapes in 3D.

It was a very rewarding process to watch everyone's visuals come to life, and we believe that the end result is very captivating. Despite our visuals being quite different from each other, they worked exceptionally well together, and created a fascinating outcome; which we are incredibly proud of.


