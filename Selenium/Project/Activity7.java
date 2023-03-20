package LiveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity7 {
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
    @Test(priority = 0)
    public void loginVerification(){
        //login credentials

        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("bigbutton")).click();

        WebElement homePage= driver.findElement(By.xpath("//a[@class='navbar-brand with-home-icon suitepicon suitepicon-action-home']"));
        //login successful verification
        if(homePage.isDisplayed()){
            Reporter.log("Login Successful");
        }
        else{
            Reporter.log("Login Unsuccessful");
        }
    }
    @Test(priority = 1)
    public void leadPhNum(){
        //navigating to Sales-->Leads
        driver.findElement(By.id("grouptab_0")).click();
        driver.findElement(By.id("moduleTab_9_Leads")).click();

        //navigation to Additional Information popup screen
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tr[@class='oddListRowS1'][1]/td[10]/span/span[@title='Additional Details']")));
        driver.findElement(By.xpath("(//span[@class='suitepicon suitepicon-action-info'])[1]")).click();

        //printing phone number in console
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='phone']")));
        String phoneNumber = driver.findElement(By.xpath("//span[@class='phone']")).getText();
        System.out.println("Lead Phone Number is "+phoneNumber);

        

    }
    @AfterClass
    public void closeBrowser(){
        //close browser

        driver.quit();
    }
}
