import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class secondProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A K ANAND\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Anjali");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Anand");
		WebElement src=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sel=new Select(src);
		//sel.selectByVisibleText("Conference");
		//sel.selectByValue("LEAD_DIRECTMAIL");
		sel.selectByIndex(8);
		List<WebElement> alloptions = sel.getOptions();
		//int count=alloptions.size();
		//for(int i=0;i<count;i++)
		//{
		//	System.out.println(alloptions.get(i).getText());
		//}
		for(WebElement eachoptions:alloptions)
		{
			System.out.println(eachoptions.getText());
		}

	}

}
