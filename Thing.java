import java.util.Random;

public class Thing {
    /**
   * A "Thing" moves in a grid world. A TypeA Thing randomly
   * decides to turn left or right (or not turn) every "round",
   * and, afterward, takes a step forward.  A TypeB Thing
   * only considers making a random turn every 10th round.
   */
  
    // dir: 0=North, 1=East, 2=South, 3=West.
    // timeSinceLast: this is only important for "TypeB" Things.
    public static Random rand = new Random(System.currentTimeMillis());

    public int  row, col, dir, timeSinceLast;
    public char lab = 'r';
    public boolean isTypeB = false;
    public boolean isTypeC = false;

    public void rightTurn(Thing t) {
        t.dir = (t.dir + 1) % 4;
    }

    public void leftTurn(Thing t) {
        t.dir = (t.dir + 3) % 4;
    }

    public void maybeTurn(Thing t) {
        int i = rand.nextInt(3);
    
        if (t.isTypeB) {
          t.timeSinceLast++;
    
          if (t.timeSinceLast == 10) {
            t.timeSinceLast = 0;
    
            if (i == 1) {
              rightTurn(t);
            }
    
            if (i == 2) {
              leftTurn(t);
            }
          }
        } else if (t.isTypeC){
            t.timeSinceLast++;

            if(t.timeSinceLast % 10 == 0){
                t.timeSinceLast = 0;
                t.dir = 0;
            } else if(t.timeSinceLast % 2 == 0){
                leftTurn(t);
            } else{
                rightTurn(t);
            }

        } else {
          if (i == 1) {
            rightTurn(t);
          }
    
          if (i == 2) {
            leftTurn(t);
          }
        }
    }

    public void step(Thing t) {
        final int[] dc = {
          0, 1, 0, -1
        }, dr = {
          1, 0, -1, 0
        };
        t.row += dr[t.dir];
        t.col += dc[t.dir];
      }

      public String toString() {
        return row + " " + col + " " + lab;
    }
}
