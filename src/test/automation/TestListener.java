import Reporting.ExtentTestManager;
import com.aventstack.extentreports.Status;
import io.cucumber.java.Scenario;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import Reporting.ExtentTestManager;

public class TestListener extends TestListenerAdapter {


    public void onTestStart(Scenario result) {
        System.out.println("Listener: on test start"+ result.getName().toString());
        System.out.println("***************");
    }

    public void onTestSuccess(Scenario result) {
        System.out.println("Listener: on test success"+result.getName().toString());
        System.out.println("***************");
        ExtentTestManager.getTest().log(Status.PASS,"Test Passed");
    }

    public void onTestFailure(Scenario result) {
        System.out.println("Listener: on test failure"+result.getName().toString());
        System.out.println("***************");
        ExtentTestManager.getTest().log(Status.FAIL,"Test Failed");

    }

    public void onTestSkipped(Scenario result) {
        System.out.println("Listener: on test skipped"+result.getName().toString());
        System.out.println("***************");
        ExtentTestManager.getTest().log(Status.SKIP,"Test Skipped");

    }

    public void onTestFailedButWithinSuccessPercentage(Scenario result) {
        System.out.println("Listener: test failed with success %"+result.getName().toString());
        System.out.println("***************");
    }

    public void onStart(ITestContext context) {
        System.out.println("Listener: on start "+ context.getName().toString());
//        ExtentTestManager.getTest().log(Status.INFO,"Listener: on test start "+context.getName());
        System.out.println("***************");
    }

    public void onFinish(ITestContext context) {
        System.out.println("Listener: on finish"+ context.getName().toString());
        System.out.println("***************");
//        ExtentTestManager.getTest().log(Status.INFO,"Listener: on flush");

    }
}
