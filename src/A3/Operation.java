package A3;

@FunctionalInterface    // -> @FunctionalInterface = nur eine abstrakte Methode!
public interface Operation {
    int calculate(int a, int b);

    default String getDescription() {
        return "Default Operation";
    }

}
