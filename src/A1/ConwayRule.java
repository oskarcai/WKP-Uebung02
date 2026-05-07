package A1;

public class ConwayRule implements Rule {
    private String ruleName = "Conway";

    /* Conway-Rule:
        true if state was true before and input is 2 or 3
        or
        true if state was false before and input is 3
     */
    @Override
    public boolean computeNextGen(boolean currentState, int input) {
        if(currentState) {
            return (input == 2 || input == 3);
        } else {
            return input == 3;
        }
    }

    @Override
    public void printRuleName() {
        System.out.println("Meine Regel ist:" + this.ruleName);
    }
}
