/*
package com.example.abchauhan.appiumhj;

import android.drm.DrmStore;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ContactUs {

    public static AndroidDriver<AndroidElement> driver;

    public ContactUs() {
        super(driver);
    }


    //Dimension size;

    @BeforeClass
    public static void setUp() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Xiaomi Redmi Note 4 Android 7.0, API 23");
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "4000");
        cap.setCapability("noReset", true);
        cap.setCapability(CapabilityType.VERSION, "7.0 NRD90M");
        cap.setCapability("automationName", "uiautomator2");
        cap.setCapability("appPackage", "com.amhi.healthjinn");
        cap.setCapability("appActivity", "com.amhi.healthjinn.MainActivity");
        cap.setCapability("automationName", "uiautomator2");
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");

        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void scrollSample() throws Exception {
        Thread.sleep(10000);
        click(ObjectRepo.loginViaOtpLnk);
        type(ObjectRepo.emailTxt,"vishal@gmail.com");
        click(ObjectRepo.sendOtpLink);
        Thread.sleep(5000);
        allowAppPermission();
        Thread.sleep(3000);
        driver.findElement(By.id("text_1")).sendKeys("1");
        driver.findElement(By.id("text_2")).sendKeys("2");
        driver.findElement(By.id("text_3")).sendKeys("3");
        driver.findElement(By.id("text_4")).sendKeys("4");
        Thread.sleep(5000);
        click(ObjectRepo.clickOnMoreTab);
        //System.out.println("More section is opened");
        scroll(ObjectRepo.scrollOnMoreTab,"Contact Us");
        expliciltyWait(ObjectRepo.waitvisibilityofMyAccount);
        click(ObjectRepo.clickOnContactUs);
        //System.out.println("Contatct Us Page");
        expliciltyWait(ObjectRepo.waitOnContactUs);
        click(ObjectRepo.clickOnDropdown1);
        Thread.sleep(3000);
        dropDown(ObjectRepo.selectDropDownValues,"Request");
        System.out.println("DONE");
        click(ObjectRepo.clickOnDropDown2);
        dropDown(ObjectRepo.selectDropDownValues,"HealthJinn");
        Thread.sleep(3000);

        Thread.sleep(2000);
        //click(ObjectRepo.writeOnTextArea);
        //type(ObjectRepo.writeOnTextArea,"Testing");
        //Thread.sleep(3000);
        //scroll(ObjectRepo.scrollOnContactUs,"SEND");
        //expliciltyWait(ObjectRepo.waitToSendButton);
        click(ObjectRepo.clickOnSendButton);
        Thread.sleep(3000);
        //expliciltyWait(ObjectRepo.waitTillPopUpMsg);
        click(ObjectRepo.clickOnProceedButton);
        click(ObjectRepo.clickOnOkBtn);
        Thread.sleep(3000);

    }

    @After
    public  void tearDown() {
        driver.closeApp();
    }
  }


*/
