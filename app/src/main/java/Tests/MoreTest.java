package Tests;

import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import DataProvider.DataProviderLoginPage;
import Listerners.AppiumListeners;
import Listerners.ConfigFileReader;
import Pages.MoreTab;
import GenericLab.ApplicationHandling;
import Utility.ExcelHandler;

public class MoreTest extends ApplicationHandling{

   // MoreTab MoreTab_obj = new MoreTab();

    @Test(dataProviderClass= DataProviderLoginPage.class,dataProvider= "moreTabData", enabled = true)
    public void moreDetails(String tcId,String tcName,String email,String expectedmsg) throws Exception {
        test=extent.startTest(tcId+" :  "+tcName);
        try{
        MoreTab.moreTabData(email,expectedmsg);
        ApplicationHandling.test.log(LogStatus.PASS,"moreTabData Passed");
        }
        catch (Exception e)
        {
            e.printStackTrace();
            ApplicationHandling.test.log(LogStatus.FAIL,"moreTabData Failed");
            ApplicationHandling.test.log(LogStatus.FAIL,test.addScreenCapture(AppiumListeners.screenshot()));
        }
        String status = String.valueOf(ApplicationHandling.test.getRunStatus());
        ConfigFileReader obj_config=new ConfigFileReader();
        FileInputStream fin=new FileInputStream(new File(obj_config.getExcel()));
        ExcelHandler Excel_obj = new ExcelHandler(fin);
        Excel_obj.selectSheet(obj_config.getSheetName());
        Excel_obj.setCellData(6,16,status);
        extent.endTest(test);
        extent.flush();
    }
}
