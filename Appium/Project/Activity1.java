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
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Activity1 {
    AndroidDriver<MobileElement> androidDriver;
    WebDriverWait wait;

    @BeforeClass
    public void initialize() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","realme 5");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("appPackage", "com.google.android.apps.tasks");
        capabilities.setCapability("appActivity", ".ui.TaskListsActivity");
        URL appServer = new URL("http://localhost:4723/wd/hub");
        androidDriver = new AndroidDriver(appServer, capabilities);
        capabilities.setCapability("noReset", true);

    }
    @Test
    public void createActivities(){
        androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        androidDriver.findElement(MobileBy.id("welcome_get_started")).click();

        androidDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        androidDriver.findElementByAccessibilityId("Create new task").click();
        //androidDriver.findElementById("add_task_title").click();
        androidDriver.findElementById("add_task_title").sendKeys("Complete Activity with Google Tasks");
        androidDriver.findElementById("add_task_done").click();
        wait = new WebDriverWait(androidDriver, 5);
        String task1 = androidDriver.findElementByXPath("//android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView").getText();
        wait = new WebDriverWait(androidDriver, 3);
        Assert.assertEquals(task1,"Complete Activity with Google Tasks");
        wait = new WebDriverWait(androidDriver, 5);

        androidDriver.findElementByAccessibilityId("Create new task").click();
        androidDriver.findElementById("add_task_title").sendKeys("Complete Activity with Google Keep");
        androidDriver.findElementById("add_task_done").click();
        wait = new WebDriverWait(androidDriver, 5);
        String task2 = androidDriver.findElementByXPath("//android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView").getText();
        wait = new WebDriverWait(androidDriver, 3);
        Assert.assertEquals(task2,"Complete Activity with Google Keep");
        wait = new WebDriverWait(androidDriver, 5);

        androidDriver.findElementByAccessibilityId("Create new task").click();
        androidDriver.findElementById("add_task_title").sendKeys("Complete the second Activity Google Keep");
        androidDriver.findElementById("add_task_done").click();
        wait = new WebDriverWait(androidDriver, 5);
        String task3 = androidDriver.findElementByXPath("//android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView").getText();
        wait = new WebDriverWait(androidDriver, 3);
        Assert.assertEquals(task3,"Complete the second Activity Google Keep");
        wait = new WebDriverWait(androidDriver, 5);
    }

    @AfterClass
    public void quit(){
        androidDriver.quit();
    }

}