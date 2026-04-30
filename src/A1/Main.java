package A1;

public class Main {
     public static void main(String[] args) {
         Rule toggleRule = new ToggleRule();  // Regelwerk-Objekt
         boolean startStatus = true;    // startStatus-Zustand (boolean)

         testCellBehaviour(startStatus, toggleRule);
     }

     private static void testCellBehaviour(boolean startStatus, Rule regel) {
         Cell cell = new Cell(startStatus, regel);

         regel.printRuleName(); // Zelle gibt Regelwerk bekannt
         cell.printState();     // Zell gibt Anfangszustand bekannt

         for(int i = 1; i <= 5; i++) {
             System.out.println("Änderung Nummer / Übergabewert: " + i);
             cell.nextState(i); // fordert zum Zustandswechsel auf
             cell.printState(); // Zelle gibt neuen Zustand an
         }
     }
}
