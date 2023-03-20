package Activities;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {
        public static void main(String[] args) {
            // Initialize the Firefox driver
            WebDriver driver = new FirefoxDriver();

            //Open the browser
            driver.get("https://www.training-support.net/selenium/simple-form");

            //Print Page Title
            String pageTitle = driver.getTitle();
            System.out.println(pageTitle);

            //Enter Input Fields
            WebElement firstName = driver.findElement(By.xpath("//input[@id = 'firstName']"));
            WebElement lastName = driver.findElement(By.xpath("//input[@id = 'lastName']"));

            firstName.sendKeys("Lakshmi");
            lastName.sendKeys("Veepuri");

            //Enter the email
            driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("lakshmiveepuri@gmail.com");

            //Enter the contact number
            driver.findElement(By.xpath("//input[@id = 'number']")).sendKeys("9347526996");

            //Enter Message
            driver.findElement(By.xpath("//textarea")).sendKeys("This is my message");

            //Click Submit
            driver.findElement(By.xpath("//input[contains(@class, 'green')]")).click();

            driver.quit();
        }
    }

