package A1;

public interface Rule {
    boolean computeNextGen(boolean currentState, int input);
    void printRuleName();
}
