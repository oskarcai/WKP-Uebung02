package A3;

public class Add implements Operation {

    @Override   // -> @Override = Methode aus Superklasse/Interface überschreiben
    public int calculate(int a, int b) {
        return a + b;
    }

    @Override
    public String getDescription() {
        return "Addition zweier ganzer Zahlen a und b";
    }
}
