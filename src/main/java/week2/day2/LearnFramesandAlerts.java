package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFramesandAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A K ANAND\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		//driver.switchTo().defaultContent();
		System.out.println(driver.switchTo().alert().getText());
		//((WebElement) driver.switchTo().alert()).clear();
		driver.switchTo().alert().sendKeys("Soni");
		driver.switchTo().alert().accept();
		//driver.switchTo().frame("iframeResult");
		Thread.sleep(3000);
		String text = driver.findElement(By.id("demo")).getText();
		System.out.println(text);
		if(text.equalsIgnoreCase("Hello soni! How are you today?"))
		{
			System.out.println("test passed");
		
		}
		
		else
			System.out.println("test failed");
		driver.close();

	}

}
