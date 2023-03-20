package LiveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity3 {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void openBrowser(){
        //drver initialise
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.manage().window().maximize();
        //open Firefox browser
        driver.get("http://alchemy.hguy.co/crm");
    }
    @Test
    public void copyrightText(){
        //printing copyright text
        String copyrightText = driver.findElement(By.id("admin_options")).getText();
        System.out.println("CopyRight Text in the Footer is: "+copyrightText);
    }
    @AfterClass
    public void closeBrowser(){
        //close browser
        driver.quit();
    }
}
