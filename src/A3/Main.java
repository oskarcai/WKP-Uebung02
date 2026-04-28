package A3;

public class Main {
    @SuppressWarnings("deprecation")    // -> @SuppressWarnings = Warnung unterdrücken
    public static void main(String[] args) {

        LegacyCalculator calc = new LegacyCalculator();
        System.out.println( calc.add(5,3) );    // -> @Depracated = veraltet
        System.out.println( calc.plus(5,3) );

    }

    public static void anotherMethod() {
        LegacyCalculator calc = new LegacyCalculator();
        System.out.println( calc.add(5,3) );    // ->@Depracated = veraltet
        System.out.println( calc.plus(5,3) );
    }
}
