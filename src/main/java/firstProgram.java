import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class firstProgram {

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
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Soni");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumari");
		driver.findElement(By.className("smallSubmit")).click();
		String name = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if (name.equalsIgnoreCase("Soni"))
		{
			System.out.println("testcase is passed");
			
		}
		else
			System.out.println("testcase failed");
		driver.close();
			
		
		
		
		
		

	}

}
