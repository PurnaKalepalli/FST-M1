package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {
    public static void main(String[] args) {
        //Initialize FireFox Driver
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        String pageTitle = driver.getTitle();
        System.out.println("The Page Title : "+pageTitle);

        //find the checkbox input element.
        WebElement textBox = driver.findElement(By.xpath("//input[@type='text']"));
        //check if it is visible on the page.
        System.out.println("The TextBox Input is enabled: " +textBox.isEnabled());
        //enable Check box
        driver.findElement(By.id("toggleInput")).click();
        //Print the result of the method again.
        System.out.println("The TextBox Input is enabled: " +textBox.isEnabled());

        //Close the browser
        driver.quit();
    }
}