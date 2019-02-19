import org.testng.TestNG;

import Tests.StayActiveTest;

//import com.xxx.test.others.AddContactHappyPath;
public class SampCls {
    public static void main(String[] args) throws ClassNotFoundException {
        TestNG test = new TestNG();
    test.setTestClasses(new Class[] { StayActiveTest.class });
    test.run();
    } }