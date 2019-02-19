import org.testng.annotations.Test;

import java.io.IOException;

import DataProvider.DataProviderLoginPage;
import GenericLab.ApplicationHandling;
import Pages.StayActive;

public class StayActiveTest extends ApplicationHandling {

    StayActive stayActivePages = new StayActive();
    @Test(dataProviderClass= DataProviderLoginPage.class,dataProvider= "invalidData", enabled = true)
    public void invalidLoginDetails(String tcId,String tcName,String email,String expectedmsg) throws IOException, InterruptedException {
        test=extent.startTest(tcId+" :  "+tcName);
        stayActivePages.stayActiveFlow(tcId,tcName,email,expectedmsg);
        extent.endTest(test);
        extent.flush();
    }}
