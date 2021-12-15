PImage face;
void setup() {
 face = loadImage("face.png");
   size(800,600);
    face.resize(width,height);
}

void draw() {
  background(face);
  fill(255);
  ellipse(200,200-50,400,250);
  fill(0);
  ellipse(mouseX,mouseY,150,50+50);
}
