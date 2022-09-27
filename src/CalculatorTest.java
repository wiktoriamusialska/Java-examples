import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        MetodyCalculator metody = new MetodyCalculator();
        metody.addNumbers(22, 11);
        metody.subNumbers(1,1);
        int result = metody.div(22,11);
        System.out.println("Wynik dzielenia to: " + result);
    }
}
