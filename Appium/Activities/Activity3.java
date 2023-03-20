package Activities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Activity3 {
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "realme 5");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.miui.calculator");
        caps.setCapability("appActivity", ".cal.CalculatorActivity");
        caps.setCapability("noReset", true);

        // Instantiate Appium Driver
        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appServer, caps);

    }

    @Test (priority=1)
    public void addition(){
        //Calculate 5 + 9 and print the result to the console.
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.findElementById("btn_5_s").click();
        driver.findElementByAccessibilityId("plus").click();
        driver.findElementById("btn_9_s").click();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElementByAccessibilityId("equals").click();
        String resultValue1 = driver.findElement(MobileBy.id("result")).getText().replace("= ","");
        System.out.println("5 + 9 = "+resultValue1);
        Assert.assertEquals(resultValue1, "14");
    }
    @Test (priority=2)
    public void subtraction(){
        driver.findElementById("btn_c_s").click();
        //Calculate 10 - 5 and print the result to the console
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.findElementById("btn_1_s").click();
        driver.findElementById("btn_0_s").click();
        driver.findElementByAccessibilityId("minus").click();
        driver.findElementById("btn_5_s").click();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElementByAccessibilityId("equals").click();
        String resultValue2 = driver.findElement(MobileBy.id("result")).getText().replace("= ","");
        System.out.println("10 - 5 = "+resultValue2);
        Assert.assertEquals(resultValue2, "5");
    }

    @Test (priority=3)
    public void multiplication(){
        driver.findElementById("btn_c_s").click();
        //Calculate 5 * 100 and print the result to the console
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.findElementById("btn_5_s").click();
        driver.findElementByAccessibilityId("multiply").click();
        driver.findElementById("btn_1_s").click();
        driver.findElementById("btn_0_s").click();
        driver.findElementById("btn_0_s").click();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElementByAccessibilityId("equals").click();
        String resultValue3 = driver.findElement(MobileBy.id("result")).getText().replace("= ","");
        System.out.println("5 * 100 = "+resultValue3);
        //Assert.assertEquals(resultValue3, "50");
        Assert.assertEquals(resultValue3, "500");
    }

    @Test (priority=4)
    public void division(){
        driver.findElementById("btn_c_s").click();
        //Calculate 50 / 2 and print the result to the console
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.findElementById("btn_5_s").click();
        driver.findElementById("btn_0_s").click();
        driver.findElementByAccessibilityId("divide").click();
        driver.findElementById("btn_2_s").click();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElementByAccessibilityId("equals").click();
        String resultValue4 = driver.findElement(MobileBy.id("result")).getText().replace("= ","");
        System.out.println("50 / 2 = "+resultValue4);
        Assert.assertEquals(resultValue4, "25");
    }


    @AfterClass
    public void quit(){
        driver.quit();
    }
}