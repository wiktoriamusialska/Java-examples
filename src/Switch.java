public class Switch {
    public static void main(String[] args) {
        String danie ="Frytki";

        switch(danie) {
            case "Pizza":
                System.out.println("Cena to 22zl");
                break;

            case "Losos":
                System.out.println("Cena to 30zl");
                break;

            case "Frytki":
                System.out.println("Cena to 9zl");
                break;
            default:
                System.out.println("Brak dania w karcie");

        }
    }
}
