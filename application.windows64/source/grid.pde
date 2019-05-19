class grid {
   int x = 10;
   int y = 110;
   
   void show() {
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
