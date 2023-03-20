package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity9_2 {
    public static void main(String[] args) {
        //Initialize FireFox Driver
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://training-support.net/selenium/selects");
        String pageTitle = driver.getTitle();
        System.out.println("The Page Title : " + pageTitle);

        Select multiSelectList = new Select(driver.findElement(By.id("multi-select")));

        if(multiSelectList.isMultiple()) {

            multiSelectList.selectByVisibleText("Javascript");
            System.out.println(driver.findElement(By.id("multi-value")).getText());

            multiSelectList.selectByValue("node");
            System.out.println(driver.findElement(By.id("multi-value")).getText());

            for(int i=4; i<=6; i++) {
                multiSelectList.selectByIndex(i);
            }
            System.out.println(driver.findElement(By.id("multi-value")).getText());

            multiSelectList.deselectByValue("node");
            System.out.println(driver.findElement(By.id("multi-value")).getText());

            multiSelectList.deselectByIndex(7);
            System.out.println(driver.findElement(By.id("multi-value")).getText());

            List<WebElement> selectedOption = multiSelectList.getAllSelectedOptions();
            for(WebElement Option : selectedOption) {
                System.out.println("Selected option : " + Option.getText());
            }

            multiSelectList.deselectAll();
            System.out.println(driver.findElement(By.id("multi-value")).getText());
        }
        //Close browser
        driver.quit();

    }
}