package LiveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity8 {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void openBrowser() {
        //driver initialise
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.manage().window().maximize();
        //open Firefox browser
        driver.get("http://alchemy.hguy.co/crm");
    }

    @Test(priority = 0)
    public void loginVerification() {
        //login credentials

        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("bigbutton")).click();

        WebElement homePage = driver.findElement(By.xpath("//a[@class='navbar-brand with-home-icon suitepicon suitepicon-action-home']"));
        //login successful verification
        if (homePage.isDisplayed()) {
            Reporter.log("Login Successful");
        } else {
            Reporter.log("Login Unsuccessful");
        }
    }

    @Test(priority = 1)
    public void firstFiveOddRows() {
        //Navigate to Sales--> Accounts
        driver.findElement(By.id("grouptab_0")).click();
        driver.findElement(By.id("moduleTab_9_Accounts")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//table[@class='list view table-responsive']/tbody")));

        for (int i = 1; i <= 10; i++) {
            //Printing first 5 Names of oddrows
            String oddRowName = driver.findElement(By.xpath("//table[@class='list view table-responsive']/tbody/tr["+i+"]/td[3]/b/a")).getText();
            System.out.println("Row Num: "+i+"->"+oddRowName);
            i++;
        }



    }

    @AfterClass
    public void closeBrowser() {
        //close browser

        driver.quit();
    }
}
