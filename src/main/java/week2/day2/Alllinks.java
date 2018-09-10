package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alllinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A K ANAND\\Desktop\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.google.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("Soni",Keys.ENTER);
	    
	    List<WebElement> alllnk = driver.findElements(By.partialLinkText("Soni"));
	    System.out.println(alllnk.size());
	    driver.close();
	    
	}

}
