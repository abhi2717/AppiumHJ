package Pages;

import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import java.io.IOException;
import GenericLab.ActionDrivers;
import GenericLab.ApplicationHandling;
import Listerners.AppiumListeners;
import ObjectRepository.MyPolicyObject;

public class MyPolicyPage extends ActionDrivers {

    public static void addPolicy(String tcId,String tcName,String email,String expectedmsg,String addPolicy) throws Exception {
        //LoginPage.loginViaOTP(tcId,tcName,email,expectedmsg);
        //waitForPresenceOfElelment(MyPolicyObject.clickMyPolicy);
        click(MyPolicyObject.clickMyPolicy);
        ApplicationHandling.test.log(LogStatus.INFO,"Transition to MyPolicies Page");
        waitForPresenceOfElelment(MyPolicyObject.appTitleTxt);
        click(MyPolicyObject.clickView);
        ApplicationHandling.test.log(LogStatus.INFO,"Select MyPolicy card");
        scroll(MyPolicyObject.scrollView,"Dispatch Details");
        ApplicationHandling.test.log(LogStatus.INFO,"Scroll till 'Dispatch Details'");
        click(MyPolicyObject.clickBackBtn);
        ApplicationHandling.test.log(LogStatus.INFO,"Go Back to MyPolicies page");
        waitForPresenceOfElelment(MyPolicyObject.clickAddPolicy);
        ApplicationHandling.test.log(LogStatus.INFO,"Click on Add New Policy");
        //ApplicationHandling.test.log(LogStatus.FAIL,test.addScreenCapture(AppiumListeners.screenshot()));
        click(MyPolicyObject.clickAddPolicy);
        type(MyPolicyObject.enterPolicyNo,addPolicy);
        ApplicationHandling.test.log(LogStatus.INFO,"Add valid policy Number");
        click(MyPolicyObject.clickGoBtn);
        ApplicationHandling.test.log(LogStatus.INFO,"Click on GO button");
        waitForPresenceOfElelment(MyPolicyObject.errorMsg);
        ApplicationHandling.test.log(LogStatus.INFO,"Verify the validation message");
        ApplicationHandling.test.log(LogStatus.PASS,test.addScreenCapture(AppiumListeners.screenshot()));
        String compare = getText(MyPolicyObject.errorMsg);
        try{
           // Assert.assertEquals(expectedmsg,compare);
            if(compare.equalsIgnoreCase(expectedmsg)){
            System.out.println("Valid Error Message");
            ApplicationHandling.test.log(LogStatus.PASS,"Test Case Passed",test.addScreenCapture(AppiumListeners.screenshot())); }}
        catch (Exception e)
        { ApplicationHandling.test.log(LogStatus.FAIL,"Test Case Failed",test.addScreenCapture(AppiumListeners.screenshot())); }
    }

    public static void viewPolicyDetails()
    {

    }
}
