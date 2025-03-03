import java.util.Random;

public class TypeC extends Thing{
    TypeC(){
        row     = 50;
        col     = 50;
        lab     = 'y';
    }

    public void maybeTurn(Random rand){
        this.timeSinceLast++;

        if(this.timeSinceLast % 2 == 0){
            timeSinceLast = 0;
            leftTurn();
        } else{
            rightTurn();
        }
    }

}
