package Steps;

import Reporting.ExtentTestManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hook {

    @Before
    public void before(Scenario scenario)
    {
        ExtentTestManager.startTest(scenario.getName());
        ExtentTestManager.getTest().info("Executing scenario: "+ scenario.getName());
    }

    @After
    public void after(Scenario scenario)
    {
        System.out.println("Finsih test and return to home page");
        ExtentTestManager.getTest().info("Finsih test and return to home page"+ scenario.getName());
        ExtentTestManager.getTest().info("Ending scenario: "+ scenario.getName());
        ExtentTestManager.endTest();
    }
}
