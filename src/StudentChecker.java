public class StudentChecker {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.imie = "Jan";
        student1.nazwisko="Kowalski";
        student1.email="cos@cos.pl";
        student1.numerIndeksu=123456;
        student1.nick="s1";

        Student student2 = new Student();
        student2.imie = "Maria";
        student2.nazwisko="Nowak";
        student2.email="onet@onet.pl";
        student2.numerIndeksu= 9965433;
        student2.nick="s2";

        Student student3 = new Student();
        student3.imie = "Franciszek";
        student3.nazwisko="Starszy";
        student3.email="mail@mail.pl";
        student3.numerIndeksu=19203948;
        student3.nick="s3";


        Student[] tablica = new Student[3];
        tablica[0]=student1;
        tablica[1]=student2;
        tablica[2]=student3;

        for (int i=0; i < tablica.length; i++){
            tablica[i].przedstawSie();
            tablica[i].zalogujSie();
            tablica[i].podajNrIndeksu();

        }



    }
}
