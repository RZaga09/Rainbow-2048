class coloring {
   int x = 10;
   int y = 110;

   void getCol() {
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

   void colorArr() {
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

   void setState() {
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
