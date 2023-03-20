package LiveProject;
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

public class Activity2 {
    AndroidDriver<MobileElement> androidDriver;
    WebDriverWait wait;

    @BeforeClass
    public void initialize() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","realme 5");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("appPackage", "com.google.android.keep");
        capabilities.setCapability("appActivity", ".activities.BrowseActivity");
        URL appServer = new URL("http://localhost:4723/wd/hub");
        androidDriver = new AndroidDriver(appServer, capabilities);
        capabilities.setCapability("noReset", true);

    }

    @Test
    public void createNotes(){
        androidDriver.findElement(MobileBy.id("skip_welcome")).click();
        wait = new WebDriverWait(androidDriver, 5);
        androidDriver.findElement(MobileBy.xpath("//android.widget.Button[@content-desc=\"Dismiss button\"]")).click();

        wait = new WebDriverWait(androidDriver, 5);
        androidDriver.findElementByAccessibilityId("New text note").click();

        androidDriver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        androidDriver.findElementById("editable_title").click();
        wait = new WebDriverWait(androidDriver, 5);
        androidDriver.findElementById("editable_title").sendKeys("Today's Activities");

        androidDriver.findElementById("edit_note_text").sendKeys("To connect VDI by 11 o clock");
        androidDriver.findElementById("edit_note_text").click();

        androidDriver.findElement(MobileBy.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]")).click();
        androidDriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        String noteTitle = androidDriver.findElement(MobileBy.id("index_note_title")).getText();
        String notesDescription = androidDriver.findElement(MobileBy.id("index_note_text_description")).getText();

        System.out.println("Note Title : " +noteTitle);
        System.out.println("Note Description : " +notesDescription);

        Assert.assertEquals(noteTitle,"Today's Activities");
        Assert.assertEquals(notesDescription,"To connect VDI by 11 o clock");
    }


    @AfterClass
    public void quit(){
        androidDriver.quit();
    }
}