package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity10_2 {
    public static void main(String[] args) {
        //initialize firefox driver
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.training-support.net/selenium/input-events");
        String pageTitle = driver.getTitle();
        System.out.println("The Page Title : " + pageTitle);

        Actions actions = new Actions(driver);
        WebElement pressedKey = driver.findElement(By.id("keyPressed"));
        Action firstAction = actions.sendKeys("P").build();

        firstAction.perform();
        String pressedKeyText = pressedKey.getText();
        System.out.println("Selected key is : " + pressedKeyText);

        Action secondAction = actions
                .keyDown(Keys.CONTROL)
                .sendKeys("a")
                .sendKeys("c")
                .keyUp(Keys.CONTROL)
                .build();
        secondAction.perform();
        pressedKeyText = pressedKey.getText();
        System.out.println("Selected key is: " + pressedKeyText);

        //Close browser
        driver.quit();

    }
}