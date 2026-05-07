package A3;

public class Multiply implements Operation {

    @Override   // -> @Override = Methode aus Superklasse/Interface überschreiben
    public int calculate(int a, int b) {
        return a * b;
    }

    @Override
    public String getDescription() {
        return "Multiplikation zweier ganzer Zahlen a und b";
    }
}