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
import Pages.MyPolicyPage;
import Utility.ExcelHandler;


public class MyPolicyTest extends ApplicationHandling {

    MyPolicyPage MyPolicyPage_obj = new MyPolicyPage();

    @Test(dataProviderClass= DataProviderLoginPage.class,dataProvider= "myPolicyData", enabled = true)
    public void myPolicyDetails(String tcId,String tcName,String email,String expectedmsg,String addPolicy) throws Exception {
        test=extent.startTest(tcId+" :  "+tcName);
        try {
            MyPolicyPage_obj.addPolicy(tcId, tcName, email, expectedmsg,addPolicy);
            ApplicationHandling.test.log(LogStatus.PASS,"Add Policy Passed");
        }
        catch (Exception e){
            e.printStackTrace();
            ApplicationHandling.test.log(LogStatus.FAIL,"Add Policy Failed");
            ApplicationHandling.test.log(LogStatus.FAIL,test.addScreenCapture(AppiumListeners.screenshot()));
        }

        String status = String.valueOf(ApplicationHandling.test.getRunStatus());
        ConfigFileReader obj_config=new ConfigFileReader();
        FileInputStream fin=new FileInputStream(new File(obj_config.getExcel()));
        ExcelHandler Excel_obj = new ExcelHandler(fin);
        Excel_obj.selectSheet(obj_config.getSheetName());
        Excel_obj.setCellData(6,14,status);

        extent.endTest(test);
        extent.flush(); }
}
