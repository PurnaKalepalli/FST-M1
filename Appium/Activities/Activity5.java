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

public class Activity5 {
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "realme 5");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.android.mms");
        caps.setCapability("appActivity", ".ui.MmsTabActivity");
        caps.setCapability("noReset", true);

        // Instantiate Appium Driver
        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appServer, caps);

    }
    @Test
    public void sendMessage() {
        driver.findElementByAccessibilityId("Compose").click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(MobileBy.AndroidUIAutomator("resourceId(\"com.android.mms:id/recipients_viewer\")")).click();
        driver.findElement(MobileBy.AndroidUIAutomator("resourceId(\"com.android.mms:id/recipients_editor\")")).sendKeys("9940284450");
        /*driver.findElementById("recipients_viewer").click();
        driver.findElementById("recipients_editor").sendKeys("9940284450");*/
        driver.findElement(MobileBy.AndroidUIAutomator("resourceId(\"com.android.mms:id/embedded_text_editor\")")).sendKeys("Hello from Appium");
        driver.findElement(MobileBy.AndroidUIAutomator("resourceId(\"com.android.mms:id/send_slot_id\")")).click();
        driver.findElement(MobileBy.AndroidUIAutomator("resourceId(\"com.android.mms:id/sim_button1\")")).click();
        driver.findElement(MobileBy.AndroidUIAutomator("description(\"Send message\")")).click();


        String sentMessage = "resourceId(\"com.android.mms:id/message_body\")";
        //wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AndroidUIAutomator(sentMessage)));

        // Assertion
        String sentMessageText = driver.findElement(MobileBy.AndroidUIAutomator(sentMessage)).getText();
        System.out.println("Sent Message is "+sentMessageText);
        Assert.assertEquals(sentMessageText, "Hello from Appium");
    }

    @AfterClass
    public void quit(){
        driver.quit();
    }
}