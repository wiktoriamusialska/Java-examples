public class Student {
    public String imie;
    public String nazwisko;
    public String nick;
    public String email;
    public int numerIndeksu;
    public static String nazwaUczelni = "AGH po zmianie";

    public void przedstawSie() {
        System.out.println("Nazywam sie " + imie + " " + nazwisko);
    }

    public void zalogujSie() {
        System.out.println("Loguje sie jako " + nick);
    }

    public void podajNrIndeksu() {
        System.out.println("Moj numer indeksu to: "+ numerIndeksu);
    }

    public static void infoUczelnia() {
        System.out.println("Moja uczelnia to AGH " + nazwaUczelni);
        druga();
    }
    public static void druga() {
        System.out.println("Jestem druga metoda");
    }
}
