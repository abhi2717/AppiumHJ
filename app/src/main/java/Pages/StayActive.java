package Pages;

import com.relevantcodes.extentreports.LogStatus;

import java.io.IOException;
import GenericLab.ActionDrivers;
import GenericLab.ApplicationHandling;
import Listerners.AppiumListeners;
import ObjectRepository.MyClaimsObject;
import ObjectRepository.StayActiveObjects;


public class StayActive extends ActionDrivers {

    public static void stayActiveFlow(String tcId, String tcName, String email, String expectedmsg) throws Exception {
        //LoginPage.loginViaOTP(email, expectedmsg);
        waitForPresenceOfElelment(StayActiveObjects.stayActiveNav);
        click(StayActiveObjects.stayActiveNav);
        ApplicationHandling.test.log(LogStatus.INFO,"Click on Stay Active on navigation bar");
        waitForPresenceOfElelment(StayActiveObjects.okBtn);
        click(StayActiveObjects.okBtn);
        ApplicationHandling.test.log(LogStatus.INFO,"Click on OK button of pop up");
        waitForPresenceOfElelment(StayActiveObjects.connectWithGF);
        click(StayActiveObjects.connectWithGF);
        ApplicationHandling.test.log(LogStatus.INFO,"Click on 'Connect with GoogleFit'");
        waitForPresenceOfElelment(StayActiveObjects.chooseAnAccountTxt);
        ApplicationHandling.test.log(LogStatus.PASS,test.addScreenCapture(AppiumListeners.screenshot()));
        click(StayActiveObjects.chooseEmailAccount);
        ApplicationHandling.test.log(LogStatus.INFO,"Select an account to continue to HealthJinn");
        waitForPresenceOfElelment(StayActiveObjects.syncNowBtn);
        ApplicationHandling.test.log(LogStatus.INFO,"Connected with GoogleFit ");
        click(StayActiveObjects.stayActiveNav);
        ApplicationHandling.test.log(LogStatus.INFO,"Transition to StayActive screen");
        waitForPresenceOfElelment(StayActiveObjects.policyNumberTxt);
        scroll(StayActiveObjects.scroll,"disGrid");
        ApplicationHandling.test.log(LogStatus.INFO,"Scroll till Discount Grid");
        click(StayActiveObjects.disGrid);
        waitForPresenceOfElelment(StayActiveObjects.disGridTxt);
        click(StayActiveObjects.disGridTxt);
        System.out.println("Executed");
        ApplicationHandling.test.log(LogStatus.PASS,"Test Case Passed",test.addScreenCapture(AppiumListeners.screenshot()));
    }










}
