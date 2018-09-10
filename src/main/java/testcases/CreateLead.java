package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateLead extends ProjectMethods{
	@BeforeClass(groups="common")
	public void setData() {
		sheetName ="login";
	}
	@Test(dataProvider="fetchData", groups= {"sanity"})
	public void createLead(String cname, String fname, String lname) {	
		click(locateElement("linkText", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"), cname);
		type(locateElement("id", "createLeadForm_firstName"), fname);
		type(locateElement("id", "createLeadForm_lastName"), lname);
		type(locateElement("id", "createLeadForm_primaryEmail"), "sonianand4@gmail.com");
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"), "8939243130");
		click(locateElement("name", "submitButton"));			
	}
	
}


