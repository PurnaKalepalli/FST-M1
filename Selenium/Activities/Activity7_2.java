package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity7_2 {
    public static void main(String[] args) {
        //Initialize fire fox driver
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://training-support.net/selenium/dynamic-attributes");
        String pageTitle = driver.getTitle();
        System.out.println("The Page Title : " + pageTitle);

        WebElement username = driver.findElement(By.xpath("//input[contains(@class, '-username')]"));
        username.sendKeys("LakshmiVeepuri");
        WebElement password = driver.findElement(By.xpath("//input[contains(@class, '-password')]"));
        password.sendKeys("Lakshmi@123");
        WebElement confirmPassword = driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following::input"));
        confirmPassword.sendKeys("Lakshmi@123");
        WebElement email = driver.findElement(By.xpath("//label[contains(text(), 'mail')]/following-sibling::input"));
        email.sendKeys("lakshmiveepuri@gmail.com");

        driver.findElement(By.xpath("//button[contains(text(), 'Sign Up')]")).click();

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("action-confirmation"))));
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Sign Up message : " + loginMessage);

        //Close the browser
        driver.quit();
    }
}