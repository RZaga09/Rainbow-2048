class move {
   void up() {
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

   void down() {
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
   void left() {
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
   void right() {
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
   void new_block() {
      if (newb == true) {
         new_blocks = new color[0];
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
