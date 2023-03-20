package LiveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity2 {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void openBrowser(){
        //driver initialize
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.manage().window().maximize();
        //open Firefox browser
        driver.get("http://alchemy.hguy.co/crm");
    }
    @Test
    public void getImgURL(){
        //getting inmage URL
        WebElement headerImgURL = driver.findElement(By.xpath("//img[@alt='SuiteCRM']"));
        System.out.println("Header image URL is: "+headerImgURL.getAttribute("src"));
        }
        @AfterClass
    public void closeBrowser(){
        //close browser
        driver.quit();
    }
}

