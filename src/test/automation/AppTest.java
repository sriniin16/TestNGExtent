import com.aventstack.extentreports.Status;
import org.testng.annotations.*;
import Reporting.ExtentTestManager;

public class AppTest {

    @BeforeSuite
    public void suiteSetup()
    {
        System.out.println("inside suite setup");
//        ExtentTestManager.getTest().log(Status.INFO,"inside suite setup");
    }

    @AfterSuite
    public void suiteTeardown()
    {
        System.out.println("inside suite teardown");
//        ExtentTestManager.getTest().log(Status.INFO,"inside suite teardown");
    }

    @BeforeTest
    public void beforeTest()
    {
        System.out.println("inside before test");
//        ExtentTestManager.getTest().log(Status.INFO,"inside before test");
    }

    @AfterTest
    public  void afterTest()
    {
        System.out.println("inside after test");
//        ExtentTestManager.getTest().log(Status.INFO,"inside after test");
    }

    @BeforeGroups("smoke")
    public void beforeGroup()
    {
        System.out.println("inside before group");
//        ExtentTestManager.getTest().log(Status.INFO,"inside before group");
    }

    @AfterGroups("smoke")
    public void afterGroup()
    {
        System.out.println("inside after group");
//        ExtentTestManager.getTest().log(Status.INFO,"inside after group");
    }

    @BeforeClass
    public void beforeClass()
    {
        System.out.println("inside before class "+getClass().getName());
//        ExtentTestManager.getTest().log(Status.INFO,"inside before class");
    }

    @AfterClass
    public void afterClass()
    {
        System.out.println("inside after class "+getClass().getName());
//        ExtentTestManager.getTest().log(Status.INFO,"inside after class");
    }

    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("inside before method");
//        ExtentTestManager.getTest().log(Status.INFO,"inside before method");
    }

    @AfterMethod
    public void afterMethod()
    {
        System.out.println("inside after method");
//        ExtentTestManager.getTest().log(Status.INFO,"inside after method");
    }

    @Test
    public void test1()
    {
        System.out.println("inside test 1");
        ExtentTestManager.getTest().log(Status.INFO,"inside test 1");
    }

    @Test
    public void test2()
    {
        System.out.println("inside test 2");
        ExtentTestManager.getTest().log(Status.INFO,"inside test 2");
    }

    @Test
    public void test3()
    {
        System.out.println("inside test 3");
        ExtentTestManager.getTest().log(Status.INFO,"inside test 3");
    }

    @Test(groups = {"smoke"})
    public void test4()
    {
        System.out.println("inside test 4 smoke");
        ExtentTestManager.getTest().log(Status.INFO,"inside test 4 smoke");
    }

    @Test(groups = {"smoke"})
    public void test5()
    {
        System.out.println("inside test 5 smoke");
        ExtentTestManager.getTest().log(Status.INFO,"inside test 5 smoke");
    }

    @Test(groups = {"smoke"})
    public void test6()
    {
        System.out.println("inside test 6 smoke");
        ExtentTestManager.getTest().log(Status.INFO,"inside test 6 smoke");
    }
}
