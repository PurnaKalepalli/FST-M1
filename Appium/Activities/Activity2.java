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

public class Activity2 {

    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "realme 5");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.android.chrome");
        caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        caps.setCapability("noReset", true);

        // Instantiate Appium Driver
        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appServer, caps);

    }
    @Test
    public void openBrowser(){
        driver.get("https://www.training-support.net/");
        String pageTitle = driver.findElementByXPath("//android.widget.TextView[@text='Training Support']").getText();
        System.out.println("Heading: " + pageTitle);

        driver.findElementByXPath("//android.view.View[@content-desc='About Us']").click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String aboutUsPageTitle = driver.findElementByXPath("//android.widget.TextView[@text='About Us']").getText();
        System.out.println("Title on new page: " + aboutUsPageTitle);

        // Assertions
        Assert.assertEquals(pageTitle, "Training Support");
        Assert.assertEquals(aboutUsPageTitle, "About Us");


    }
    @AfterClass
    public void quit(){
        driver.quit();
    }
}