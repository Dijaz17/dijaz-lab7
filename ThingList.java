public class ThingList {
    /**
   * YOU'LL NEED TO PUT THIS SOMEWHERE ELSE
   * HINT: WOULDN'T IT BE NICE TO HAVE A LIST OR QUEUE SO THAT
   *       WE DON'T HAVE TO USE NODES HERE?
   * This class is for linked lists of Thing's
   */
    public Thing data;
    public ThingList next;

    public void moveAll(ThingList L){
        for( ThingList T = this; T != null; T = T.next ) {
            T.data.maybeTurn(T.data);
            T.data.step(T.data);
        }
    }

    public void printAll(ThingList L){
        for( ThingList T = L; T != null; T = T.next )
            System.out.println(T.data.toString());
    }
}
