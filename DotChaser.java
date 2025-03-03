import java.util.*;

public class DotChaser {
  public static Random rand = new Random(System.currentTimeMillis());

  
  /**
   * This static method is ok :)
   */
  public static void main(String[] args) {
    int N = 200;

    if( args.length != 0 )
      N = Integer.parseInt(args[0]);

    // INSTEAD OF A NODE, CREATE SOMETHING MORE USER-FRIENDLY.
    ThingList L = null;
    int count = 0;

    while( true ) {
      // Every N rounds, add another typeA and typeB Thing.
      if( count % N == 0 ) {

        // Add a typeA thing to the list.
        // (GEE, THAT'S A LOT OF CODE FOR JUST CREATING ONE THING)
        TypeA tA = new TypeA();
        
        ThingList nA = new ThingList();
        nA.data = tA;
        nA.next = L;
        L       = nA;

        // Add a typeB thing to the list
        TypeB tB = new TypeB();
        
        ThingList nB = new ThingList();
        nB.data = tB;
        nB.next = L;
        L       = nB;

        TypeC tC = new TypeC();
        
        ThingList nC = new ThingList();
        nC.data = tC;
        nC.next = L;
        L       = nC;
      }

      // Print out each thing.
      // (SEEMS LIKE A NICE PRINTALL() METHOD CALL WOULD WORK HERE)
      // (SEEMS LIKE A toString() METHOD IN THE CLASS WOULD ALSO BE NICE)
      L.printAll(L);

      System.out.println("done");
      System.out.flush();

      // Move each thing.
      // (SEEMS LIKE A NICE MOVEALL() METHOD CALL WOULD WORK HERE)
      L.moveAll(L);
      count++;
    }
  }
}
