package Pages;

import android.os.Build;
import android.support.annotation.RequiresApi;

import com.relevantcodes.extentreports.LogStatus;

import org.openqa.selenium.By;

import GenericLab.ActionDrivers;
import GenericLab.ApplicationHandling;
import Listerners.AppiumListeners;
import ObjectRepository.MyClaimsObject;
import Tests.MyClaimsTest;
import io.appium.java_client.TouchAction;

import java.io.IOException;
import java.util.List;

import static java.time.Duration.ofSeconds;

public class MyClaimsPage extends ActionDrivers {

    public static void myClaims(String tcId, String tcName, String email, String expectedmsg, String estAmount) throws Exception {
           // LoginPage.loginViaOTP(email, expectedmsg);
            waitForPresenceOfElelment(MyClaimsObject.clickMyClaims);
            click(MyClaimsObject.clickMyClaims);
            ApplicationHandling.test.log(LogStatus.INFO, "Click on My Claims from the navigation bar");
            //waitForPresenceOfElelment(MyClaimsObject.clickView);
            waitForPresenceOfElelment(MyClaimsObject.lastSynTxt);
            ApplicationHandling.test.log(LogStatus.INFO, "Transition to My Claims");

        /*    click(MyClaimsObject.clickSelectDropDown);
            waitForPresenceOfElelment(MyClaimsObject.clickPolicyNo);
            clickFromList(MyClaimsObject.scrollToBtn,1);
            Thread.sleep(10000);
*/
            scroll(MyClaimsObject.scrollToBtn, "NEW CLAIM");
            ApplicationHandling.test.log(LogStatus.INFO, "Scroll till New Claim button");
            click(MyClaimsObject.clickNewClaimBtn);
            waitForPresenceOfElelment(MyClaimsObject.clickFileNewClaim);
            ApplicationHandling.test.log(LogStatus.INFO, "Click on New Claim Button");
            click(MyClaimsObject.clickFileNewClaim);
            ApplicationHandling.test.log(LogStatus.INFO, "Transition to select New Claim and select File a new Claim");
            waitForPresenceOfElelment(MyClaimsObject.selectDropDown);
            ApplicationHandling.test.log(LogStatus.INFO, "Transition to New Claim Page");
            click(MyClaimsObject.selectDropDown);
            ApplicationHandling.test.log(LogStatus.INFO, "Select Patient from the dropdown");
            waitForPresenceOfElelment(MyClaimsObject.selectDropDownValue);
            clickFromList(MyClaimsObject.selectDropDownValue,1);
            //click(MyClaimsObject.selectDropDownValue);
            clickFromList(MyClaimsObject.scrollToBtn,1);
            scroll(MyClaimsObject.scrollToBtn, "SAVE AND PROCEED");
            type(MyClaimsObject.clickClaimAmount, estAmount);
            ApplicationHandling.test.log(LogStatus.INFO, "Enter Estimated Claim Amount");
            int EstAmount= Integer.parseInt(getText(MyClaimsObject.clickClaimAmount).split("\\s")[0]);
            System.out.println("Estimated Amount:" + EstAmount);

            click(MyClaimsObject.clickSaveBtn);
            ApplicationHandling.test.log(LogStatus.INFO, "Click on 'SAVE AND PROCEED' button");
            waitForPresenceOfElelment(MyClaimsObject.appTitle);
            String category=getText(MyClaimsObject.clickDayCareCategory);
            System.out.println("Claim Category: " + category);
            ApplicationHandling.test.log(LogStatus.INFO, "Transition to Choose Category");

           /* // For Health Check-Up
            click(MyClaimsObject.clickHealthCheckup);
            expliciltyWait(MyClaimsObject.clickSelectDate);
            click(MyClaimsObject.clickSelectDate);
            expliciltyWait(MyClaimsObject.clickOkBtn1);
            click(MyClaimsObject.clickOkBtn1);
            expliciltyWait(MyClaimsObject.clickNxtBtn);
            click(MyClaimsObject.clickNxtBtn);
            expliciltyWait(MyClaimsObject.clickOkBtn2);
            click(MyClaimsObject.clickOkBtn2);*/

           // Thread.sleep(3000);
     //       expliciltyWait(MyClaimsObject.clickUploadBtn1);

            click(MyClaimsObject.clickDayCare);
            waitForPresenceOfElelment(MyClaimsObject.hospitalName);
            ApplicationHandling.test.log(LogStatus.INFO, "Transition to Hospital Details Page");
            click(MyClaimsObject.hospitalName);
            type(MyClaimsObject.hospitalName,"F");
            Thread.sleep(5000);
            type(MyClaimsObject.hospitalName,"A");
            Thread.sleep(5000);
            type(MyClaimsObject.hospitalName,"R");
            Thread.sleep(5000);
           // clickFromList(MyClaimsObject.scrollView,3);
            click(MyClaimsObject.hospitalNameTxt);
            waitForPresenceOfElelment(MyClaimsObject.districtField);
            scroll(MyClaimsObject.scrollView,"NEXT");
            waitForPresenceOfElelment(MyClaimsObject.startDate);
            click(MyClaimsObject.startDate);
            waitForPresenceOfElelment(MyClaimsObject.okBtnOnCalendar);
            click(MyClaimsObject.okBtnOnCalendar);
            waitForPresenceOfElelment(MyClaimsObject.endDate);
            click(MyClaimsObject.endDate);
            waitForPresenceOfElelment(MyClaimsObject.okBtnOnCalendar);
            click(MyClaimsObject.okBtnOnCalendar);
            waitForPresenceOfElelment(MyClaimsObject.accidentTxt);
            click(MyClaimsObject.accidentTxt);
            waitForPresenceOfElelment(MyClaimsObject.clickNxtBtn);
            click(MyClaimsObject.clickNxtBtn);
            ApplicationHandling.test.log(LogStatus.INFO, "Click on'NEXT' button");
            Thread.sleep(5000);

            try{
                if(verifyElementToBeLocated(MyClaimsObject.continueBtn)== true)
                   // expliciltyWait(MyClaimsObject.popUpTxt);
                   // System.out.println(MyClaimsObject.continueBtn);
                    Thread.sleep(3000);
                    click(MyClaimsObject.continueBtn);
                    ApplicationHandling.test.log(LogStatus.INFO, "Pop up is shown if already have claim(Awaiting)in this date range");}
                catch(Exception e){
                       System.out.println("***Upload Document screen***");
                       e.printStackTrace();
                       ApplicationHandling.test.log(LogStatus.INFO, "Transition to Upload Documents Screen ");}

            waitForPresenceOfElelment(MyClaimsObject.clickOkBtn2);
            click(MyClaimsObject.clickOkBtn2);
            waitForPresenceOfElelment(MyClaimsObject.clickUploadBtn1);
            clickFromList(MyClaimsObject.clickUploadBtn1,0);
            allowAppPermission();
            uploadFromCamera();
            clickFromList(MyClaimsObject.clickUploadBtn1,1);
            uploadFromCamera();
            clickFromList(MyClaimsObject.clickUploadBtn1,2);
            uploadFromCamera();
            clickFromList(MyClaimsObject.clickUploadBtn1,3);
            uploadFromCamera();
            scroll(MyClaimsObject.scrollToBtn,"SUBMIT");
            waitForPresenceOfElelment(MyClaimsObject.clickSubmitBtn);
            try{
            if(verifyElementToBeLocated(MyClaimsObject.popUpPendingDoc)){
                    System.out.println(MyClaimsObject.popUpPendingDoc);
                    click(MyClaimsObject.clickOKPendingDocPopUp);
                    waitForPresenceOfElelment(MyClaimsObject.updloadDocStatus);
                    System.out.println("All documents are not uploaded yet or missed some fields for uploading the documents"); }
            }
            catch(Exception e){
            e.printStackTrace();
            ApplicationHandling.test.log(LogStatus.INFO, "After uploading the mandatory documents, click on 'SUBMIT' button ");

            click(MyClaimsObject.clickSubmitBtn);}
            waitForPresenceOfElelment(MyClaimsObject.thankYouTxt);
            click(MyClaimsObject.clickSubmitBtn);
            ApplicationHandling.test.log(LogStatus.INFO, "Thank You! page is shown after submission of the claim");
            ApplicationHandling.test.log(LogStatus.PASS,test.addScreenCapture(AppiumListeners.screenshot()));
            waitForPresenceOfElelment(MyClaimsObject.txtOnFeedback);

            click(MyClaimsObject.clickYes);
            click(MyClaimsObject.clickSubmit);
            waitForPresenceOfElelment(MyClaimsObject.txtFeebback);
            click(MyClaimsObject.feedbackTitle);

            waitForPresenceOfElelment(MyClaimsObject.lastSynTxt);
            System.out.println("on claims dashboard");
            ApplicationHandling.test.log(LogStatus.INFO, "Transition to Claim Dashboard");
            Thread.sleep(10000);
            clickFromList(MyClaimsObject.clickView,0);
            System.out.println("Click first claim from the list");
            ApplicationHandling.test.log(LogStatus.INFO, "Open the submitted claim from the list");
            waitForPresenceOfElelment(MyClaimsObject.claimCategory);

            String claimCategory = getText(MyClaimsObject.claimCategory);
            System.out.println(claimCategory);
            int claimAmount=0;
            try{
            claimAmount= Integer.parseInt(getText(MyClaimsObject.estClaimAmount).split( "\\s")[1]);
            System.out.println(claimAmount);
            }
            catch(NumberFormatException ex ){
                    System.out.println("Exception occur");
            }

            if(claimAmount==EstAmount){
                System.out.println("Details are Verified Successfully");
                ApplicationHandling.test.log(LogStatus.PASS,"Test Case Passed",test.addScreenCapture(AppiumListeners.screenshot())); }
            else{
                System.out.println("Details are not Matched ");
                ApplicationHandling.test.log(LogStatus.FAIL,"Test Case Failed",test.addScreenCapture(AppiumListeners.screenshot()));}
    }

        public static void myClaimsHospitalization(String tcId, String tcName, String email, String expectedmsg, String estAmount) throws Exception {
                waitForPresenceOfElelment(MyClaimsObject.clickMyClaims);
                click(MyClaimsObject.clickMyClaims);
                ApplicationHandling.test.log(LogStatus.INFO, "Click on My Claims from the navigation bar");
                waitForPresenceOfElelment(MyClaimsObject.lastSynTxt);
                ApplicationHandling.test.log(LogStatus.INFO, "Transition to My Claims");
                scroll(MyClaimsObject.scrollToBtn, "NEW CLAIM");
                ApplicationHandling.test.log(LogStatus.INFO, "Scroll till New Claim button");
                click(MyClaimsObject.clickNewClaimBtn);
                waitForPresenceOfElelment(MyClaimsObject.clickFileNewClaim);
                ApplicationHandling.test.log(LogStatus.INFO, "Click on New Claim Button");
                click(MyClaimsObject.clickFileNewClaim);
                ApplicationHandling.test.log(LogStatus.INFO, "Transition to select New Claim and select File a new Claim");
                waitForPresenceOfElelment(MyClaimsObject.selectDropDown);
                ApplicationHandling.test.log(LogStatus.INFO, "Transition to New Claim Page");
                click(MyClaimsObject.selectDropDown);
                ApplicationHandling.test.log(LogStatus.INFO, "Select Patient from the dropdown");
                waitForPresenceOfElelment(MyClaimsObject.selectDropDownValue);
                clickFromList(MyClaimsObject.selectDropDownValue,1);
                //click(MyClaimsObject.selectDropDownValue);
                clickFromList(MyClaimsObject.scrollToBtn,1);
                scroll(MyClaimsObject.scrollToBtn, "SAVE AND PROCEED");
                type(MyClaimsObject.clickClaimAmount, estAmount);
                ApplicationHandling.test.log(LogStatus.INFO, "Enter Estimated Claim Amount");
                int EstAmount= Integer.parseInt(getText(MyClaimsObject.clickClaimAmount).split("\\s")[0]);
                System.out.println("Estimated Amount:" + EstAmount);

                click(MyClaimsObject.clickSaveBtn);
                ApplicationHandling.test.log(LogStatus.INFO, "Click on 'SAVE AND PROCEED' button");
                waitForPresenceOfElelment(MyClaimsObject.appTitle);
                String category=getText(MyClaimsObject.clickDayCareCategory);
                System.out.println("Claim Category: " + category);
                ApplicationHandling.test.log(LogStatus.INFO, "Transition to Choose Category");
                click(MyClaimsObject.clickHospitalization);
                waitForPresenceOfElelment(MyClaimsObject.hospitalName);
                ApplicationHandling.test.log(LogStatus.INFO, "Transition to Hospital Details Page");
                click(MyClaimsObject.hospitalName);
                type(MyClaimsObject.hospitalName,"F");
                Thread.sleep(5000);
                type(MyClaimsObject.hospitalName,"A");
                Thread.sleep(5000);
                type(MyClaimsObject.hospitalName,"R");
                Thread.sleep(5000);
                // clickFromList(MyClaimsObject.scrollView,3);
                click(MyClaimsObject.hospitalNameTxt);
                waitForPresenceOfElelment(MyClaimsObject.districtField);
                scroll(MyClaimsObject.scrollView,"NEXT");
                waitForPresenceOfElelment(MyClaimsObject.startDate);
                click(MyClaimsObject.startDate);
                waitForPresenceOfElelment(MyClaimsObject.okBtnOnCalendar);
                click(MyClaimsObject.okBtnOnCalendar);
                waitForPresenceOfElelment(MyClaimsObject.endDate);
                click(MyClaimsObject.endDate);
                waitForPresenceOfElelment(MyClaimsObject.okBtnOnCalendar);
                click(MyClaimsObject.okBtnOnCalendar);
                waitForPresenceOfElelment(MyClaimsObject.accidentTxt);
                click(MyClaimsObject.accidentTxt);
                waitForPresenceOfElelment(MyClaimsObject.clickNxtBtn);
                click(MyClaimsObject.clickNxtBtn);
                ApplicationHandling.test.log(LogStatus.INFO, "Click on'NEXT' button");
                Thread.sleep(5000);

                try{
                        if(verifyElementToBeLocated(MyClaimsObject.continueBtn)== true)
                                // expliciltyWait(MyClaimsObject.popUpTxt);
                                // System.out.println(MyClaimsObject.continueBtn);
                                Thread.sleep(3000);
                        click(MyClaimsObject.continueBtn);
                        ApplicationHandling.test.log(LogStatus.INFO, "Pop up is shown if already have claim(Awaiting)in this date range");}
                catch(Exception e){
                        System.out.println("***Upload Document screen***");
                        e.printStackTrace();
                        ApplicationHandling.test.log(LogStatus.INFO, "Transition to Upload Documents Screen ");}

                waitForPresenceOfElelment(MyClaimsObject.clickOkBtn2);
                click(MyClaimsObject.clickOkBtn2);
                waitForPresenceOfElelment(MyClaimsObject.clickUploadBtn1);
                clickFromList(MyClaimsObject.clickUploadBtn1,0);
                allowAppPermission();
                uploadFromCamera();
                clickFromList(MyClaimsObject.clickUploadBtn1,1);
                uploadFromCamera();
                clickFromList(MyClaimsObject.clickUploadBtn1,2);
                uploadFromCamera();
                clickFromList(MyClaimsObject.clickUploadBtn1,3);
                uploadFromCamera();
                scroll(MyClaimsObject.scrollToBtn,"SUBMIT");
                waitForPresenceOfElelment(MyClaimsObject.clickSubmitBtn);
                try{
                        if(verifyElementToBeLocated(MyClaimsObject.popUpPendingDoc)){
                                System.out.println(MyClaimsObject.popUpPendingDoc);
                                click(MyClaimsObject.clickOKPendingDocPopUp);
                                waitForPresenceOfElelment(MyClaimsObject.updloadDocStatus);
                                System.out.println("All documents are not uploaded yet or missed some fields for uploading the documents"); }
                }
                catch(Exception e){
                        e.printStackTrace();
                        ApplicationHandling.test.log(LogStatus.INFO, "After uploading the mandatory documents, click on 'SUBMIT' button ");

                        click(MyClaimsObject.clickSubmitBtn);}
                waitForPresenceOfElelment(MyClaimsObject.thankYouTxt);
                click(MyClaimsObject.clickSubmitBtn);
                ApplicationHandling.test.log(LogStatus.INFO, "Thank You! page is shown after submission of the claim");
                ApplicationHandling.test.log(LogStatus.PASS,test.addScreenCapture(AppiumListeners.screenshot()));
                waitForPresenceOfElelment(MyClaimsObject.txtOnFeedback);

                click(MyClaimsObject.clickYes);
                click(MyClaimsObject.clickSubmit);
                waitForPresenceOfElelment(MyClaimsObject.txtFeebback);
                click(MyClaimsObject.feedbackTitle);

                waitForPresenceOfElelment(MyClaimsObject.lastSynTxt);
                System.out.println("on claims dashboard");
                ApplicationHandling.test.log(LogStatus.INFO, "Transition to Claim Dashboard");
                Thread.sleep(10000);
                clickFromList(MyClaimsObject.clickView,0);
                System.out.println("Click first claim from the list");
                ApplicationHandling.test.log(LogStatus.INFO, "Open the submitted claim from the list");
                waitForPresenceOfElelment(MyClaimsObject.claimCategory);

                String claimCategory = getText(MyClaimsObject.claimCategory);
                System.out.println(claimCategory);
                int claimAmount=0;
                try{
                        claimAmount= Integer.parseInt(getText(MyClaimsObject.estClaimAmount).split( "\\s")[1]);
                        System.out.println(claimAmount);
                }
                catch(NumberFormatException ex ){
                        System.out.println("Exception occur");
                }

                if(claimAmount==EstAmount){
                        System.out.println("Details are Verified Successfully");
                        ApplicationHandling.test.log(LogStatus.PASS,"Test Case Passed",test.addScreenCapture(AppiumListeners.screenshot())); }
                else{
                        System.out.println("Details are not Matched ");
                        ApplicationHandling.test.log(LogStatus.FAIL,"Test Case Failed",test.addScreenCapture(AppiumListeners.screenshot()));}
        }

        public static void myClaimsHealthCheckUp(String tcId, String tcName, String email, String expectedmsg, String estAmount) throws Exception {
                waitForPresenceOfElelment(MyClaimsObject.clickMyClaims);
                click(MyClaimsObject.clickMyClaims);
                ApplicationHandling.test.log(LogStatus.INFO, "Click on My Claims from the navigation bar");
                waitForPresenceOfElelment(MyClaimsObject.lastSynTxt);
                ApplicationHandling.test.log(LogStatus.INFO, "Transition to My Claims");
                scroll(MyClaimsObject.scrollToBtn, "NEW CLAIM");
                ApplicationHandling.test.log(LogStatus.INFO, "Scroll till New Claim button");
                click(MyClaimsObject.clickNewClaimBtn);
                waitForPresenceOfElelment(MyClaimsObject.clickFileNewClaim);
                ApplicationHandling.test.log(LogStatus.INFO, "Click on New Claim Button");
                click(MyClaimsObject.clickFileNewClaim);
                ApplicationHandling.test.log(LogStatus.INFO, "Transition to select New Claim and select File a new Claim");
                waitForPresenceOfElelment(MyClaimsObject.selectDropDown);
                ApplicationHandling.test.log(LogStatus.INFO, "Transition to New Claim Page");
                click(MyClaimsObject.selectDropDown);
                ApplicationHandling.test.log(LogStatus.INFO, "Select Patient from the dropdown");
                waitForPresenceOfElelment(MyClaimsObject.selectDropDownValue);
                clickFromList(MyClaimsObject.selectDropDownValue,1);
                //click(MyClaimsObject.selectDropDownValue);
                clickFromList(MyClaimsObject.scrollToBtn,1);
                scroll(MyClaimsObject.scrollToBtn, "SAVE AND PROCEED");
                type(MyClaimsObject.clickClaimAmount, estAmount);
                ApplicationHandling.test.log(LogStatus.INFO, "Enter Estimated Claim Amount");
                int EstAmount= Integer.parseInt(getText(MyClaimsObject.clickClaimAmount).split("\\s")[0]);
                System.out.println("Estimated Amount:" + EstAmount);

                click(MyClaimsObject.clickSaveBtn);
                ApplicationHandling.test.log(LogStatus.INFO, "Click on 'SAVE AND PROCEED' button");
                waitForPresenceOfElelment(MyClaimsObject.appTitle);
                String category=getText(MyClaimsObject.clickHealthCheckUp);
                System.out.println("Claim Category: " + category);
                ApplicationHandling.test.log(LogStatus.INFO, "Transition to Choose Category");
                click(MyClaimsObject.clickHealthCheckUp);
                waitForPresenceOfElelment(MyClaimsObject.selectDate);
                click(MyClaimsObject.selectDate);
                waitForPresenceOfElelment(MyClaimsObject.okBtnOnCalendar);
                click(MyClaimsObject.okBtnOnCalendar);
                waitForPresenceOfElelment(MyClaimsObject.clickNxtBtn);
                click(MyClaimsObject.clickNxtBtn);
                waitForPresenceOfElelment(MyClaimsObject.clickOkBtn2);
                click(MyClaimsObject.clickOkBtn2);
                /*waitForPresenceOfElelment(MyClaimsObject.hospitalName);
                ApplicationHandling.test.log(LogStatus.INFO, "Transition to Hospital Details Page");
                Thread.sleep(5000);

                try{
                        if(verifyElementToBeLocated(MyClaimsObject.continueBtn)== true)
                                // expliciltyWait(MyClaimsObject.popUpTxt);
                                // System.out.println(MyClaimsObject.continueBtn);
                                Thread.sleep(3000);
                        click(MyClaimsObject.continueBtn);
                        ApplicationHandling.test.log(LogStatus.INFO, "Pop up is shown if already have claim(Awaiting)in this date range");}
                catch(Exception e){
                        System.out.println("***Upload Document screen***");
                        e.printStackTrace();
                        ApplicationHandling.test.log(LogStatus.INFO, "Transition to Upload Documents Screen ");}

                waitForPresenceOfElelment(MyClaimsObject.clickOkBtn2);
                click(MyClaimsObject.clickOkBtn2);*/

                waitForPresenceOfElelment(MyClaimsObject.clickUploadBtn1);
                clickFromList(MyClaimsObject.clickUploadBtn1,0);
                allowAppPermission();
                uploadFromCamera();
                clickFromList(MyClaimsObject.clickUploadBtn1,1);
                uploadFromCamera();
                scroll(MyClaimsObject.scrollToBtn,"SUBMIT");
                waitForPresenceOfElelment(MyClaimsObject.clickSubmitBtn);
                click(MyClaimsObject.saveAndUploadLaterBtn);
                waitForPresenceOfElelment(MyClaimsObject.popUpOnSaveAndUploadLater);
                click(MyClaimsObject.okBtnOnPopUpSaveAndUploadLater);
                ApplicationHandling.test.log(LogStatus.INFO, "Click on 'OK' Btn of saveandlater pop up");
                ApplicationHandling.test.log(LogStatus.PASS,test.addScreenCapture(AppiumListeners.screenshot()));
                waitForPresenceOfElelment(MyClaimsObject.lastSynTxt);
                System.out.println("on claims dashboard");
                ApplicationHandling.test.log(LogStatus.INFO, "Transition to Claim Dashboard");
                Thread.sleep(10000);
                clickFromList(MyClaimsObject.clickView,0);
                System.out.println("Click first claim from the list");
                ApplicationHandling.test.log(LogStatus.INFO, "Open the submitted claim from the list");
                waitForPresenceOfElelment(MyClaimsObject.claimCategory);

                String claimCategory = getText(MyClaimsObject.claimCategory);
                System.out.println(claimCategory);
                int claimAmount=0;
                try{
                        claimAmount= Integer.parseInt(getText(MyClaimsObject.estClaimAmount).split( "\\s")[1]);
                        System.out.println(claimAmount);
                }
                catch(NumberFormatException ex ){
                        System.out.println("Exception occur");
                }

                if(claimAmount==EstAmount){
                        System.out.println("Details are Verified Successfully");
                        ApplicationHandling.test.log(LogStatus.PASS,"Test Case Passed",test.addScreenCapture(AppiumListeners.screenshot())); }
                else{
                        System.out.println("Details are not Matched ");
                        ApplicationHandling.test.log(LogStatus.FAIL,"Test Case Failed",test.addScreenCapture(AppiumListeners.screenshot()));}
        }

        public static void claimSaveLater(String tcId, String tcName, String email, String expectedmsg, String estAmount) throws Exception {
                waitForPresenceOfElelment(MyClaimsObject.clickMyClaims);
                click(MyClaimsObject.clickMyClaims);
                ApplicationHandling.test.log(LogStatus.INFO, "Click on My Claims from the navigation bar");
                waitForPresenceOfElelment(MyClaimsObject.lastSynTxt);
                ApplicationHandling.test.log(LogStatus.INFO, "Transition to My Claims");
                scroll(MyClaimsObject.scrollToBtn, "NEW CLAIM");
                ApplicationHandling.test.log(LogStatus.INFO, "Scroll till New Claim button");
                click(MyClaimsObject.clickNewClaimBtn);
                waitForPresenceOfElelment(MyClaimsObject.clickFileNewClaim);
                ApplicationHandling.test.log(LogStatus.INFO, "Click on New Claim Button");
                click(MyClaimsObject.clickFileNewClaim);
                ApplicationHandling.test.log(LogStatus.INFO, "Transition to select New Claim and select File a new Claim");
                waitForPresenceOfElelment(MyClaimsObject.selectDropDown);
                ApplicationHandling.test.log(LogStatus.INFO, "Transition to New Claim Page");
                click(MyClaimsObject.selectDropDown);
                ApplicationHandling.test.log(LogStatus.INFO, "Select Patient from the dropdown");
                waitForPresenceOfElelment(MyClaimsObject.selectDropDownValue);
                clickFromList(MyClaimsObject.selectDropDownValue,1);
                //click(MyClaimsObject.selectDropDownValue);
                clickFromList(MyClaimsObject.scrollToBtn,1);
                scroll(MyClaimsObject.scrollToBtn, "SAVE AND PROCEED");
                type(MyClaimsObject.clickClaimAmount, estAmount);
                ApplicationHandling.test.log(LogStatus.INFO, "Enter Estimated Claim Amount");
                int EstAmount= Integer.parseInt(getText(MyClaimsObject.clickClaimAmount).split("\\s")[0]);
                System.out.println("Estimated Amount:" + EstAmount);

                click(MyClaimsObject.clickSaveBtn);
                ApplicationHandling.test.log(LogStatus.INFO, "Click on 'SAVE AND PROCEED' button");
                waitForPresenceOfElelment(MyClaimsObject.appTitle);
                String category=getText(MyClaimsObject.clickHealthCheckUp);
                System.out.println("Claim Category: " + category);
                ApplicationHandling.test.log(LogStatus.INFO, "Transition to Choose Category");
                click(MyClaimsObject.clickHealthCheckUp);
                waitForPresenceOfElelment(MyClaimsObject.dateOfTreatmentTxt);
                click(MyClaimsObject.selectDate);
                waitForPresenceOfElelment(MyClaimsObject.okBtnOnCalendar);
                click(MyClaimsObject.okBtnOnCalendar);
                waitForPresenceOfElelment(MyClaimsObject.clickNxtBtn);
                click(MyClaimsObject.clickNxtBtn);
                waitForPresenceOfElelment(MyClaimsObject.clickOkBtn2);
                click(MyClaimsObject.clickOkBtn2);
                /*waitForPresenceOfElelment(MyClaimsObject.hospitalName);
                ApplicationHandling.test.log(LogStatus.INFO, "Transition to Hospital Details Page");
                Thread.sleep(5000);

                try{
                        if(verifyElementToBeLocated(MyClaimsObject.continueBtn)== true)
                                // expliciltyWait(MyClaimsObject.popUpTxt);
                                // System.out.println(MyClaimsObject.continueBtn);
                                Thread.sleep(3000);
                        click(MyClaimsObject.continueBtn);
                        ApplicationHandling.test.log(LogStatus.INFO, "Pop up is shown if already have claim(Awaiting)in this date range");}
                catch(Exception e){
                        System.out.println("***Upload Document screen***");
                        e.printStackTrace();
                        ApplicationHandling.test.log(LogStatus.INFO, "Transition to Upload Documents Screen ");}

                waitForPresenceOfElelment(MyClaimsObject.clickOkBtn2);
                click(MyClaimsObject.clickOkBtn2);*/

                waitForPresenceOfElelment(MyClaimsObject.clickUploadBtn1);
                /*clickFromList(MyClaimsObject.clickUploadBtn1,0);
                allowAppPermission();
                uploadFromCamera();
                clickFromList(MyClaimsObject.clickUploadBtn1,1);
                uploadFromCamera();
                scroll(MyClaimsObject.scrollToBtn,"SUBMIT");
                waitForPresenceOfElelment(MyClaimsObject.clickSubmitBtn);*/

                click(MyClaimsObject.saveAndUploadLaterBtn);
                waitForPresenceOfElelment(MyClaimsObject.popUpOnSaveAndUploadLater);
                click(MyClaimsObject.okBtnOnPopUpSaveAndUploadLater);
                ApplicationHandling.test.log(LogStatus.INFO, "Click on 'OK' Btn of saveandlater pop up");
                ApplicationHandling.test.log(LogStatus.PASS,test.addScreenCapture(AppiumListeners.screenshot()));
                waitForPresenceOfElelment(MyClaimsObject.lastSynTxt);
                System.out.println("on claims dashboard");
                ApplicationHandling.test.log(LogStatus.INFO, "Transition to Claim Dashboard");
                Thread.sleep(10000);
                scroll(MyClaimsObject.scrollToBtn, "NEW CLAIM");
                clickFromList(MyClaimsObject.resumeBtnOnClaimsCard,0);
                System.out.println("Click on first resumed claim from the list");
                ApplicationHandling.test.log(LogStatus.INFO, "Open the submitted claim from the list");
                waitForPresenceOfElelment(MyClaimsObject.claimCategory);

                String claimCategory = getText(MyClaimsObject.claimCategory);
                System.out.println(claimCategory);
                int claimAmount=0;
                try{
                        claimAmount= Integer.parseInt(getText(MyClaimsObject.estClaimAmount).split( "\\s")[1]);
                        System.out.println(claimAmount);
                }
                catch(NumberFormatException ex ){
                        System.out.println("Exception occur");
                }

                if(claimAmount==EstAmount){
                        System.out.println("Details are Verified Successfully");
                        ApplicationHandling.test.log(LogStatus.PASS,"Test Case Passed",test.addScreenCapture(AppiumListeners.screenshot())); }
                else{
                        System.out.println("Details are not Matched ");
                        ApplicationHandling.test.log(LogStatus.FAIL,"Test Case Failed",test.addScreenCapture(AppiumListeners.screenshot()));}
        }


    }

