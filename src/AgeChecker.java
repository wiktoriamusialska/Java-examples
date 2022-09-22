import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter your age ");
    int age = scanner.nextInt();
    if (age >=18) {
        System.out.println("Thanks for shopping");
    } else if (age < 0 ) {
            System.out.println("Enter correct value");
    } else {
        System.out.println("Age is under required. You mustn't buy alcohol here");
    }
    }
}
