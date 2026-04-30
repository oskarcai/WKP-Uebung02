package A1;

public class ToggleRule implements Rule {
    private String ruleName = "ToggleRule";

    @Override
    public boolean computeNextGen(boolean currentState, int input) {
        return !currentState;
    }

    @Override
    public void printRuleName() {
        System.out.println(ruleName);
    }
}
