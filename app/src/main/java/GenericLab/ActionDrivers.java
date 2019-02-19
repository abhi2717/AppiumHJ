package GenericLab;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

import ObjectRepository.MyClaimsObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ActionDrivers extends ApplicationHandling{
        //protected AndroidDriver driver;

        /*public ActionDrivers(AndroidDriver driver) {
            this.driver=driver;
        }*/
     /*   public static WebDriverWait wait;
        public static AndroidDriver driver;*/
     public static WebDriverWait wait;

        public static void waitForPresenceOfElelment(By loc)
    {
        WebDriverWait wait= new WebDriverWait(driver,3000);
        wait.until(ExpectedConditions.presenceOfElementLocated(loc));
    }

    public static void waitForElementToBeClickable(By loc)
    {
        WebDriverWait wait= new WebDriverWait(driver,3000);
        wait.until(ExpectedConditions.elementToBeClickable(loc));
    }

    public static void click(By loc) {
        //System.out.println(loc);
        waitForPresenceOfElelment(loc);
        waitForElementToBeClickable(loc);
        WebElement element = driver.findElement(loc);
        element.click();
    }

    public static void type(By loc,String str) {
        waitForPresenceOfElelment(loc);
        WebElement element = driver.findElement(loc);
        element.sendKeys(str);
    }

    public static String readOTP() throws Exception {
        //driver.startActivity("com.android.mms", "com.android.mms.ui.ConversationList");
                driver.openNotifications();
                try {
                    String otp = driver.findElementByXPath("//*[contains(@text,'is')]").getText().split("code:")[0];
                    return otp;
                }catch (NoSuchElementException e){
                    throw new java.lang.Exception("Notification not found");}
    }

    /*public static void expliciltyWait(By loc){
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.presenceOfElementLocated(loc));
    }

    public static void openEmail() throws EmailException {

        Email email = new SimpleEmail();
        email.setHostName("smtp.googlemail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("username", "password"));
        email.setSSLOnConnect(true);
        email.setFrom("user@gmail.com");
        email.setSubject("TestMail");
        email.setMsg("This is a test mail ... :-)");
        email.addTo("foo@bar.com");
        email.send();
    }*/

    public static void verifyFunction(By loc) throws Exception {
        try{
        WebElement element = driver.findElement(loc);
        element.isDisplayed();}
        catch(Exception e) {
            throw new Exception("Element is not present"); } }


    public void waitForPageLoad() {
        wait = new WebDriverWait(driver, 40);
        ExpectedCondition<Boolean> pageLoadCondition = new
                ExpectedCondition<Boolean>() {
                    @Override
                    public Boolean apply(WebDriver webDriver) {
                        return null;}
                    public Boolean apply(AndroidDriver driver) {
                        return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete"); }};
        wait.until(pageLoadCondition);}

   public static void uploadFromCamera() throws InterruptedException {
       //click(MyClaimsObject.loc);
       waitForPresenceOfElelment(MyClaimsObject.clickCamera);
       click(MyClaimsObject.clickCamera);
       waitForPresenceOfElelment(MyClaimsObject.clickDoneBtn);
       click(MyClaimsObject.clickCaptureBtn);
       Thread.sleep(10000);
       click(MyClaimsObject.clickDoneBtn);
       waitForPresenceOfElelment(MyClaimsObject.clickUploadBtn1);
       click(MyClaimsObject.clickUploadBtn1);
       waitForPresenceOfElelment(MyClaimsObject.pleaseTxt);
       click(MyClaimsObject.confirmBtn);
      // expliciltyWait(MyClaimsObject.clickSubmitBtn);
   }

    public static void scroll(By loc, String val) {
        WebElement list = driver.findElement(loc);
        try{
        list.findElement(MobileBy
                .AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
                        + "new UiSelector().text(\" val \"));"));}
        catch(Exception e){
            e.printStackTrace();
            System.out.println("Cannot scroll further ");
        }}

    public static List<MobileElement> listMySection(By loc) {
        waitForPresenceOfElelment(loc);
        List<MobileElement> elements = driver.findElements(loc);
        return elements;
    }

    public static void clickFromList(By loc, int index)
    {
        List<MobileElement> elements = driver.findElements(loc);
        elements.get(index).click();
    }

    public static boolean verifyElementToBeLocated(By Loc)
    {
        WebElement element = driver.findElement(Loc);
        element.isDisplayed();
        return true;
    }

    public static String getText(By loc)
    {
        WebElement element = driver.findElement(loc);
        return element.getText();
    }

    public static void getAttribute(By loc, String str)
    {
        WebElement element = driver.findElement(loc);
        element.getAttribute(str);
    }

    public static void clearTextboxField(By loc)
    {
        WebElement element = driver.findElement(loc);
        element.clear();
    }

    public void dropDown(By loc,String text){
        List<MobileElement> list= driver.findElements(loc);
        for(int i=0; i<list.size();i++){
            WebElement values = list.get(i);
            if(values.getAttribute("text").equalsIgnoreCase(text))
                values.click();
        }
    }

    public static void allowAppPermission() {
        while (driver.findElements(MobileBy.xpath("//*[@class='android.widget.Button'][2]")).size() > 0) {
            driver.findElement(MobileBy.xpath("//*[@class='android.widget.Button'][2]")).click();}
    }
}
