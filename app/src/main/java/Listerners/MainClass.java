package Listerners;

import org.testng.TestNG;

import java.util.ArrayList;
import java.util.List;

public class MainClass {


    public static void main(String[] args) {
// TODO Auto-generated method stub

// Create object of TestNG Class
        TestNG runner=new TestNG();

// Create a list of String
        List<String> suitefiles=new ArrayList<String>();

// Add xml file which you have to execute
        suitefiles.add("C:\\Users\\ab.chauhan\\AndroidStudioProjects\\AppiumHJ\\app\\src\\main\\java\\testng.xml");

// now set xml file for execution
        runner.setTestSuites(suitefiles);

// finally execute the runner using run method
        runner.run();



    }

}
