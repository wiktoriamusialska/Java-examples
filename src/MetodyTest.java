public class MetodyTest {
    public static void main(String[] args) {
        Metody metody = new Metody();
//        metody.policzWynik();
//        metody.policzWynik();
//        int result = metody.pobierzWynik();
//        int resul2 = result *2;
//        System.out.println("Rezultat przed mnozeniu to: " + result);
//        System.out.println("Rezultat po mnozeniu to: " + resul2);
        metody.pobierzWynikParam(2);
        metody.pobierzWynikParam(100);
        metody.pobierzWynikParam(23);

       int result = metody.add(2,3);
        System.out.println(metody.add(2,6));
        System.out.println(result);


    }
}
