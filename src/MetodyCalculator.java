import java.util.Scanner;

public class MetodyCalculator {
    public void addNumbers(int i, int i1) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prosze podaj pierwsza liczbe ");
        int liczba1 = scanner.nextInt();
        System.out.println("Prosze podaj druga liczbe ");
        int liczba2 = scanner.nextInt();
        System.out.println("Wynik dodawania " + liczba1 + " oraz "+ liczba2 + " wynosi " + (liczba1+liczba2));
    }
    public void subNumbers(int i, int i1) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prosze podaj pierwsza liczbe ");
        int liczba1 = scanner.nextInt();
        System.out.println("Prosze podaj druga liczbe ");
        int liczba2 = scanner.nextInt();
        System.out.println("Wynik odejmowania " + liczba1 + " oraz "+ liczba2 + " wynosi " + (liczba1-liczba2));
    }

    public int div(int firstNumber,int secondNumber) {
        return firstNumber / secondNumber;
    }

}
