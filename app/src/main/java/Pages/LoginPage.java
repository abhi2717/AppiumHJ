package Pages;

import com.relevantcodes.extentreports.LogStatus;
import com.sun.jna.platform.win32.WinNT;

import org.openqa.selenium.By;
import org.testng.Assert;

import java.io.IOException;
import java.util.Set;

import GenericLab.ActionDrivers;
import GenericLab.ApplicationHandling;
import Listerners.AppiumListeners;
import Listerners.ConfigFileReader;
import ObjectRepository.LoginObjects;
import Pages.HomePage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

public class LoginPage extends ActionDrivers {

    //LoginObjects login_obj = new LoginObjects();

    /*public LoginPage() {
        super(driver);
    }*/


    public static void otpLogin(String tcId, String tcName, String email, String expectedMsg) throws InterruptedException {
        /*expliciltyWait(LoginObjects.getStartedTxt);
        click(LoginObjects.getStartedTxt);
        Thread.sleep(2000);
        //expliciltyWait(LoginObjects.visibleTxt);
        *//*driver.switchTo().frame(0);
        driver.switchTo().frame(0);
        driver.switchTo().frame(0);
        driver.switchTo().frame(0);
        driver.switchTo().frame(0);*//*


        Set<String> contexts=driver.getContextHandles();

        for(String ct: contexts)
        {
            System.out.println("context :"+ct);
            if(ct.contains("WEBVIEW"))
            {
                System.out.println("Context name :"+ct);
                driver.context(ct);
            }
        }

        contexts=driver.getContextHandles();
        for(String ct: contexts)
        {
            if(ct.contains("WEBVIEW"))
            {
                System.out.println("Context name :"+ct);
                driver.context(ct);
            }
        }

        Thread.sleep(10000);
        click(LoginObjects.clickNextBtn);
        click(LoginObjects.typeMobileNo);
        type(LoginObjects.typeMobileNo);

        expliciltyWait(LoginObjects.resendTxt);
       try{
        readOTP();
        }catch(Exception e){
             ApplicationHandling.test.log(LogStatus.FAIL,test.addScreenCapture(AppiumListeners.screenshot())); }
*/
     /*   expliciltyWait(LoginObjects.clickCancelBtn);
        click(LoginObjects.clickCancelBtn);
        expliciltyWait(LoginObjects.clickContinueBtn);
        type(LoginObjects.enterMobileNumber);
        click(LoginObjects.clickContinueBtn);
        expliciltyWait(LoginObjects.submitBtn);

        expliciltyWait(LoginObjects.clickSignIn);
        click(LoginObjects.clickSignIn);
        expliciltyWait(LoginObjects.clickForgot);
        click(LoginObjects.clickForgot);
        expliciltyWait(LoginObjects.clickContinue);
        click(LoginObjects.clickContinue);
        expliciltyWait(LoginObjects.waitForNotification);

        String OTP = readOTP();
        System.out.println(OTP);
        System.out.println("Read OTP Successfully");
        driver.pressKeyCode(AndroidKeyCode.BACK);
        expliciltyWait(LoginObjects.resetText);
        click(LoginObjects.clickShowTxt);*/
    }

 /*   public static void invalidLogin(String tcId, String tcName, String email, String expectedMsg) throws IOException {
        expliciltyWait(LoginObjects.waitForEmailTxt);
        click(LoginObjects.loginViaOtpLnk);
        ApplicationHandling.test.log(LogStatus.INFO,"Click on Login via OTP button");
        type(LoginObjects.emailTxt, email);
        ApplicationHandling.test.log(LogStatus.INFO,"Enter an email");
        click(LoginObjects.sendOtpLink);
        ApplicationHandling.test.log(LogStatus.INFO,"Click on Send OTP button");

        String compare = getText(LoginObjects.errorTxt);
        try {
            Assert.assertEquals(expectedMsg,compare);
            System.out.println("Invalid Details");
            ApplicationHandling.test.log(LogStatus.PASS,"Test Case Passed",test.addScreenCapture(AppiumListeners.screenshot()));
        }catch (Exception e)
        {
            ApplicationHandling.test.log(LogStatus.FAIL,test.addScreenCapture(AppiumListeners.screenshot()));
        }
    }*/


    public static void loginViaOTP(String email, String expectedmsg) throws Exception {
       // expliciltyWait(LoginObjects.waitForEmailTxt);
        click(LoginObjects.loginViaOtpLnk);
        ApplicationHandling.test.log(LogStatus.INFO, "Click on Login via OTP button");
       // expliciltyWait(LoginObjects.emailTxt);
        type(LoginObjects.emailTxt, email);
        ApplicationHandling.test.log(LogStatus.INFO, "Enter an email");
        click(LoginObjects.sendOtpLink);
        ApplicationHandling.test.log(LogStatus.INFO, "Click on Send OTP button");
        //expliciltyWait(LoginObjects.visibleOtpTxt);
        allowAppPermission();
        if (expectedmsg.contains("redirection to OTP Page"))
            waitForPresenceOfElelment(LoginObjects.visibleOtpTxt);
        ApplicationHandling.test.log(LogStatus.INFO, "Visibilty of OTP text");
        click(LoginObjects.otpText1);
        type(LoginObjects.otpText1, "1");
        type(LoginObjects.otpText2, "2");
        type(LoginObjects.otpText3, "3");
        type(LoginObjects.otpText4, "4");
        Thread.sleep(5000);
        try {
            if (verifyElementToBeLocated(LoginObjects.clickOkBtn)) {
        //        expliciltyWait(LoginObjects.clickOkBtn);
                click(LoginObjects.clickOkBtn);
                ApplicationHandling.test.log(LogStatus.INFO, "Click on 'OK' button");
            }
        } catch (Exception e) {
            System.out.println("Proceed further");
            ApplicationHandling.test.log(LogStatus.INFO, "Might be using same device to login so procced Further to dashboard screen");
        }
        Thread.sleep(5000);
        try{
            if (verifyElementToBeLocated(LoginObjects.healthJinnTxt)) {
                waitForPresenceOfElelment(LoginObjects.acceptBtn);
                click(LoginObjects.acceptBtn);
                ApplicationHandling.test.log(LogStatus.INFO, "Accept the updated Terms & conditions/Privacy Policy");
                //expliciltyWait(LoginObjects.waitForMoreTab);
            }}catch(Exception e){
            System.out.println("Proceed further");
            ApplicationHandling.test.log(LogStatus.INFO, "No update has been found; so proceed further to dashboard");}

         try{
            waitForPresenceOfElelment(LoginObjects.connectWithGF);
            verifyFunction(LoginObjects.connectWithGF);
            ApplicationHandling.test.log(LogStatus.PASS,test.addScreenCapture(AppiumListeners.screenshot()));}
         catch(Exception e) {
            throw new Exception("Login Via OTP Failed"); }
          }
    }


    /*public static void loginViaPwd(){
        expliciltyWait(LoginObjects.waitForEmailTxt);
        //Thread.sleep(5000);
        type(LoginObjects.enterEmail,"ax@gmail.com");
        ApplicationHandling.test.log(LogStatus.INFO,"Enter email id");
        type(LoginObjects.enterpassword,"12345600");
        ApplicationHandling.test.log(LogStatus.INFO,"Enter Password");
        click(LoginObjects.clickLoginBtn);
        ApplicationHandling.test.log(LogStatus.INFO,"Click on Login Button");
    }

    public void accLockedLoginLogout(){
        String str1 = "Incorrect Password. Kindly use correct one or use 'forgot Password' link to reset.";
        int count=0;
        do {
            loginViaPwd();
            String str2= getText(LoginObjects.verbiageIncorrectPwd);
                if(str1.equalsIgnoreCase(str2)) {
                    click(LoginObjects.clickOkBtn);
                    ApplicationHandling.test.log(LogStatus.INFO,"Click on 'OK' button of pop-up");
                    clearTextboxField(LoginObjects.enterEmail);
                    ApplicationHandling.test.log(LogStatus.INFO,"Clear TextBox field");
                }
                else{
                    click(LoginObjects.clickOtpLogin);
                    ApplicationHandling.test.log(LogStatus.INFO,"Click on Login via OTP button");
                    click(LoginObjects.sendOtpLink);

                    allowAppPermission();
                    type(LoginObjects.otpText1,"1");
                    type(LoginObjects.otpText2,"2");
                    type(LoginObjects.otpText3,"3");
                    type(LoginObjects.otpText4,"4");
                    //        action_obj.click(login_obj.clickOkBtn);
                    expliciltyWait(LoginObjects.waitForMoreTab);
                    HomePage.Dashboard();
                    click(LoginObjects.clickMyAccount);
                    ApplicationHandling.test.log(LogStatus.INFO,"Click on My Account");
                    expliciltyWait(LoginObjects.waitMyAccount);
                    click(LoginObjects.clickLogOut);
                    ApplicationHandling.test.log(LogStatus.INFO,"Click on Logout");
                    visibilityOfElement(LoginObjects.visibleMsg);
                    ApplicationHandling.test.log(LogStatus.INFO,"Visible message on pop up");
                    click(LoginObjects.clickOkBtn);
                    ApplicationHandling.test.log(LogStatus.INFO,"Click on 'OK' button");
                    break;}
                    count++;
            }
        while(count<5);
    }
*/



