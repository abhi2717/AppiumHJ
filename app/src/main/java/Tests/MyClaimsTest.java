package Tests;

import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import DataProvider.DataProviderLoginPage;
import GenericLab.ApplicationHandling;
import Listerners.AppiumListeners;
import Listerners.ConfigFileReader;
import Pages.MyClaimsPage;
import Utility.ExcelHandler;

import static GenericLab.ApplicationHandling.extent;
import static GenericLab.ApplicationHandling.test;

public class MyClaimsTest extends ApplicationHandling {

    MyClaimsPage MyClaims_obj = new MyClaimsPage();

   /* @Test(dataProviderClass= DataProviderLoginPage.class,dataProvider= "invalidData")
    public void invalidLoginDetails(String tcId,String tcName,String email,String expectedmsg) throws InterruptedException, IOException {
        test=extent.startTest(tcId+" :  "+tcName);
        //loginPage_obj.otpLogin(tcId,tcName,email,expectedmsg);
        loginPage_obj.loginViaOTP(tcId,tcName,email,expectedmsg);
        extent.endTest(test);
        extent.flush();
    }*/

/*    @Test(dataProviderClass= DataProviderLoginPage.class,dataProvider= "myClaimsData", enabled = true)
    public void myClaimsDetails(String tcId,String tcName,String email,String expectedmsg,String estAmount) throws Exception {
        test=extent.startTest(tcId+" :  "+tcName);
        try{
            MyClaims_obj.myClaims(tcId,tcName,email,expectedmsg,estAmount);
            ApplicationHandling.test.log(LogStatus.PASS,"MyClaims Passed");
        }
        catch (Exception e){
            e.printStackTrace();
            ApplicationHandling.test.log(LogStatus.FAIL,"MyClaims Failed");
            ApplicationHandling.test.log(LogStatus.FAIL,test.addScreenCapture(AppiumListeners.screenshot()));
        }

        String status = String.valueOf(ApplicationHandling.test.getRunStatus());
        ConfigFileReader obj_config=new ConfigFileReader();
        FileInputStream fin=new FileInputStream(new File(obj_config.getExcel()));
        ExcelHandler Excel_obj = new ExcelHandler(fin);
        Excel_obj.selectSheet(obj_config.getSheetName());
        Excel_obj.setCellData(6,41,status);

        extent.endTest(test);
        extent.flush();
    }*/

    @Test(dataProviderClass= DataProviderLoginPage.class,dataProvider= "myClaimsData", enabled = true)
    public void myClaimsDetails(String tcId,String tcName,String email,String expectedmsg,String estAmount) throws Exception {
        test=extent.startTest(tcId+" :  "+tcName);
        try{
            MyClaims_obj.claimSaveLater(tcId,tcName,email,expectedmsg,estAmount);
            ApplicationHandling.test.log(LogStatus.PASS,"MyClaims Passed");
        }
        catch (Exception e){
            e.printStackTrace();
            ApplicationHandling.test.log(LogStatus.FAIL,"MyClaims Failed");
            ApplicationHandling.test.log(LogStatus.FAIL,test.addScreenCapture(AppiumListeners.screenshot()));
        }

        String status = String.valueOf(ApplicationHandling.test.getRunStatus());
        ConfigFileReader obj_config=new ConfigFileReader();
        FileInputStream fin=new FileInputStream(new File(obj_config.getExcel()));
        ExcelHandler Excel_obj = new ExcelHandler(fin);
        Excel_obj.selectSheet(obj_config.getSheetName());
        Excel_obj.setCellData(6,41,status);

        extent.endTest(test);
        extent.flush();
    }
}
