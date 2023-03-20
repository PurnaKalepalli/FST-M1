package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7_1 {
    public static void main(String[] args){
        //initialize firefox driver
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-attributes");
        String title = driver.getTitle();
        WebElement username = driver.findElement(By.xpath("//input[starts-with(@class, 'username')]"));
        WebElement password = driver.findElement(By.xpath("//input[starts-with(@class, 'password')]"));
        username.sendKeys("admin");
        password.sendKeys("password");
        driver.findElement(By.xpath("//button[contains(text(), 'Log in')]")).click();
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message: " + loginMessage);

        //Close browser
        driver.quit();



    }
}
