package A1;

public class Combine implements Rule {
    private String ruleName = "Combine";

    @Override
    public boolean computeNextGen(boolean currentState, int input) {
        Parity p = new Parity();
        Random r = new Random();
        return (p.computeNextGen(currentState, input) && r.computeNextGen(currentState, input));
    }

    @Override
    public void printRuleName() {
        System.out.println("Meine Regel ist:" + this.ruleName);
    }
}
