package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reports {
	public ExtentTest test;
	public ExtentReports extent;
	public ExtentTest testData;
	@BeforeSuite
public void startResult()
{
	ExtentHtmlReporter html=new ExtentHtmlReporter("./reports/result.html");
	html.setAppendExisting(true);
	extent=new ExtentReports();
	extent.attachReporter(html);
}
@BeforeClass
public void startTestcase(String testName,String desc)
{
	test=extent.createTest(testName,desc);
}
public String reportStep(String desc,String status)
{if(status.equalsIgnoreCase("pass"))
	System.out.println("Pass");
else
	System.out.println("Fail");
	return null;
}
public void endResult()
{
	extent.flush();
}
@BeforeMethod
public void beforMethod(String author,String category)
{
	testData = test.createNode("leads");
	test.assignAuthor(author);
	test.assignCategory();
}
}


