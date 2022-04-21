import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver driver;
    private By emailField = By.id("session_key");
    private By passwordField = By.id("session_password");
    private By signInButton = By.className("sign-in-form__submit-button");
    private By jobButton = By.xpath("//a[@href='https://www.linkedin.com/jobs/jobs-in-yerevan?trk=homepage-basic_guest_nav_menu_jobs']");
    private By discoverButton = By.xpath("//a[@href='https://www.linkedin.com/content-hub/?trk=homepage-basic_guest_nav_menu_discover']");


    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void search(String email, String password) {
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElements(signInButton).get(0).click();
    }

    public JobSearchPage openJobsPage() {
        driver.findElement(jobButton).click();
        return new JobSearchPage(driver);
    }

    public DiscoverPage openDiscoverPage(){
        driver.findElement(discoverButton).click();
        return new DiscoverPage(driver);
    }
}
