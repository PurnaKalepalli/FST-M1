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
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Activity6 {
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
    public void scrollUi(){
        driver.get("https://www.training-support.net/selenium/lazy-loading");


        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MobileElement pageTitle = driver.findElementByXPath("//android.view.View/android.widget.TextView[2]");
        //wait.until(ExpectedConditions.textToBePresentInElement(pageTitle, "Lazy Loading"));
        System.out.println ("The Page title is : "+pageTitle.getText());

        // images count before scrolling
        List<MobileElement> noOfImages = driver.findElementsByXPath("//android.view.View/android.view.View/android.widget.Image");
        System.out.println("Images currently displayed before scrolling : " + noOfImages.size());
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector()).scrollTextIntoView(\"helen\")"));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        // images count after scrolling
        noOfImages = driver.findElementsByXPath("//android.view.View/android.view.View/android.widget.Image");
        System.out.println("Image currently displayedafter scrolling : " + noOfImages.size());

        // Assertion after scrolling
        Assert.assertEquals(noOfImages.size(), 4);
    }

    @AfterClass
    public void quit(){
        driver.quit();
    }
}