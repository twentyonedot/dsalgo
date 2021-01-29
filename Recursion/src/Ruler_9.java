/* Draw the markings of a typical English ruler. For each inch, we place a tick with a numeric label. We denote the length of the tick designating a whole inch as the major tick length. Between the marks for whole inches, the ruler contains a series of minor ticks, placed at intervals of 1/2 inch, 1/4 inch, and so on. As the size of the interval decreases by half, the tick length decreases by one. */
/*
---- 0              ----- 0             --- 0
-                   -                   -
--                  --                  --
-                   -                   -
---                 ---                 --- 1
-                   -                   -
--                  --                  --
-                   -                   -
---- 1              ----                --- 2
-                   -                   -
--                  --                  --
-                   -                   -
---                 ---                 --- 3
-                   -
--                  --
-                   -
---- 2              ----- 1
*/
/*
(a) a 2-inch ruler with major tick length 4;
(b) a 1-inch ruler with major tick length 5;
(c) a 3-inch ruler with major tick length 3.
*/

/* Resources [http://homepage.divms.uiowa.edu/~hzhang/c31/notes/recursion.pdf] */

public class Ruler_9 {

    public static void main(String[] args){
        drawRuler(1, 5);
    }

    /* Prime Function that prints the English Ruler */
    public static void drawRuler(int nInches, int maxTickLength){
        drawLine(maxTickLength, 0); /* Draws first tick with label 0 */
        for (int inch = 1; inch <= nInches; inch++) {
            drawInterval(maxTickLength-1);
            drawLine(maxTickLength, inch);
        }
    }

    /* Function for drawing a single inch */
    public static void drawInterval(int centralTickLength){
        if(centralTickLength > 0){
            /* Visualize the Recursive pattern
                    Three parts to it.
                        1.Interval with centralTick length as centralTickLength-1
                        2.Single tick with length centralTickLength
                        3.Interval with centralTick length as centralTickLength-1
             */
            drawInterval(centralTickLength-1);
            drawLine(centralTickLength);
            drawInterval(centralTickLength-1);
        }
    }

    /* Helper Functions */
    public static void  drawLine(int tickLength, int inchLabel){
        for (int i = 0; i < tickLength; i++){
            System.out.print("- ");
        }
        if(inchLabel >= 0){
            System.out.print(inchLabel);
        }
        System.out.println();
    }

    public static void  drawLine(int tickLength){
        drawLine(tickLength, -1);
    }
}
