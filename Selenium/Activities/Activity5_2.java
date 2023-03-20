package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {
    public static void main(String[] args) {
        //initialize FireFox Driver
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        String pageTitle = driver.getTitle();
        System.out.println("The Page Title : "+pageTitle);

        //find the checkbox input element.
        WebElement checkboxInput = driver.findElement(By.xpath("//input[@type='checkbox']"));
        //check if it is visible on the page.
        System.out.println("The checkbox Input is selected: " +checkboxInput.isSelected());
        //Click the "select Checkbox".
        checkboxInput.click();
        //Print the result of the method again.
        System.out.println("The checkbox Input is selected: " +checkboxInput.isSelected());

        //Close the browser
        driver.quit();
    }
}