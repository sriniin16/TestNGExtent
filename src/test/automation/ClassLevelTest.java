import com.aventstack.extentreports.ExtentTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Reporting.ExtentTestManager;

//TODO: retry analyser pending

@Test
public class ClassLevelTest {

    private ExtentTest test = ExtentTestManager.getTest();

    public Object method1()
    {
        System.out.println("inside method 1");
        return null;
    }

    @BeforeClass
    public void beforeclassTest()
    {
        System.out.println("before class "+getClass().getName());
        if (test!=null)
        {
            System.out.println("has instance");
        } else
        {
            System.out.println("no test instance");
        }
    }

    @AfterClass
    public void afterclasstest()
    {
        System.out.println("after class "+getClass().getName());
    }

    @Test(alwaysRun = true)
    public void alwaysRun()
    {
        System.out.println("inside always run");
    }

//    @Test(dependsOnGroups = "smoke")
//    public void dependsSmoke()
//    {
//        System.out.println("depends on groups");
//    }

    @Test(dependsOnMethods = "priorityTest2")
    public void dependsMethod()
    {
        System.out.println("depends on method");
    }

    @Parameters({"param-value"})
    @Test
    public void paramtestXML(String value)
    {
        System.out.println(value);
    }

    @Test(dataProvider = "mydata",dataProviderClass = data.class)
    public void dataProvide(String value)
    {
        System.out.println(value);
    }

    @Test(priority = 1)
    public void priorityTest1()
    {
        System.out.println("inside prio 1");
    }

    @Test(priority = 2)
    public void priorityTest2()
    {
        System.out.println("inside prio 2");
    }
}

