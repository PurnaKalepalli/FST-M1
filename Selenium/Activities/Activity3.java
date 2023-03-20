package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) throws InterruptedException {
        // Initialize Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://training-support.net/selenium/simple-form");
        System.out.println ("Form Title: "+driver.getTitle().toString().trim());

        driver.findElement(By.id("firstName")).sendKeys("Lakshmi");
        driver.findElement(By.id("lastName")).sendKeys("Veepuri");
        driver.findElement(By.id("email")).sendKeys("lakshmiveepuri92@gmail.com");
        driver.findElement(By.id("number")).sendKeys("9347526996");
        driver.findElement(By.xpath("//input[@value='submit']")).click();

        Thread.sleep(4);

        // Close the browser
        driver.quit();
    }
}