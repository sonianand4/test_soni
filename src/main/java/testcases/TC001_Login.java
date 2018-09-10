package testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class TC001_Login extends SeMethods {
	@Test
	public void login() {
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUname = locateElement("id", "username");
		type(eleUname, "DemoSalesManager");
		type(locateElement("id", "password"), "crmsfa");
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("linkText","CRM/SFA"));
		click(locateElement("linkText","Leads"));
		click(locateElement("linkText","Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"), "testleaf");
		type(locateElement("id", "createLeadForm_firstName"), "soni");
		type(locateElement("id", "createLeadForm_firstName"), "soni");
		type(locateElement("id", "createLeadForm_lastName"), "kumari");
		WebElement drpdown1=locateElement("id","createLeadForm_industryEnumId");
		selectDropDownUsingText(drpdown1,"Finance");
		click(locateElement("class","smallSubmit"));
		System.out.println("Lead creation is successful");
		closeBrowser();
		
		
		
		

}
}
