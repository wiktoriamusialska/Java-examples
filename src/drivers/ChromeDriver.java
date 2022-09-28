package drivers;

public class ChromeDriver implements WebDriver {
    @Override
    public void get() {
        System.out.println("Pobieram dane z Chroma");
    }
    @Override
    public void findElements() {
        System.out.println("Znajduję element w Chromie");
    }

}
