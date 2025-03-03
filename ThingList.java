public class ThingList {
    /**
   * YOU'LL NEED TO PUT THIS SOMEWHERE ELSE
   * HINT: WOULDN'T IT BE NICE TO HAVE A LIST OR QUEUE SO THAT
   *       WE DON'T HAVE TO USE NODES HERE?
   * This class is for linked lists of Thing's
   */
    public Thing data;
    public ThingList next;

    // public void addThing(Thing T, ThingList L){
    //     ThingList newThingList = new ThingList();
    //     newThingList.data = T;
    //     newThingList.next = this;
    //     this = newThingList;
    // }

    public void moveAll(ThingList L){
        for( ThingList T = this; T != null; T = T.next ) {
            T.data.turn();
            T.data.step();
        }
    }

    public void printAll(ThingList L){
        for( ThingList T = L; T != null; T = T.next )
            System.out.println(T.data.toString());
    }
}
