package Steps;

import Reporting.ExtentTestManager;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.util.List;
import java.util.Map;


public class ScenarioOne {

    private DataClass data;
    private ParamCheck paramCheck;
    private ExtentTest childNode;


    @Given("this is given")
    public void thisIsGiven() throws IOException {
        childNode = ExtentTestManager.getTest().createNode("this is given step");
        childNode.pass("this is given");
        childNode.addScreenCaptureFromPath("testscreen.png");
    }

    @And("this is and")
    public void thisIsAnd() throws IOException {
        childNode = ExtentTestManager.getTest().createNode("this is and");
        childNode.pass("this is and node");
        childNode.addScreenCaptureFromPath("testscreen.png");
    }

    @When("this is when")
    public void thisIsWhen() throws IOException {
        childNode = ExtentTestManager.getTest().createNode("this is when");
        childNode.pass("this is when node");
        childNode.addScreenCaptureFromPath("testscreen.png");
    }

    @Then("this is then")
    public void thisIsThen() throws IOException {
        childNode = ExtentTestManager.getTest().createNode("this is then");
        childNode.pass("this is then node");
        childNode.addScreenCaptureFromPath("testscreen.png");
    }

    @And("this is a parm in the step {string}")
    public void thisIsAParmInTheStep(String param) {
        ExtentTestManager.getTest().info("param printed: "+ param);
        paramCheck = new ParamCheck(param);
    }


//    @When("I pass may values to the step file")
//    public void iPassMayValuesToTheStepFile(DataTable table) {
//        System.out.println(table.transpose().asMaps());
//        List<DataClass> users = table.asList(DataClass.class);
//        for (DataClass data: users) {
//            System.out.println("Usename: "+data.username);
//            System.out.println("Password: "+data.password);
//        }
//    }

    @When("I pass may values to the step file")
    public void iPassMayValuesToTheStepFile(DataTable table) {
        List<Map<String, String>> list = table.asMaps();
        System.out.println("creates list of maps");
        for (Map<String, String> item : list)
        {
            data = getDetails(item);
            ExtentTestManager.getTest().info("Username: "+ data.username);
            ExtentTestManager.getTest().info("password: "+ data.password);
            ExtentTestManager.getTest().info("Info: "+ data.info);
            System.out.println(item.entrySet());
        }
    }


    public DataClass getDetails(Map<String,String> entry)
    {
        System.out.println("@datatabletype");
        return new DataClass(entry.get("username"),entry.get("password"),entry.get("info"));
    }

    @Then("the values are passed")
    public void theValuesArePassed() {
        ExtentTestManager.getTest().info("Values passed: "+ "Username: "+data.username + "Password: "+data.password + "Info: "+data.info);
    }

    @When("^I pass may values to the step file (.+) and (.+)$")
    public void i_pass_may_values_to_the_step_file_and(String username, String password) throws Throwable {
        ExtentTestManager.getTest().info("*** Printing examples below ***");
        ExtentTestManager.getTest().info("Username: "+ username);
        ExtentTestManager.getTest().info("password: "+ password);
    }

    @And("the param is verified")
    public void theParamIsVerified() {
        ExtentTestManager.getTest().info("Param got is: "+ paramCheck.getParam());

    }
}
