package Pages;

import GenericLab.ActionDrivers;
import ObjectRepository.HomeObjects;

public class HomePage extends ActionDrivers {

    public static void Dashboard()
    {
        click(HomeObjects.clickOnMoreTab);
        waitForPresenceOfElelment(HomeObjects.waitForText);
    }
}
