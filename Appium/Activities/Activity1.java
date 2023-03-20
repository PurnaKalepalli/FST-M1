package Activities;

import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity1 {
    AndroidDriver<MobileElement> driver =null;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("realme 5");
        options.setPlatformName("adroid");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.coloros.calculator");
        options.setAppActivity("com.android.calculator2.Calculator");
        options.noReset();

        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appServer,caps);

    }

    @Test
    public void add() {

        driver.findElementById("digit_4").click();
        driver.findElementByAccessibilityId("multiply").click();
        driver.findElementById("digit_5").click();
        driver.findElementById("eq").click();

        String result = driver.findElementById("result").getText();
        System.out.println(result);
        AssertJUnit.assertEquals(result, "20");
    }

    @AfterClass

    public void tearDown() {
        driver.quit();
    }

}