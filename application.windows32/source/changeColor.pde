class changeColor {
   void up() {
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

   void down() {
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
      if (colors[10] == colors[14]) {
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

   void right() {
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
   }    void left() {
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

   void fusion1(int co1, int co2, int co3, int co4) {
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


   void fusion2(int co1, int co2, int co3) {
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

   void fusion3(int co1, int co2) {
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
