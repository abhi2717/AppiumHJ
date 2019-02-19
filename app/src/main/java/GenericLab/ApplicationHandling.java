package GenericLab;

import android.opengl.Visibility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.By;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import Listerners.ConfigFileReader;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

import static GenericLab.ActionDrivers.waitForPresenceOfElelment;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class ApplicationHandling {

    public static AndroidDriver driver;
    public static ExtentTest test;
    public static ExtentReports extent;
    //public static boolean waitForPresenceOfElelment;
    public static ConfigFileReader cfg;

    public  ApplicationHandling()
    {
        cfg = new ConfigFileReader();
        System.out.println("Inside application handling constructor");
        Date date=new Date();
        SimpleDateFormat dateFormatFolder = new SimpleDateFormat("dd_MMM_yyyy");
        File ResultDir = new File(System.getProperty("user.dir")+File.separator+"/FrameworkReports/"+dateFormatFolder.format(date));
        System.out.println(ResultDir);
        // Defining Directory/Folder Name
        if (!ResultDir.exists()){  // Checks that Directory/Folder Doesn't Exists!
            ResultDir.mkdir();
        }
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd_MMM_yyyy_hh_mm_ssaa");
        extent=new ExtentReports(ResultDir +"/" +"Report"+""+dateFormat.format(date)+".html",false);
    }

    public static RemoteWebDriver getInstance()
    {
        System.out.println("remote webdriver");
        return driver;
    }

    @BeforeClass
    public static void setUp() throws MalformedURLException, InterruptedException {
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("platformName", "Android");
        //cap.setCapability("deviceName", "Xiaomi Redmi Note 4 Android 7.0, API 23");
        cap.setCapability("deviceName", "Redmi");
        cap.setCapability("noReset", true);
        cap.setCapability(CapabilityType.VERSION, "7.0.0");
        cap.setCapability("automationName", cfg.getAutomationName());
        //cap.setCapability("app","C:\\Users\\ab.chauhan\\Downloads\\HJ.apk");
        cap.setCapability ("appPackage", cfg.getAppPackage());
        cap.setCapability ("appActivity", cfg.getAppActivity());

        System.out.println("Before Suite Execution started");
        System.out.println("Driver:"+driver);
        System.out.println("URL:"+cfg.getApplicationUrl());
        System.out.println("cap: "+cap);
        driver = new AndroidDriver<MobileElement>(new URL(cfg.getApplicationUrl()), cap);
        System.out.println(driver);

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        /*driver.startActivity("com.android.browser","com.android.browser.BrowserActivity");
        driver.get("http://www.gmail.com");
        driver.wait(5000);*/
     /*  int count=3;
       By str = By.id("com.amhi.healthjinn:id/btnNext");
       if(!visibilityOfElement(str))2
           System.out.println("Proceed...");
       else{
           for(int i=0;i<count;i++) {
               driver.findElement(By.id("com.amhi.healthjinn:id/btnNext")).click();
           } }*/
    }
}
