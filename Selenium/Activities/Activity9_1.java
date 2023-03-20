package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity9_1 {
    public static void main(String[] args) {
        //Initialize FireFox Driver
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://training-support.net/selenium/selects");
        String pageTitle = driver.getTitle();
        System.out.println("The Page Title : " + pageTitle);

        Select dropdown = new Select(driver.findElement(By.id("single-select")));

        dropdown.selectByVisibleText("Option 2");
        System.out.println(driver.findElement(By.id("single-value")).getText());

        dropdown.selectByIndex(3);
        System.out.println(driver.findElement(By.id("single-value")).getText());

        dropdown.selectByValue("4");
        System.out.println(driver.findElement(By.id("single-value")).getText());

        List<WebElement> options = dropdown.getOptions();
        for(WebElement option : options) {
            System.out.println("Options : " + option.getText());
        }

        //Close browser
        driver.quit();

    }
}