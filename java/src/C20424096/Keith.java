package C20424096;

import ie.tudublin.Visual;

public class Keith extends Visual {

    public void render(VisualSetup v) {
        v.strokeWeight((float) 1.7);
        v.colorMode(RGB);
        v.stroke(random(255), random(255), random(255));
        v.noFill();
        v.pushMatrix();
        v.translate(v.width / 2, v.height / 2);
        v.rotateY(2 * v.PI * v.frameCount / 120);
        v.rotateX(v.PI * v.frameCount / 120);
        v.sphere(600);
        v.box(300);
        v.fill(255);
        v.sphere(150);
        v.popMatrix();

    }

}