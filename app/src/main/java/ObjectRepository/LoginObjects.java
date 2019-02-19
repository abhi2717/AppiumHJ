package ObjectRepository;

import org.openqa.selenium.By;

public class LoginObjects {

    public static By clickCancelBtn=By.id("com.google.android.gms:id/cancel");
    public static By enterMobileNumber=By.id("com.freecharge.android:id/username");
    public static By clickContinueBtn=By.id("com.freecharge.android:id/submit");
    public static By submitBtn=By.xpath("//*[@text='SUBMIT']");


    public static By clickSignIn= By.id("com.phonepe.app:id/tv_already_have_account_sign_in");
    public static By clickForgot= By.id("com.phonepe.app:id/tv_verifyuser_forgot");
    public static By clickContinue=By.id("com.phonepe.app:id/confirm");
    public static By resetText=By.id("com.phonepe.app:id/tv_forget_password_dialog_title");
    public static By clickShowTxt=By.id("com.phonepe.app:id/tv_new_password_show");
    public static By waitForNotification=By.xpath("//*[contains(@text,'is your PhonePe password reset code.')]");


    public static By getStartedTxt=By.id("com.ubercab.uberlite:id/ub__lite_get_started_button");
    public static By visibleTxt=By.xpath("//*[@class='android.view.View' and @text='Enter your phone number(required)']");
    public static By typeMobileNo=By.xpath("//*[@class='android.webkit.WebView'][@class='android.view.View' and @id='answerForm'][@class='android.widget.EditText'and @id='mobile']");
    public static By waitForEmailTxt=By.id("com.amhi.healthjinn:id/email");
    public static By resendTxt=By.id("resend");
    public static By clickNextBtn=By.xpath("//*[@class='android.view.View'][@class='android.widget.Button'and @text='Next']");
    public static By smsOtp=By.id("smsOTP");
   // public static By nextBtn=By.id("com.amhi.healthjinn:id/btnNext");
    public static By loginViaOtpLnk=By.xpath("//*[@text='Login using OTP']");
    public static By emailTxt=By.xpath("//*[@text='Phone Number / Email Id']");
    public static By enterEmail=By.id("com.amhi.healthjinn:id/email");
    public static By enterpassword=By.id("com.amhi.healthjinn:id/password");
    public static By clickLoginBtn=By.id("com.amhi.healthjinn:id/login");
    public static By sendOtpLink=By.xpath("//*[@text='SEND OTP']");
    public static By visibleOtpTxt=By.id("com.amhi.healthjinn:id/otp_desc");
    public static By otpText1=(By.id("com.amhi.healthjinn:id/text_1"));
    public static By otpText2=(By.id("com.amhi.healthjinn:id/text_2"));
    public static By otpText3=(By.id("com.amhi.healthjinn:id/text_3"));
    public static By otpText4=(By.id("com.amhi.healthjinn:id/text_4"));
    public static By clickOkBtn=By.id("com.amhi.healthjinn:id/btnRight");
    public static By clickOtpLogin=By.xpath("//*[@text='OTP LOGIN']");
    public static By waitForMoreTab=By.id("com.amhi.healthjinn:id/more");
    public static By verbiageIncorrectPwd=By.id("com.amhi.healthjinn:id/msg");
    public static By clickMyAccount=By.xpath("//*[@text='My Account']");
    public static By clickLogOut=By.id("com.amhi.healthjinn:id/logout");
    public static By waitMyAccount=By.xpath("//*[@text='My Account']");
    public static By visibleMsg=By.id("com.amhi.healthjinn:id/msg");
    public static By errorTxt=By.xpath("//*[@text='Please fill valid details to proceed.']");
    public static By acceptBtn=By.xpath("//*[@class='android.widget.TextView'][@text='ACCEPT']");
    public static By healthJinnTxt=By.xpath("//*[@text='HealthJinn']");
    public static By connectWithGF=By.id("com.amhi.healthjinn:id/connectWithGF");


}
