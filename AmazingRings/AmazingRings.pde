int x = 150;
int y = 650;
int speed = 5;
void setup() {
  size (700, 700);
}

void draw () {
background(200);
  for (int i=25; i<=300; i+=10) {
    if (i%20 == 0) {
      noFill();
    } else {
      noFill();
    }
 
    ellipse(x, 250, i, i);

    ellipse(y, 250, i, i);
 
  }
  if (x>= width || x<0) {
    speed= speed*-1;
  }
  x+=speed;
  y-=speed;
}