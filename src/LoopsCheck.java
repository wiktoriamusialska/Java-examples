public class LoopsCheck {
    public static void main(String[] args) {
        //wypisz liczby podzielna przez 3 w zakresu 1-100
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

        //odwróć liczby w tablicy
        int[] lottoNumbers = new int[]{1, 3, 5};
        for (int i = lottoNumbers.length; i > 0; i--) {
            System.out.println(lottoNumbers[i - 1]);
        }
    }

    //inny przykład

/*        for (int j = 12; j > 0; j--) {
            System.out.println(j);
        }*/

    //inaczej trudniej - lepiej dla rektuterów

//    public static void main(String[] args) {
//        int[] tablica = new int[] {1, 3, 5, 7, 0};
//
//        for (int i = 0; i < (tablica.length / 2); i++) {
//            int temp = tablica[i];
//            tablica[i] = tablica[tablica.length-1-i];
//            tablica[tablica.length-1-i] = temp;
//        }
//        for (int i=0; i<tablica.length; i++){
//            System.out.println(tablica[i]);
//        }
//    }
}




