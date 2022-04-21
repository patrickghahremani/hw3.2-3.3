import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://elearning.aua.am/");

        WebElement menuItem_4 = driver.findElement(By.linkText("Log in"));
        menuItem_4.click();

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("test user");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("test password");


        WebElement rememberusername = driver.findElement(By.id("rememberusername"));
        rememberusername.click();

        List<WebElement> button = driver.findElements(By.tagName("button"));
        button.get(0).click();

        WebElement element = driver.findElement(By.linkText("Forgotten your username or password?"));
        element.click();
    }
}
