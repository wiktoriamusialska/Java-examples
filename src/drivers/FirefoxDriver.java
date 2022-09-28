package drivers;

public class FirefoxDriver implements WebDriver{
    @Override
    public void get() {
        System.out.println("Pobieram dane z Firefoxa");
    }
    @Override
    public void findElements() {
        System.out.println("Znajduję element w Firefoxa");
    }
}
