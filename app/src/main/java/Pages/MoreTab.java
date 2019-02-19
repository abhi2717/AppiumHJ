package Pages;

import com.relevantcodes.extentreports.LogStatus;

import java.io.IOException;
import java.util.List;

import GenericLab.ActionDrivers;
import GenericLab.ApplicationHandling;
import Listerners.AppiumListeners;
import ObjectRepository.MoreObjects;
import io.appium.java_client.MobileElement;

public class MoreTab extends ActionDrivers {
    // MoreObjects more_obj = new MoreObjects();


    public static boolean moreTabData( String email, String expectedmsg) throws Exception {
       // LoginPage.loginViaOTP(email, expectedmsg);
        waitForPresenceOfElelment(MoreObjects.clickOnMore);
        click(MoreObjects.clickOnMore);
        ApplicationHandling.test.log(LogStatus.INFO, "Click on More Tab");
        waitForPresenceOfElelment(MoreObjects.waitForText);
        scroll(MoreObjects.scrollView,"Contact Us");
        ApplicationHandling.test.log(LogStatus.INFO, "Scroll till Contact US");
        ApplicationHandling.test.log(LogStatus.INFO,test.addScreenCapture(AppiumListeners.screenshot()));
        // listMySection(MoreObjects.scrollView);
       // System.out.println(listMySection(MoreObjects.scrollView));

       String[] mySectionFields = {"My Account","My Download Centre","My Previous Queries","Network Hospitals","Let's Talk Health","Refer to Friends","My Feedback","FAQs","Contact Us"};
       List<MobileElement> lst = listMySection(MoreObjects.scrollView);
       for(int i=0;i<lst.size();i++) {
            if(mySectionFields.equals(lst.get(i))){
                ApplicationHandling.test.log(LogStatus.PASS,test.addScreenCapture(AppiumListeners.screenshot()));
                //System.out.println("Screenshot taken");
                return true;
            } }
        return false;
    }
}