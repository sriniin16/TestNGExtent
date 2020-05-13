package Reporting;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {

    private static ExtentReports reports;
    private static ExtentTest test;

    public static ExtentReports createInstance(String filename)
    {
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(filename);
        htmlReporter.config().setChartVisibilityOnOpen(true);
        htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
        htmlReporter.config().setTheme(Theme.STANDARD);
        htmlReporter.config().setDocumentTitle("Cucumber Reports");
        reports = new ExtentReports();
        reports.attachReporter(htmlReporter);
        return reports;
    }

    public static ExtentReports getInstance()
    {
        if (reports==null)
        {
            createInstance("report.html");
        }
        return reports;
    }
}
