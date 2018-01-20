void setup() {
  size (500,500);
}

void draw () {
    noFill();
  for (int i=25 ; i<=125 ; i= i+10){
  int x = i/10;
   if(x%2 == 0) {
     fill(229,37,37);}
     ellipse(250,250,i,i);

}}