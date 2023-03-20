package LiveProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity1 {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void openBrowser(){
        //driver initialise
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.manage().window().maximize();
        //open Firefox browser
        driver.get("http://alchemy.hguy.co/crm");
    }
    @Test
    public void getTitle(){
        String pageTitle = driver.getTitle();
        //page title verification
        if(pageTitle.equals("SuiteCRM")){
            Reporter.log("Page Title is matched:: Expected:SuiteCRM and Actual:"+ pageTitle);
            //close browser
            driver.quit();
        }
    }
}
