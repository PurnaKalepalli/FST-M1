package Activities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Activity4 {
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "realme 5");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.android.contacts");
        caps.setCapability("appActivity", ".activities.PeopleActivity");
        caps.setCapability("noReset", true);

        // Instantiate Appium Driver
        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appServer, caps);

    }

    @Test
    public void createNewContact() {

        //wait.until(ExpectedConditions.elementToBeClickable((MobileBy.id("fab"))));
        driver.findElementById("fab").click();

        //wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.widget.EditText[@text='Name']")));
        driver.findElementByXPath("//android.widget.EditText[@text='Name']").sendKeys("Aadithya Varma");
        driver.findElementByXPath("//android.widget.EditText[@text='Phone']").sendKeys("9991284782");
        driver.findElementByAccessibilityId("OK").click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("zoom_scrollview")));
        MobileElement contact = driver.findElementById("zoom_scrollview");
        Assert.assertTrue(contact.isDisplayed());

        String newContactName = driver.findElementById("custom_title").getText();
        System.out.println("New Contact Name : "+newContactName);
        Assert.assertEquals(newContactName, "Aadithya Varma");
    }

    @AfterClass
    public void quit(){
        driver.quit();
    }

}