import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DiscoverPage {
    private final WebDriver driver;
    private final By topicButton = By.xpath("//li[@class='explore-section__list-item']");

    public DiscoverPage(WebDriver driver) {
        this.driver = driver;
    }


    public void openTopic(int index) {
        List<WebElement> elements = driver.findElements(topicButton);
        if (elements.size() > index) {
            elements.get(index).click();
        }
    }
}
