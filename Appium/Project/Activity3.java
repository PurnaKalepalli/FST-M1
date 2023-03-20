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
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Activity3 {
    AndroidDriver<MobileElement> androidDriver;
    WebDriverWait wait;

    @BeforeClass
    public void initialize() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","realme 5");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("appPackage", "com.android.chrome");
        capabilities.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        URL appServer = new URL("http://localhost:4723/wd/hub");
        androidDriver = new AndroidDriver(appServer, capabilities);
        capabilities.setCapability("noReset", true);

    }

    @Test
    public void toDoListTest() {
        wait = new WebDriverWait(androidDriver, 5);
        androidDriver.findElementById("terms_accept").click();
        androidDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        androidDriver.findElementById("negative_button").click();
        wait = new WebDriverWait(androidDriver, 5);
        androidDriver.get("https://www.training-support.net/selenium");
        //androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //androidDriver.findElementByXPath("android.widget.Button[2][@text='OK']").click();
        wait = new WebDriverWait(androidDriver, 5);
        androidDriver.findElementByXPath("//android.widget.Button[2][@text='Get Started!']").click();
        wait = new WebDriverWait(androidDriver, 10);
        androidDriver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).scrollForward()"));
        androidDriver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector()).scrollTextIntoView(\"To-Do List\")")).click();
        wait = new WebDriverWait(androidDriver, 5);

        //Add Tasks
        MobileElement enterTask = androidDriver.findElementByXPath("//android.widget.EditText[@resource-id='taskInput']");
        enterTask.click();
        enterTask.sendKeys("Add Dependencies");
        androidDriver.findElement(MobileBy.xpath("//android.widget.Button[@text='Add Task']")).click();
        wait = new WebDriverWait(androidDriver, 5);
        enterTask.click();
        enterTask.sendKeys("Create Class");
        androidDriver.findElement(MobileBy.xpath("//android.widget.Button[@text='Add Task']")).click();
        wait = new WebDriverWait(androidDriver, 5);
        enterTask.click();
        enterTask.sendKeys("Add Main Method");
        androidDriver.findElement(MobileBy.xpath("//android.widget.Button[@text='Add Task']")).click();
        wait = new WebDriverWait(androidDriver, 5);
        //No .of tasks
        List<MobileElement> noOfListItems = androidDriver.findElementsByXPath("//android.view.View[@resource-id='tasksList']/android.view.View/android.widget.TextView");
        int noOfTasks = noOfListItems.size() - 1;
        System.out.println ("No. of Tasks : "+noOfTasks);
        //Strike out
        androidDriver.findElementByXPath("//android.widget.TextView[@text='Add Dependencies']").click();
        androidDriver.findElementByXPath("//android.widget.TextView[@text='Create Class']").click();
        androidDriver.findElementByXPath("//android.widget.TextView[@text='Add Main Method']").click();

        // Clear tasks list
        androidDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        androidDriver.findElement(MobileBy.xpath("//android.webkit.WebView/android.view.View/android.view.View/android.view.View[3]")).click();
        androidDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //Assert
        noOfListItems = androidDriver.findElementsByXPath("//android.view.View[@resource-id='tasksList']/android.view.View/android.widget.TextView");
        noOfTasks = noOfListItems.size();
        System.out.println ("Tasks after clearing list : " +noOfTasks);
        Assert.assertEquals(noOfTasks,0);

    }
    @AfterClass
    public void quit(){
        androidDriver.quit();
    }

}