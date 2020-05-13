package Reporting;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import java.util.HashMap;
import java.util.Map;

public class ExtentTestManager {

    private static ExtentTest test;
    private static Map<Integer,ExtentTest> extentMap = new HashMap<Integer, ExtentTest>();
    private static ExtentReports reports = ExtentManager.getInstance();

    public static synchronized ExtentTest startTest(String testname)
    {
        test = reports.createTest(testname);
        extentMap.put((int) (long) Thread.currentThread().getId(),test);
        return test;
    }

    public static synchronized void endTest()
    {
        reports.flush();
    }

    public static synchronized ExtentTest getTest()
    {
        return extentMap.get((int) (long) Thread.currentThread().getId());
    }
}
