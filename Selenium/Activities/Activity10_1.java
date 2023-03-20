package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity10_1 {
    public static void main(String[] args) {
        //Initialize Firefox driver
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.training-support.net/selenium/input-events");
        String pageTitle = driver.getTitle();
        System.out.println("The Page Title : " + pageTitle);

        WebElement cube = driver.findElement(By.id("wrapD3Cube"));
        Actions actions = new Actions(driver);

        //Left Click the Cube
        actions.click(cube);
        WebElement cubeValue = driver.findElement(By.className("active"));
        System.out.println("Left Click: " + cubeValue.getText());

        //Double click the cube
        actions.doubleClick(cube).perform();
        cubeValue = driver.findElement(By.className("active"));
        System.out.println("Double Click: " + cubeValue.getText());

        //Right click the cube
        actions.contextClick(cube).perform();
        cubeValue = driver.findElement(By.className("active"));
        System.out.println("Right Click: " + cubeValue.getText());

        //Close browser
        driver.quit();

    }
}