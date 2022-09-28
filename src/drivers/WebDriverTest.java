package drivers;

public class WebDriverTest {
    public static void main(String[] args) throws NoValidBrowserName{
        String name;
        WebDriver driver = getDriver("chrome");
        driver.get();
        driver.findElements();
        driver.findElements();
        driver.findElements();
        driver.findElements();
        driver.findElements();

        //FirefoxDriver firefox = new FirefoxDriver();
        //firefox.get();
        //firefox.findElements();
    }
        private static WebDriver getDriver(String name) throws NoValidBrowserName{

            if (name.equals("chrome")) {
                return new ChromeDriver();
            } else if (name.equals("firefox")) {
                return new FirefoxDriver();
            }
            throw new NoValidBrowserName("No valid browser name. ");
        }

    }