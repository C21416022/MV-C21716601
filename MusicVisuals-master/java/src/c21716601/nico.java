package c21716601;

import processing.core.PApplet;

public class nico {

    rockstar nico;

    public nico(rockstar nico) {
        this.nico = nico;
    }

    public float rotationAngle = 0.0f;

    public void render() {


          // set background color
  if (nico.frameCount % 120 < 60) {
    nico.background(0, 20, 0); // dark green
  } else {
    nico.background(0); // black
  }
  
        nico.noFill();
        nico.camera(0, 100, 400, 0, 0, 0, 1, 0, 0);
        nico.translate(0, 0, 0);
        nico.strokeWeight(4);

        float[] b = nico.getSmoothedBands();
        nico.stroke(0, 255, 0); // Green stroke color
        float size = b[2];

        // Apply rotation transformation
        nico.pushMatrix();
        nico.rotateZ(rotationAngle);
        nico.rect(-size / 2, -size / 2, size, size);
        nico.popMatrix();

        nico.noFill();
        nico.camera(0, -100, 400, 0, 0, 0, 5, 0, 0);
        nico.translate(0, 0, 0);
        nico.strokeWeight(4);

        float[] b1 = nico.getSmoothedBands();
        nico.stroke(0, 255, 0); // Green stroke color
        float size1 = b1[2];

        // Apply rotation transformation
        nico.pushMatrix();
        nico.rotateZ(rotationAngle);
        nico.rect(-size1 / 2, -size1 / 2, size1, size1);
        nico.popMatrix();

        nico.noFill();
        nico.camera(0, 0, 400, 0, 0, 0, 5, 0, 0);
        nico.translate(0, 0, 0);
        nico.strokeWeight(2);

        float[] b2 = nico.getSmoothedBands();
        for (int i = 0; i < b2.length; i++) {
            float c = PApplet.map(i, 255, b2.length, 50, 150);
            nico.stroke(0, 255, 0); // Green stroke color
            float s = b2[i];

            // Apply rotation transformation
            nico.pushMatrix();
            nico.rotateZ(rotationAngle);
            nico.ellipse(0, 0, s / 2, s / 2);
            nico.popMatrix();
        }

        // Increment rotation angle
        rotationAngle += 0.01f;
    }

}