package week4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EditAndDuplicateLeads {
@Test
	public  void main() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A K ANAND\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://www.leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).submit();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("divya");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//click on first result
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		//ele.click();
		driver.getTitle();
		driver.findElement(By.linkText("Edit")).click();
		WebElement ele2 = driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']"));
		ele2.clear();
		ele2.sendKeys("Info System");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String text = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		if(text.equalsIgnoreCase("Info System"))
		{
			System.out.println("test is passed");
		}
		else
			System.out.println("text failed");
		

	}


}


