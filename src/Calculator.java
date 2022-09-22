import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prosze podaj pierwsza liczbe ");
        int liczba1 = scanner.nextInt();
        System.out.println("Prosze podaj druga liczbe ");
        int liczba2 = scanner.nextInt();
        System.out.println("Wynik dzielenie " + liczba1 + " oraz "+ liczba2 + " wynosi " + liczba1/liczba2);
        System.out.println("Wynik mnozenia " + liczba1 + " oraz "+ liczba2 + " wynosi " + liczba1*liczba2);
        System.out.println("Wynik dodawania " + liczba1 + " oraz "+ liczba2 + " wynosi " + liczba1+liczba2);
        System.out.println("Wynik odejmowania " + liczba1 + " oraz "+ liczba2 + " wynosi " + (liczba1-liczba2));
    }
}
