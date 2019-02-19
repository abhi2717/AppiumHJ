package ObjectRepository;

import org.openqa.selenium.By;

public class RegSuccessObj {

    public static By clickCreateAccount=By.id("com.amhi.healthjinn:id/signup");
    public static By enterEmail=By.id("com.amhi.healthjinn:id/email");
    public static By sendOtpLink=By.id("send_otp");
    public static By otpText1=By.id("text_1");
    public static By otpText2=By.id("text_2");
    public static By otpText3=By.id("text_3");
    public static By otpText4=By.id("text_4");
    public static By enterMemberId=By.id("com.amhi.healthjinn:id/member_id");
    public static By enterDOB=By.id("com.amhi.healthjinn:id/dob");
    public static By clickNextbtn=By.id("com.amhi.healthjinn:id/next");
    public static By clickOnLogin=By.id("com.amhi.healthjinn:id/btnRight");
    public static By waitForLoginLink=By.id("login_using_otp");
    public static By loginViaOtpLnk=By.id("login_using_otp");
    public static By emailTxt=By.id("email");
    public static By waitForMoreTab=By.id("com.amhi.healthjinn:id/more");
    //public static By clickOnForgotPwd=By.id("com.amhi.healthjinn:id/btnLeft");
    public static By verbiageInvalidDetails=By.xpath("//*[conatins(@text,\"Sorry, we couldn’t recognize\")]");
}
