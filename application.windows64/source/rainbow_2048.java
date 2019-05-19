import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class rainbow_2048 extends PApplet {

int[] bx1 = {10, 155, 300, 445};
int[] by1 = {110, 255, 400, 545}; 
int[] bx2 = {10, 155, 300, 445};
int[] by2 = {110, 255, 400, 545};
int[] bx3;
int[] by3;
int x1, y1, x2, y2, x3, y3, xx3, yy3, z, j, k;
boolean same, three, initial, newb;
int c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16;
int[] colors;
int[] new_blocks;
int[] corresArr;
PVector newblo;

grid grid;
start_block startblock;
coloring states;
move move;
changeColor chcol;

public void setup() {
   
   grid = new grid();
   x1 = (int) random(0, 4);
   y1 = (int) random(0, 4);
   x2 = (int) random(0, 4);
   y2 = (int) random(0, 4);
   three = true;
   initial = true;
   colors = new int[16];
   chcol = new changeColor();
   startblock = new start_block();
   states = new coloring();
   move = new move();
}

public void draw() {
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


public void keyReleased() {
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

public void title() {
   textSize(64);
   fill(255);
   textAlign(CENTER);
   text("Rainbow 2048", width/2, 80);
}
class changeColor {
   public void up() {
      if (colors[0] == colors[4]) {
         fusion1(0, 4, 8, 12);
      } 
      if (colors[4] == colors[8]) {
         fusion2(4, 8, 12);
      } 
      if (colors[8] == colors[12]) {
         fusion3(8, 12);
      }

      if (colors[1] == colors[5]) {
         fusion1(1, 5, 9, 13);
      } 
      if (colors[5] == colors[9]) {
         fusion2(5, 9, 13);
      } 
      if (colors[9] == colors[13]) {
         fusion3(9, 13);
      }

      if (colors[2] == colors[6]) {
         fusion1(2, 6, 10, 14);
      } 
      if (colors[6] == colors[10]) {
         fusion2(6, 10, 14);
      } 
      if (colors[10] == colors[14]) {
         fusion3(10, 14);
      }

      if (colors[3] == colors[7]) {
         fusion1(3, 7, 11, 15);
      } 
      if (colors[7] == colors[11]) {
         fusion2(7, 11, 15);
      } 
      if (colors[11] == colors[15]) {
         fusion3(11, 15);
      }
   }

   public void down() {
      if (colors[12] == colors[8]) {
         fusion1(12, 8, 4, 0);
      } 
      if (colors[8] == colors[4]) {
         fusion2(8, 4, 0);
      } 
      if (colors[4] == colors[0]) {
         fusion3(4, 0);
      }

      if (colors[13] == colors[9]) {
         fusion1(13, 9, 5, 1);
      } 
      if (colors[9] == colors[5]) {
         fusion2(9, 5, 1);
      } 
      if (colors[5] == colors[1]) {
         fusion3(5, 1);
      }

      if (colors[14] == colors[10]) {
         fusion1(14, 10, 6, 2);
      } 
      if (colors[10] == colors[6]) {
         fusion2(10, 6, 2);
      } 
      if (colors[6] == colors[2]) {
         fusion3(6, 2);
      }

      if (colors[15] == colors[11]) {
         fusion1(15, 11, 7, 3);
      } 
      if (colors[11] == colors[7]) {
         fusion2(11, 7, 3);
      } 
      if (colors[7] == colors[3]) {
         fusion3(7, 3);
      }
   }

   public void right() {
      if (colors[3] == colors[2]) {
         fusion1(3, 2, 1, 0);
      } 
      if (colors[2] == colors[1]) {
         fusion2(2, 1, 0);
      } 
      if (colors[1] == colors[0]) {
         fusion3(1, 0);
      }

      if (colors[7] == colors[6]) {
         fusion1(7, 6, 5, 4);
      } 
      if (colors[6] == colors[5]) {
         fusion2(6, 5, 4);
      } 
      if (colors[5] == colors[4]) {
         fusion3(5, 4);
      }

      if (colors[11] == colors[10]) {
         fusion1(11, 10, 9, 8);
      } 
      if (colors[10] == colors[9]) {
         fusion2(10, 9, 8);
      } 
      if (colors[9] == colors[8]) {
         fusion3(9, 8);
      }

      if (colors[15] == colors[14]) {
         fusion1(15, 14, 13, 12);
      } 
      if (colors[14] == colors[13]) {
         fusion2(14, 13, 12);
      } 
      if (colors[13] == colors[12]) {
         fusion3(13, 12);
      }
   }    public void left() {
      if (colors[0] == colors[1]) {
         fusion1(0, 1, 2, 3);
      } 
      if (colors[1] == colors[2]) {
         fusion2(1, 2, 3);
      } 
      if (colors[2] == colors[3]) {
         fusion3(2, 3);
      }

      if (colors[4] == colors[5]) {
         fusion1(4, 5, 6, 7);
      } 
      if (colors[5] == colors[6]) {
         fusion2(5, 6, 7);
      } 
      if (colors[6] == colors[7]) {
         fusion3(6, 7);
      }

      if (colors[8] == colors[9]) {
         fusion1(8, 9, 10, 11);
      } 
      if (colors[9] == colors[10]) {
         fusion2(9, 10, 11);
      } 
      if (colors[10] == colors[11]) {
         fusion3(10, 11);
      }

      if (colors[12] == colors[13]) {
         fusion1(12, 13, 14, 15);
      } 
      if (colors[13] == colors[14]) {
         fusion2(13, 14, 15);
      } 
      if (colors[14] == colors[15]) {
         fusion3(14, 15);
      }
   }

   public void fusion1(int co1, int co2, int co3, int co4) {
      if (colors[co1] == color(255, 0, 0)) {
         colors[co1] = color(255, 69, 0);
         colors[co2] = colors[co3];
         colors[co3] = colors[co4];
         colors[co4] = color(50);
      } else if (colors[co1] == color(255, 69, 0)) {
         colors[co1] = color(255, 165, 0);
         colors[co2] = colors[co3];
         colors[co3] = colors[co4];
         colors[co4] = color(50);
      } else if (colors[co1] == color(255, 165, 0)) {
         colors[co1] = color(255, 174, 66);
         colors[co2] = colors[co3];
         colors[co3] = colors[co4];
         colors[co4] = color(50);
      } else if (colors[co1] == color(255, 174, 66)) {
         colors[co1] = color(255, 255, 0);
         colors[co2] = colors[co3];
         colors[co3] = colors[co4];
         colors[co4] = color(50);
      } else if (colors[co1] == color(255, 255, 0)) {
         colors[co1] = color(173, 255, 47);
         colors[co2] = colors[co3];
         colors[co3] = colors[co4];
         colors[co4] = color(50);
      } else if (colors[co1] == color(173, 255, 47)) {
         colors[co1] = color(0, 128, 0);
         colors[co2] = colors[co3];
         colors[co3] = colors[co4];
         colors[co4] = color(50);
      } else if (colors[co1] == color(0, 128, 0)) {
         colors[co1] = color(13, 152, 186);
         colors[co2] = colors[co3];
         colors[co3] = colors[co4];
         colors[co4] = color(50);
      } else if (colors[co1] == color(13, 152, 186)) {
         colors[co1] = color(0, 0, 255);
         colors[co2] = colors[co3];
         colors[co3] = colors[co4];
         colors[co4] = color(50);
      } else if (colors[co1] == color(0, 0, 255)) {
         colors[co1] = color(0, 255, 128);
         colors[co2] = colors[co3];
         colors[co3] = colors[co4];
         colors[co4] = color(50);
         textSize(14);
         fill(255);
         textAlign(LEFT);
         text("YOU WIN!!!!", width/2, 80);
      }
   }


   public void fusion2(int co1, int co2, int co3) {
      if (colors[co1] == color(255, 0, 0)) {
         colors[co1] = color(255, 69, 0);
         colors[co2] = colors[co3];
         colors[co3] = color(50);
      } else if (colors[co1] == color(255, 69, 0)) {
         colors[co1] = color(255, 165, 0);
         colors[co2] = colors[co3];
         colors[co3] = color(50);
      } else if (colors[co1] == color(255, 165, 0)) {
         colors[co1] = color(255, 174, 66);
         colors[co2] = colors[co3];
         colors[co3] = color(50);
      } else if (colors[co1] == color(255, 174, 66)) {
         colors[co1] = color(255, 255, 0);
         colors[co2] = colors[co3];
         colors[co3] = color(50);
      } else if (colors[co1] == color(255, 255, 0)) {
         colors[co1] = color(173, 255, 47);
         colors[co2] = colors[co3];
         colors[co3] = color(50);
      } else if (colors[co1] == color(173, 255, 47)) {
         colors[co1] = color(0, 128, 0);
         colors[co2] = colors[co3];
         colors[co3] = color(50);
      } else if (colors[co1] == color(0, 128, 0)) {
         colors[co1] = color(13, 152, 186);
         colors[co2] = colors[co3];
         colors[co3] = color(50);
      } else if (colors[co1] == color(13, 152, 186)) {
         colors[co1] = color(0, 0, 255);
         colors[co2] = colors[co3];
         colors[co3] = color(50);
      } else if (colors[co1] == color(0, 0, 255)) {
         colors[co1] = color(0, 255, 128);
         colors[co2] = colors[co3];
         colors[co3] = color(50);
         textSize(14);
         fill(255);
         textAlign(LEFT);
         text("YOU WIN!!!!", width/2, 80);
      }
   }    

   public void fusion3(int co1, int co2) {
      if (colors[co1] == color(255, 0, 0)) {
         colors[co1] = color(255, 69, 0);
         colors[co2] = color(50);
      } else if (colors[co1] == color(255, 69, 0)) {
         colors[co1] = color(255, 165, 0);
         colors[co2] = color(50);
      } else if (colors[co1] == color(255, 165, 0)) {
         colors[co1] = color(255, 174, 66);
         colors[co2] = color(50);
      } else if (colors[co1] == color(255, 174, 66)) {
         colors[co1] = color(255, 255, 0);
         colors[co2] = color(50);
      } else if (colors[co1] == color(255, 255, 0)) {
         colors[co1] = color(173, 255, 47);
         colors[co2] = color(50);
      } else if (colors[co1] == color(173, 255, 47)) {
         colors[co1] = color(0, 128, 0);
         colors[co2] = color(50);
      } else if (colors[co1] == color(0, 128, 0)) {
         colors[co1] = color(13, 152, 186);
         colors[co2] = color(50);
      } else if (colors[co1] == color(13, 152, 186)) {
         colors[co1] = color(0, 0, 255);
         colors[co2] = color(50);
      } else if (colors[co1] == color(0, 0, 255)) {
         colors[co1] = color(0, 255, 128);
         colors[co2] = color(50);
         textSize(14);
         fill(255);
         textAlign(LEFT);
         text("YOU WIN!!!!", width/2, 80);
      }
   }
}
class coloring {
   int x = 10;
   int y = 110;

   public void getCol() {
      c1 = get(x + 8, y + 8);
      c2 = get(x + 153, y + 8);
      c3 = get(x + 298, y + 8);
      c4 = get(x + 443, y + 8);
      c5 = get(x + 8, y + 153);
      c6 = get(x + 153, y + 153);
      c7 = get(x + 298, y + 153);
      c8 = get(x + 443, y + 153);
      c9 = get(x + 8, y + 298);
      c10 = get(x + 153, y + 298);
      c11 = get(x + 298, y + 298);
      c12 = get(x + 443, y + 298);
      c13 = get(x + 8, y + 443);
      c14 = get(x + 153, y + 443);
      c15 = get(x + 298, y + 443);
      c16 = get(x + 443, y + 443);
   }

   public void colorArr() {
      colors[0] = c1; 
      colors[1] = c2;
      colors[2] = c3; 
      colors[3] = c4;
      colors[4] = c5; 
      colors[5] = c6;
      colors[6] = c7; 
      colors[7] = c8;
      colors[8] = c9; 
      colors[9] = c10;
      colors[10] = c11;
      colors[11] = c12;
      colors[12] = c13;
      colors[13] = c14;
      colors[14] = c15;
      colors[15] = c16;
   } 

   public void setState() {
      //Row 1 [b1 - b4]
      fill(colors[0]);
      rect(x, y, 145, 145);
      fill(colors[1]);
      rect(x + 145, y, 145, 145);
      fill(colors[2]);
      rect(x + 290, y, 145, 145);
      fill(colors[3]);
      rect(x + 435, y, 145, 145);

      //Row 2 [b5 - b8]
      fill(colors[4]);
      rect(x, y + 145, 145, 145);
      fill(colors[5]);
      rect(x + 145, y + 145, 145, 145);
      fill(colors[6]);
      rect(x + 290, y + 145, 145, 145);
      fill(colors[7]);
      rect(x + 435, y + 145, 145, 145);

      //Row 3 [b9 - b12]
      fill(colors[8]);
      rect(x, y + 290, 145, 145);
      fill(colors[9]);
      rect(x + 145, y + 290, 145, 145);
      fill(colors[10]);
      rect(x + 290, y + 290, 145, 145);
      fill(colors[11]);
      rect(x + 435, y + 290, 145, 145);

      //Row 4 [b13 - b16]
      fill(colors[12]);
      rect(x, y + 435, 145, 145);
      fill(colors[13]);
      rect(x + 145, y + 435, 145, 145);
      fill(colors[14]);
      rect(x + 290, y + 435, 145, 145);
      fill(colors[15]);
      rect(x + 435, y + 435, 145, 145);
   }
}
class grid {
   int x = 10;
   int y = 110;
   
   public void show() {
      noFill();
      stroke(255);
      strokeWeight(4);

      //Row 1 [b1 - b4]
      rect(x, y, 145, 145);
      rect(x + 145, y, 145, 145);
      rect(x + 290, y, 145, 145);
      rect(x + 435, y, 145, 145);

      //Row 2 [b5 - b8]
      rect(x, y + 145, 145, 145);
      rect(x + 145, y + 145, 145, 145);
      rect(x + 290, y + 145, 145, 145);
      rect(x + 435, y + 145, 145, 145);

      //Row 3 [b9 - b12]
      rect(x, y + 290, 145, 145);
      rect(x + 145, y + 290, 145, 145);
      rect(x + 290, y + 290, 145, 145);
      rect(x + 435, y + 290, 145, 145);

      //Row 4 [b13 - b16]
      rect(x, y + 435, 145, 145);
      rect(x + 145, y + 435, 145, 145);
      rect(x + 290, y + 435, 145, 145);
      rect(x + 435, y + 435, 145, 145);
   }
}
class move {
   public void up() {
      //column1
      if (c9 == color(50) || c13 == color(50)) {
         if (c9 != c13) {
            if (c9 == color(50)) {
               c9 = c13;
               c13 = color(50);
            }
         }
      }

      if (c5 == color(50) || c9 == color(50)) {
         if (c5 != c9) {
            if (c5 == color(50)) {
               c5 = c9;
               c9 = color(50);
            }
         }
      }
      if (c1 == color(50) || c5 == color(50)) {
         if (c1 != c5) {
            if (c1 == color(50)) {
               c1 = c5;
               c5 = color(50);
            }
         }
      }

      //column2
      if (c10 == color(50) || c14 == color(50)) {
         if (c10 != c14) {
            if (c10 == color(50)) {
               c10 = c14;
               c14 = color(50);
            }
         }
      }

      if (c6 == color(50) || c10 == color(50)) {
         if (c6 != c10) {
            if (c6 == color(50)) {
               c6 = c10;
               c10 = color(50);
            }
         }
      }
      if (c2 == color(50) || c6 == color(50)) {
         if (c2 != c6) {
            if (c2 == color(50)) {
               c2 = c6;
               c6 = color(50);
            }
         }
      }

      //column3
      if (c11 == color(50) || c15 == color(50)) {
         if (c11 != c15) {
            if (c11 == color(50)) {
               c11 = c15;
               c15 = color(50);
            }
         }
      }

      if (c7 == color(50) || c11 == color(50)) {
         if (c7 != c11) {
            if (c7 == color(50)) {
               c7 = c11;
               c11 = color(50);
            }
         }
      }
      if (c3 == color(50) || c7 == color(50)) {
         if (c3 != c7) {
            if (c3 == color(50)) {
               c3 = c7;
               c7 = color(50);
            }
         }
      }

      //column4
      if (c12 == color(50) || c16 == color(50)) {
         if (c12 != c16) {
            if (c12 == color(50)) {
               c12 = c16;
               c16 = color(50);
            }
         }
      }

      if (c8 == color(50) || c12 == color(50)) {
         if (c8 != c12) {
            if (c8 == color(50)) {
               c8 = c12;
               c12 = color(50);
            }
         }
      }

      if (c4 == color(50) || c8 == color(50)) {
         if (c4 != c8) {
            if (c4 == color(50)) {
               c4 = c8;
               c8 = color(50);
            }
         }
      }
   }


   //---------------------------------------------------------------------

   public void down() {
      //column1
      if (c5 == color(50) || c1 == color(50)) {
         if (c5 != c1) {
            if (c5 == color(50)) {
               c5 = c1;
               c1 = color(50);
            }
         }
      }

      if (c9 == color(50) || c5 == color(50)) {
         if (c9 != c5) {
            if (c9 == color(50)) {
               c9 = c5;
               c5 = color(50);
            }
         }
      }

      if (c13 == color(50) || c9 == color(50)) {
         if (c13 != c9) {
            if (c13 == color(50)) {
               c13 = c9;
               c9 = color(50);
            }
         }
      }

      //column2
      if (c6 == color(50) || c2 == color(50)) {
         if (c6 != c2) {
            if (c6 == color(50)) {
               c6 = c2;
               c2 = color(50);
            }
         }
      }

      if (c10 == color(50) || c6 == color(50)) {
         if (c10 != c6) {
            if (c10 == color(50)) {
               c10 = c6;
               c6 = color(50);
            }
         }
      }

      if (c14 == color(50) || c10 == color(50)) {
         if (c14 != c10) {
            if (c14 == color(50)) {
               c14 = c10;
               c10 = color(50);
            }
         }
      }

      //column3
      if (c7 == color(50) || c3 == color(50)) {
         if (c7 != c3) {
            if (c7 == color(50)) {
               c7 = c3;
               c3 = color(50);
            }
         }
      }

      if (c11 == color(50) || c7 == color(50)) {
         if (c11 != c7) {
            if (c11 == color(50)) {
               c11 = c7;
               c7 = color(50);
            }
         }
      }

      if (c15 == color(50) || c11 == color(50)) {
         if (c15 != c11) {
            if (c15 == color(50)) {
               c15 = c11;
               c11 = color(50);
            }
         }
      }

      //column4
      if (c8 == color(50) || c4 == color(50)) {
         if (c8 != c4) {
            if (c8 == color(50)) {
               c8 = c4;
               c4 = color(50);
            }
         }
      }

      if (c12 == color(50) || c8 == color(50)) {
         if (c12 != c8) {
            if (c12 == color(50)) {
               c12 = c8;
               c8 = color(50);
            }
         }
      }

      if (c16 == color(50) || c12 == color(50)) {
         if (c16 != c12) {
            if (c16 == color(50)) {
               c16 = c12;
               c12 = color(50);
            }
         }
      }
   }

   //---------------------------------------------------------------------
   public void left() {
      //row1
      if (c1 == color(50) || c2 == color(50)) {
         if (c1 != c2) {
            if (c1 == color(50)) {
               c1 = c2;
               c2 = color(50);
            }
         }
      }

      if (c2 == color(50) || c3 == color(50)) {
         if (c2 != c3) {
            if (c2 == color(50)) {
               c2 = c3;
               c3 = color(50);
            }
         }
      }

      if (c3 == color(50) || c4 == color(50)) {
         if (c3 != c4) {
            if (c3 == color(50)) {
               c3 = c4;
               c4 = color(50);
            }
         }
      }

      //row2
      if (c5 == color(50) || c6 == color(50)) {
         if (c5 != c6) {
            if (c5 == color(50)) {
               c5 = c6;
               c6 = color(50);
            }
         }
      }

      if (c6 == color(50) || c7 == color(50)) {
         if (c6 != c7) {
            if (c6 == color(50)) {
               c6 = c7;
               c7 = color(50);
            }
         }
      }

      if (c7 == color(50) || c8 == color(50)) {
         if (c7 != c8) {
            if (c7 == color(50)) {
               c7 = c8;
               c8 = color(50);
            }
         }
      }

      //row3
      if (c9 == color(50) || c10 == color(50)) {
         if (c9 != c10) {
            if (c9 == color(50)) {
               c9 = c10;
               c10 = color(50);
            }
         }
      }

      if (c10 == color(50) || c11 == color(50)) {
         if (c10 != c11) {
            if (c10 == color(50)) {
               c10 = c11;
               c11 = color(50);
            }
         }
      }

      if (c11 == color(50) || c12 == color(50)) {
         if (c11 != c12) {
            if (c11 == color(50)) {
               c11 = c12;
               c12 = color(50);
            }
         }
      }

      //row4
      if (c13 == color(50) || c14 == color(50)) {
         if (c13 != c14) {
            if (c13 == color(50)) {
               c13 = c14;
               c14 = color(50);
            }
         }
      }

      if (c14 == color(50) || c15 == color(50)) {
         if (c14 != c15) {
            if (c14 == color(50)) {
               c14 = c15;
               c15 = color(50);
            }
         }
      }

      if (c15 == color(50) || c16 == color(50)) {
         if (c15 != c16) {
            if (c15 == color(50)) {
               c15 = c16;
               c16 = color(50);
            }
         }
      }
   }
   //--------------------------------------------------------
   public void right() {
      //row1
      if (c4 == color(50) || c3 == color(50)) {
         if (c4 != c3) {
            if (c4 == color(50)) {
               c4 = c3;
               c3 = color(50);
            }
         }
      }

      if (c3 == color(50) || c2 == color(50)) {
         if (c3 != c2) {
            if (c3 == color(50)) {
               c3 = c2;
               c2 = color(50);
            }
         }
      }

      if (c2 == color(50) || c1 == color(50)) {
         if (c2 != c1) {
            if (c2 == color(50)) {
               c2 = c1;
               c1 = color(50);
            }
         }
      }

      //row2
      if (c8 == color(50) || c7 == color(50)) {
         if (c8 != c7) {
            if (c8 == color(50)) {
               c8 = c7;
               c7 = color(50);
            }
         }
      }

      if (c7 == color(50) || c6 == color(50)) {
         if (c7 != c6) {
            if (c7 == color(50)) {
               c7 = c6;
               c6 = color(50);
            }
         }
      }

      if (c6 == color(50) || c5 == color(50)) {
         if (c6 != c5) {
            if (c6 == color(50)) {
               c6 = c5;
               c5 = color(50);
            }
         }
      }

      //row3
      if (c12 == color(50) || c11 == color(50)) {
         if (c12 != c11) {
            if (c12 == color(50)) {
               c12 = c11;
               c11 = color(50);
            }
         }
      }

      if (c11 == color(50) || c10 == color(50)) {
         if (c11 != c10) {
            if (c11 == color(50)) {
               c11 = c10;
               c10 = color(50);
            }
         }
      }

      if (c10 == color(50) || c9 == color(50)) {
         if (c10 != c9) {
            if (c10 == color(50)) {
               c10 = c9;
               c9 = color(50);
            }
         }
      }

      //row4
      if (c16 == color(50) || c15 == color(50)) {
         if (c16 != c15) {
            if (c16 == color(50)) {
               c16 = c15;
               c15 = color(50);
            }
         }
      }

      if (c15 == color(50) || c14 == color(50)) {
         if (c15 != c14) {
            if (c15 == color(50)) {
               c15 = c14;
               c14 = color(50);
            }
         }
      }

      if (c14 == color(50) || c13 == color(50)) {
         if (c14 != c13) {
            if (c14 == color(50)) {
               c14 = c13;
               c13 = color(50);
            }
         }
      }
   }

   //---------------------------------------------------------------
   public void new_block() {
      if (newb == true) {
         new_blocks = new int[0];
         corresArr = new int[0]; 
         for (int i = 0; i < 16; i++) {
            if (colors[i] == color(50)) {
               new_blocks = expand(new_blocks, new_blocks.length + 1);
               corresArr = expand(corresArr, corresArr.length + 1);
               new_blocks[new_blocks.length - 1] = colors[i];
               corresArr[corresArr.length - 1] = i;
            }
         }

         z = (int) random(0, new_blocks.length - 1);
         j = (int) random(0, corresArr.length - 1);
         if (z < new_blocks.length) {
            new_blocks[z] = color(255, 0, 0);
            k = corresArr[j];
            newblo = new PVector(k, new_blocks[z]);
         }
         newb = false;
      }
   }
}

class start_block {
   public void show(int x3, int y3) {
      if (same == !true) {
         fill(255, 0, 0);
         rect(bx1[x1], by1[y1], 145, 145);
         rect(bx2[x2], by2[y2], 145, 145);
      } else {
         fill(255, 0, 0);
         rect(bx1[x1], by1[y1], 145, 145);
         rect(x3, y3, 145, 145);
      }
   }
}
   public void settings() {  size(600, 700); }
   static public void main(String[] passedArgs) {
      String[] appletArgs = new String[] { "rainbow_2048" };
      if (passedArgs != null) {
        PApplet.main(concat(appletArgs, passedArgs));
      } else {
        PApplet.main(appletArgs);
      }
   }
}
