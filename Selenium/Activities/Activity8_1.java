package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity8_1 {
    public static void main(String[] args) {
        //Initialize FireFox Driver
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://training-support.net/selenium/tables");
        String pageTitle = driver.getTitle();
        System.out.println("The Page Title : " + pageTitle);

        List<WebElement> columns = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[1]/td"));
        System.out.println("Number of columns are : " + columns.size());
        List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr"));
        System.out.println("Number of rows are : " + rows.size());

        List<WebElement> thirdRowVal = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[3]/td"));
        for(WebElement cellValue : thirdRowVal) {
            System.out.println("Cell Value : " + cellValue.getText());
        }

        WebElement secondCellValue = driver.findElement(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[2]/td[2]"));
        System.out.println("Second row and second column value : " + secondCellValue.getText());

        //Close browser
        driver.quit();

    }
}