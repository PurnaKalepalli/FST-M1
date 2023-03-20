package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity10_3 {
    public static void main(String[] args) {
        //Initialize firefox driver
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://training-support.net/selenium/drag-drop");
        String pageTitle = driver.getTitle();
        System.out.println("The Page Title : " + pageTitle);

        WebElement ball = driver.findElement(By.id("draggable"));
        WebElement drop1 = driver.findElement(By.id("droppable"));
        WebElement drop2 = driver.findElement(By.id("dropzone2"));

        Actions dragAndDrop = new Actions(driver);
        dragAndDrop.dragAndDrop(ball, drop1).build().perform();

        wait.until(ExpectedConditions.attributeToBeNotEmpty(drop1, "background-color"));
        System.out.println("Ball entered Drop Zone 1");

        dragAndDrop.dragAndDrop(ball, drop2).build().perform();
        wait.until(ExpectedConditions.attributeToBeNotEmpty(drop2, "background-color"));
        System.out.println("Ball entered Drop Zone 2");

        // Close the browser
        driver.quit();

    }
}