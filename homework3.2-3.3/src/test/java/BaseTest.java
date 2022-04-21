import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    private static WebDriver driver;
    protected static MainPage mainPage;

    @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.linkedin.com/");

        mainPage = new MainPage(driver);
    }

    @AfterClass
    public static void tearDown(){
//        driver.quit();
    }
}
