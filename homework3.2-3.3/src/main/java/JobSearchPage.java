import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JobSearchPage {
    private final WebDriver driver;
    private final By searchField = By.xpath("//input[@placeholder='Search job titles or companies']");
    private final By searchButton = By.xpath("//button[@aria-label='Search' and @type='submit']");

    public JobSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchJobs(String key) {
        driver.findElement(searchField).sendKeys(key);
        driver.findElements(searchButton).get(1).click();
    }
}
