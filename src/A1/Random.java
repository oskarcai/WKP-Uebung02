package A1;

public class Random implements Rule {
    private String ruleName = "Random";

    /* Random-Rule:
        next Cell-state is completely random (independent of currentState and input)
     */
    @Override
    public boolean computeNextGen(boolean currentState, int input) {
        double rand = Math.random();
        return rand >= 0.5;
    }

    @Override
    public void printRuleName() {
        System.out.println("Meine Regel ist:" + this.ruleName);
    }
}
