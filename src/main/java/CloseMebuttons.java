import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMebuttons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A K ANAND\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://layout.jquery-dev.com/demos/iframe_local.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//button[text()='Close Me'])[1]")).click();
		driver.switchTo().frame("childIframe");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(.,' Iframe West')]/p/button")).click();
		//driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//div[contains(.,'Iframe East')]/p/button")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("(//button[text()='Close Me'])[2]")).click();
		System.out.println("All close me buttons are closed");
		driver.close();

	}

}
