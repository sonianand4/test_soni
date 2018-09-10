package week4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Duplicate {
	@Test
	public void duplicateLeads() {
	
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
	driver.findElement(By.xpath("//span[text()='Email']")).click();
	driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("thanigai@gmail.com");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	String text = driver.findElement(By.xpath("//a[@id='ext-gen918']")).getText();
	System.out.println(text);
	driver.findElement(By.xpath("//div[@id='ext-gen979']/a")).click();
	driver.findElement(By.linkText("Duplicate Lead")).click();
	String title = driver.getTitle();
	System.out.println(title);
	driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	String text2 = driver.findElement(By.id("viewLead_firstName_sp")).getText();
	System.out.println(text2);
	if(text2.equalsIgnoreCase(text))
	{
		System .out.println("text matches");
		
	}
	else
		System.out.println("text does not match");
	
	

}
}
