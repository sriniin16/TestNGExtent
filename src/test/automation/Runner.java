import Reporting.ExtentTestManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.*;

@Listeners(TestListener.class)
@CucumberOptions(features = "Features", glue = ".Steps")
@Test
public class Runner extends AbstractTestNGCucumberTests {

    @DataProvider(parallel = true)
    public Object[][] scenarios()
    {
        return super.scenarios();
    }

    @BeforeTest
    public void beforeTest()
    {
//        System.out.println("Initialize Webdriver");
//        ExtentTestManager.startTest(scenario.getName());
//        ExtentTestManager.getTest().info("Executing scenario: "+ scenario.getName());
    }

    @AfterTest
    public void afterTest()
    {
//        System.out.println("Quit WebDriver");
//        ExtentTestManager.getTest().info("Ending scenario: "+ scenario.getName());
//        ExtentTestManager.endTest();
    }

}
