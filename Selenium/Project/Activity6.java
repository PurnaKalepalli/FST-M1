package LiveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity6 {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void openBrowser(){
        //driver initialization
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.manage().window().maximize();
        //open Firefox browser
        driver.get("http://alchemy.hguy.co/crm");
    }
    @Test(priority = 0)
    public void loginVerification(){
        //login credentials
        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("bigbutton")).click();

        WebElement homePage= driver.findElement(By.xpath("//a[@class='navbar-brand with-home-icon suitepicon suitepicon-action-home']"));
        ////login successful verification
        if(homePage.isDisplayed()){
            Reporter.log("Login Successful");
        }
        else{
            Reporter.log("Login Unsuccessful");
        }
    }
    @Test(priority = 1)
    public void activitiesMenuTab(){
        //activities menu tab verification

        String activitiesMenuTab = driver.findElement(By.id("grouptab_3")).getText();
        Assert.assertEquals(activitiesMenuTab,"ACTIVITIES");
        Reporter.log("Activities Menu Tab Exists");

    }
    @AfterClass
    public void closeBrowser(){
        //close browser
        driver.quit();
    }
}
