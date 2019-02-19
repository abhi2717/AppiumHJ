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
import Pages.StayActive;
import Utility.ExcelHandler;

public class StayActiveTest extends ApplicationHandling {

    StayActive stayActivePages = new StayActive();
    @Test(dataProviderClass= DataProviderLoginPage.class,dataProvider= "stayActiveData", enabled = true)
    public void stayActiveDetails(String tcId,String tcName,String email,String expectedmsg) throws Exception {
        test=extent.startTest(tcId+" :  "+tcName);
        try{
        stayActivePages.stayActiveFlow(tcId,tcName,email,expectedmsg);
        ApplicationHandling.test.log(LogStatus.PASS,"StayActiveFlow Passed");
        }
        catch (Exception e){
            e.printStackTrace();
            ApplicationHandling.test.log(LogStatus.FAIL,"StayActiveFlow Failed");
            ApplicationHandling.test.log(LogStatus.FAIL,test.addScreenCapture(AppiumListeners.screenshot()));
        }

        String status = String.valueOf(ApplicationHandling.test.getRunStatus());
        ConfigFileReader obj_config=new ConfigFileReader();
        FileInputStream fin=new FileInputStream(new File(obj_config.getExcel()));
        ExcelHandler Excel_obj = new ExcelHandler(fin);
        Excel_obj.selectSheet(obj_config.getSheetName());
        Excel_obj.setCellData(6,40,status);
        extent.endTest(test);
        extent.flush();
    }}
