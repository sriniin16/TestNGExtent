import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.xml.XmlSuite;

import java.util.List;
import java.util.Map;

public class Reporter implements IReporter {
    public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
        System.out.println("Reporter: inside the testNG reporter");
        for (ISuite iSuite: suites)
        {
            String suitename = iSuite.getName();
            Map<String, ISuiteResult> suiteMap = iSuite.getResults();

            for (ISuiteResult suite : suiteMap.values())
            {
                System.out.println("Passed Tests: "+suite.getTestContext().getPassedTests().size());
                System.out.println("Failed Tests: "+suite.getTestContext().getFailedTests().size());
            }
        }
    }
}
