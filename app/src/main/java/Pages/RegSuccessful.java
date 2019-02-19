package Pages;

import org.openqa.selenium.By;

import GenericLab.ActionDrivers;
import ObjectRepository.RegSuccessObj;
import Pages.LoginPage;

public class RegSuccessful extends LoginPage {

    RegSuccessObj Reg_obj = new RegSuccessObj();
    ActionDrivers action_obj = new ActionDrivers();

    /*public void Registration()
    {
        action_obj.click(Reg_obj.clickCreateAccount);
        action_obj.type(Reg_obj.enterEmail,"abc@gmail.com");
        action_obj.click(Reg_obj.sendOtpLink);
        action_obj.type(Reg_obj.otpText1,"1");
        action_obj.type(Reg_obj.otpText2,"2");
        action_obj.type(Reg_obj.otpText3,"3");
        action_obj.type(Reg_obj.otpText4,"4");
        action_obj.type(Reg_obj.enterMemberId,"10002085678");
        action_obj.type(Reg_obj.enterDOB,"14/02/1993");
        action_obj.click(Reg_obj.clickNextbtn);
        //action_obj.expliciltyWait(Reg_obj.waitForMoreTab);
    }

    public void unsuccessReg()
    {
        Registration();
        action_obj.getText(Reg_obj.verbiageInvalidDetails);
        System.out.println("unsuccessful registration");
    }

   *//* public void alreadyRegUser()
    {
        Registration();
        action_obj.click(Reg_obj.clickOnLogin);
        loginViaOTP();
    }*//*
*/
}
