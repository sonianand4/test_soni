package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EditLead extends ProjectMethods {
	@BeforeClass(groups="common")
	public void setData() {
		sheetName ="login";
	}
	@Test(dataProvider="fetchData", groups= {"sanity"})
	public void editLead(String cname, String fname) {
		click(locateElement("linkText","CRM/SFA"));
		click(locateElement("linkText","Leads"));
		click(locateElement("linkText","Find Leads"));
		type(locateElement("xpath", "//input[@name='firstName'])[3]"),"fname");
		click(locateElement("xpath","//button[text()='Find Leads']"));
		click(locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		String title = driver.getTitle();
		if(title.equalsIgnoreCase("View Lead"))
		{
			System.out.println("Title matches");
		
		}
		else
			System.out.println("title does not match");
		click(locateElement("linkText","Edit"));
		locateElement("id","updateLeadForm_companyName").clear();
		type(locateElement("id","updateLeadForm_companyName"),"cname");
		String text = locateElement("id","viewLead_companyName_sp").getText();
		if(text.equalsIgnoreCase("Testleaf"))
		{
			System.out.println("Text matches");
		
		}
		else
			System.out.println("text does not match");
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
}
