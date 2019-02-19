package Tests;

import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import DataProvider.DataProviderLoginPage;
import GenericLab.ApplicationHandling;
import Listerners.AppiumListeners;
import Listerners.ConfigFileReader;
import Pages.LoginPage;
import Utility.ExcelHandler;

public class LoginTest extends ApplicationHandling{
    LoginPage loginPage_obj = new LoginPage();

/*    @Test(dataProviderClass= DataProviderLoginPage.class,dataProvider="getTableData")
    public void loginOTP (String email,String expectedmsg)
    {
        //LoginPage loginPage_obj = new LoginPage();
        loginPage_obj.loginViaOTP(email,expectedmsg);
    }*/

/*
    @Test(dataProviderClass= DataProviderLoginPage.class,dataProvider= "invalidData")
    public void invalidLoginDetails(String tcId,String tcName,String email,String expectedmsg) throws IOException {
        test=extent.startTest(tcId+" :  "+tcName);
        loginPage_obj.invalidLogin(tcId,tcName,email,expectedmsg);
        extent.endTest(test);
        extent.flush();
    }
*/

    @Test(dataProviderClass= DataProviderLoginPage.class,dataProvider= "loginData")
    public void loginDataDetails(String tcId,String tcName,String email,String expectedmsg) throws Exception {
        test=extent.startTest(tcId+" :  "+tcName);
        //loginPage_obj.otpLogin(tcId,tcName,email,expectedmsg);
       try {
           loginPage_obj.loginViaOTP(email, expectedmsg);
           ApplicationHandling.test.log(LogStatus.PASS,"Login via OTP passed"); }
       catch (Exception e) {
           ApplicationHandling.test.log(LogStatus.FAIL,"Login via OTP Failed");
           ApplicationHandling.test.log(LogStatus.FAIL,test.addScreenCapture(AppiumListeners.screenshot()));
           e.printStackTrace(); }

       String status = String.valueOf(ApplicationHandling.test.getRunStatus());
       ConfigFileReader obj_config=new ConfigFileReader();
       FileInputStream fin=new FileInputStream(new File(obj_config.getExcel()));
       ExcelHandler Excel_obj = new ExcelHandler(fin);
       Excel_obj.selectSheet(obj_config.getSheetName());
       Excel_obj.setCellData(6,3,status);

       extent.endTest(test);
       extent.flush();
    }

   /* @Test
    public void loginAccountLocked(){
       // loginPage_obj.accLockedLoginLogout();
    }*/
}

