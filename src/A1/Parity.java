package A1;

public class Parity implements Rule {
    private String ruleName = "Parity";

    /* Parity-Rule:
        Cell-state true if input is even
     */
    @Override
    public boolean computeNextGen(boolean currentState, int input) {
        return (input % 2 == 0);
    }

    @Override
    public void printRuleName() {
        System.out.println("Meine Regel ist:" + this.ruleName);
    }
}
