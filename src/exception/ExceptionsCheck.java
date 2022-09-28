package exception;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionsCheck {
    public static void main(String[] args) throws ExceptionNew{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prosze podaj swoj wiek");
        int firstNumber = scanner.nextInt();
        if (firstNumber >= 18) {
                System.out.println("Jesteś pełnoletni");
            }
        else if (firstNumber < 18 & firstNumber > 0) {
                System.out.println("Jesteś niepełnoletni");
            }
        else if (firstNumber <0 ) {
            System.out.println("Błąd");
            throw new ExceptionNew("Your age is not valid");
        }
}}

