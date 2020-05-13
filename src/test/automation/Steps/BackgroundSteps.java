package Steps;

import Reporting.ExtentTestManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundSteps {
    @When("sign in to application")
    public void signInToApplication() {
        System.out.println("sign in");
        ExtentTestManager.getTest().info("Sign in to application");
    }

    @Then("landing page displayed")
    public void landingPageDisplayed() {
        System.out.println("landing page");
        ExtentTestManager.getTest().info("Landing page displayed");
    }
}
