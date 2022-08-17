//operatory matematyczne umożliwiają wykonanie podstawowych operacji matematycznych
public class OperatoryMatematyczne {
    public static void main(String[] args) {
       int firstNumber = 4;
       int secondNumber = 6;
       float thirdNumber = 4.0F;
// Ctr+Shift + / komentarz wielolinijkowy
//psvm
//sout

        int addition = firstNumber + secondNumber;
       int substraction = firstNumber - secondNumber;
       int multiplication = firstNumber * secondNumber;
       float  division = thirdNumber / secondNumber;
       int mod = secondNumber % firstNumber;
        /*System.out.println("Wynik dodawania " + addition);
        System.out.println("Wynik odejmowania " + substraction);
        System.out.println("Wynik dzielenia " + multiplication);
        System.out.println("Wynik mnozenia " + division);
        System.out.println("Modulo "+mod);*/

        firstNumber+=secondNumber;
        System.out.println("Po dodaniu "+ firstNumber) ;
        firstNumber-=secondNumber;
        System.out.println("Po odejmowaniu "+ firstNumber) ;
        firstNumber*=secondNumber;
        System.out.println("Po mnozeniu "+ firstNumber) ;
        firstNumber/=secondNumber;
        System.out.println("Po dzieleniu "+ firstNumber) ;
        firstNumber%=secondNumber;
        System.out.println("Po modulo "+ firstNumber) ;


    }

}
