package A1;

public class Cell {
    private boolean state;
    private Rule regel;     // Interface als Variablentyp
                            // -> regel kann Objekte aller Klassen speichern, die Rule implementieren

    // Konstruktor -> weist von Anfang an state einen boolean-Zustand
    //                  und regel ein Regelwerk-Objekt zu
    public Cell(boolean state, Rule regel) {
        this.state = state;
        this.regel = regel;
    }

    public void nextState(int input) {
        state = regel.computeNextGen(state, input);
    }

    // printed aktuellen boolean-Zustand der Zelle
    public void printState() {
        System.out.println("Status ist: " + state);
    }

    // printed die Regel, der die Zelle folgt
    public void printMyRule() {
        regel.printRuleName();
    }
}
