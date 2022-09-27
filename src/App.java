public class App {
    public String name;

    public App(String name) {
        System.out.println("Jestem w konstruktorze App");
        this.name=name;
    }
    public void appInfo() {
        System.out.println("Jestem aplikacją "+ name);

}}
