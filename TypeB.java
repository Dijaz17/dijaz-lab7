import java.util.Random;

public class TypeB extends Thing{
    TypeB(){
        row     = 55;
        col     = 50;
        lab     = 'b';
    }

    public void maybeTurn(Random rand){
        int i = rand.nextInt(3);
        this.timeSinceLast++;

        if (this.timeSinceLast == 10) {
        this.timeSinceLast = 0;

        if (i == 1) {
            rightTurn();
        }

        if (i == 2) {
            leftTurn();
        }
        }
    }
}
