public class PersonTest {
    public static void main(String[] args) {
        MathTeacher math = new MathTeacher("Tom", 22, "UMK");
//        math.name = "Wiktoria";
//        math.age=23;
        math.eat();
        math.walk();
//        math.sayHello();
//        math.school="UMK";
//        math.teachMath();

        Footballer footballer = new Footballer("Mike", 23, "FC Barcelona");
//        footballer.name="Mike";
//        footballer.age=30;
        footballer.walk();
        footballer.eat();
//        footballer.footballClub = "FC Barcelona";
//        footballer.playFootbal();


    }
}
