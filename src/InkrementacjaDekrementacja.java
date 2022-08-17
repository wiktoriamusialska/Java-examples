public class InkrementacjaDekrementacja {
    public static void main(String[] args) {
        //inkrementacja - zwiększanie o 1

        int a = 0;
        System.out.println("Wartość a "+a); //0
        int b = a++; //postinkrementacja - najpierw przypisujemy starą wartość, a potem zwiększamy o jeden
        System.out.println("Wartosc b postinkrementacja " +b); //o
        System.out.println("Wartosc a postinkrementacja "+a); //1
        int c = ++a; //preinkrementacja - najpierw zwiększamy potem przypisujemy wartość
        System.out.println("Wartosc c preinkrementacja  "+c);//2
        System.out.println("Wartosc a preinkrementacja  "+a);//2

    }
}
