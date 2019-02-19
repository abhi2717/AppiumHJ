package Tests;

import org.testng.annotations.Test;
import GenericLab.ApplicationHandling;
import Pages.HomePage;

public class HomeTest extends ApplicationHandling{

    @Test
    public void Home()
    {
        HomePage Homepage_obj = new HomePage();
        Homepage_obj.Dashboard();
    }

}
