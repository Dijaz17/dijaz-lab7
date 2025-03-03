import java.util.Random;

public abstract class Thing {
    /**
   * A "Thing" moves in a grid world. A TypeA Thing randomly
   * decides to turn left or right (or not turn) every "round",
   * and, afterward, takes a step forward.  A TypeB Thing
   * only considers making a random turn every 10th round.
   */
  
    // dir: 0=North, 1=East, 2=South, 3=West.
    // timeSinceLast: this is only important for "TypeB" Things.
    public Random rand = new Random(System.currentTimeMillis());

    protected int row;
    protected int col;
    protected int dir;
    protected int timeSinceLast;
    protected char lab;

    public void rightTurn() {
        this.dir = (this.dir + 1) % 4;
    }

    public void leftTurn() {
        this.dir = (this.dir + 3) % 4;
    }

    public abstract void maybeTurn(Random random);

    public void turn(){
        maybeTurn(rand);
    }

    public void step() {
        final int[] dc = {
          0, 1, 0, -1
        }, dr = {
          1, 0, -1, 0
        };
        this.row += dr[this.dir];
        this.col += dc[this.dir];
      }

      public String toString() {
        return row + " " + col + " " + lab;
    }
}
