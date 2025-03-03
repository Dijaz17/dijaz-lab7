import java.util.Random;

public class TypeA extends Thing {
    TypeA(){
        row = 45;
        col = 50;
        lab = 'r';
    }

    public void maybeTurn(Random rand){
        int i = rand.nextInt(3);

          if (i == 1) {
            rightTurn();
          }
    
          if (i == 2) {
            leftTurn();
          }
    }

    
}
