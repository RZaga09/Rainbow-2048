int[] bx1 = {10, 155, 300, 445};
int[] by1 = {110, 255, 400, 545}; 
int[] bx2 = {10, 155, 300, 445};
int[] by2 = {110, 255, 400, 545};
int[] bx3;
int[] by3;
int x1, y1, x2, y2, x3, y3, xx3, yy3, z, j, k;
boolean same, three, initial, newb;
color c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16;
color[] colors;
color[] new_blocks;
int[] corresArr;
PVector newblo;

grid grid;
start_block startblock;
coloring states;
move move;
changeColor chcol;

void setup() {
   size(600, 700);
   grid = new grid();
   x1 = (int) random(0, 4);
   y1 = (int) random(0, 4);
   x2 = (int) random(0, 4);
   y2 = (int) random(0, 4);
   three = true;
   initial = true;
   colors = new color[16];
   chcol = new changeColor();
   startblock = new start_block();
   states = new coloring();
   move = new move();
}

void draw() {
   if (three == true) {
      three = false;
      int[] bx3 = {10, 155, 300, 445};
      int[] by3 = {110, 255, 400, 545};
      bx3[x1] = 1000;
      by3[y1] = 1000;
      bx3 = sort(bx3);
      by3 = sort(by3);
      bx3 = shorten(bx3);
      by3 = shorten(by3);
      xx3 = (int) random(0, 3);
      yy3 = (int) random(0, 3);
      x3 = bx3[xx3];
      y3 = by3[yy3];
   }

   if (x1 == x2 && y1 == y2) {
      same = true;
   }

   if (initial == true) {
      initial = false;
      background(50);
      title();
      grid.show();
      startblock.show(x3, y3);
      states.getCol();
   }
   background(50);
   states.colorArr();
   title();
   grid.show();
   states.setState();
   states.getCol();
   printArray(colors);
}


void keyReleased() {
   if (key == 'a') {
      setup();
   } else if (keyCode == UP || keyCode == DOWN || keyCode == RIGHT || keyCode == LEFT) {
      newb = true;
      if (keyCode == UP) {
         for (int s = 0; s < 3; s++) {
            move.up();
            states.colorArr();
            chcol.up();
         }
         for (int i = 0; i < 1; i++) {
            move.new_block();
            colors[(int) newblo.x] = (int) newblo.y;
            states.setState();
            states.getCol();
         }
      } else if (keyCode == DOWN) {
         for (int s = 0; s < 3; s++) {
            move.down();
            states.colorArr();
            chcol.down();
         }
         for (int i = 0; i < 1; i++) {

            move.new_block();
            colors[(int) newblo.x] = (int) newblo.y;
            states.setState();
            states.getCol();
         }
      } else if (keyCode == RIGHT) {
         for (int s = 0; s < 3; s++) {
            move.right();
            states.colorArr();
            chcol.right();
         }
         for (int i = 0; i < 1; i++) {

            move.new_block();
            colors[(int) newblo.x] = (int) newblo.y;
            states.setState();
            states.getCol();
         }
      } else if (keyCode == LEFT) {
         for (int s = 0; s < 3; s++) {
            move.left();
            states.colorArr();
            chcol.left();
         }
         for (int i = 0; i < 1; i++) {

            move.new_block();
            colors[(int) newblo.x] = (int) newblo.y;
            states.setState();
            states.getCol();
         }
      }
   }
   newb = true;
}               

void title() {
   textSize(64);
   fill(255);
   textAlign(CENTER);
   text("Rainbow 2048", width/2, 80);
}
