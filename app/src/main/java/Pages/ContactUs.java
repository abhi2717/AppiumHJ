/*
package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import GenericLab.ActionDrivers;
import ObjectRepository.ContactUsObjects;

public class ContactUs {
    ContactUsObjects contact_obj = new ContactUsObjects();
    ActionDrivers action_obj = new ActionDrivers();

    public void postQuery()
    {
        action_obj.click(contact_obj.clickOnDropdown1);
        action_obj.expliciltyWait(contact_obj.waitForValues);
        action_obj.dropDown(contact_obj.selectDropDownValues,"Request");
        //action_obj.click(contact_obj.clickOnDropDown2);
        action_obj.click(contact_obj.clickOnSend);

        if (action_obj.visibilityOfElement(contact_obj.visibleText))
        { action_obj.click(contact_obj.clickOnProceedButton);
            action_obj.expliciltyWait(contact_obj.waitOkbtn);
            action_obj.click(contact_obj.clickOnOkBtn);}
        else
        action_obj.click(contact_obj.clickOnOkBtn);
    }

}
*/
