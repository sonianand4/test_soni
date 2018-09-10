package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A K ANAND\\Desktop\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.switchTo().frame(0);
	    WebElement ele1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
	    WebElement ele2 = driver.findElement(By.xpath("//li[text()='Item 3']"));
	    WebElement ele3 = driver.findElement(By.xpath("//li[text()='Item 5']"));
	    WebElement ele4 = driver.findElement(By.xpath("//li[text()='Item 7']"));
	    Actions builder=new Actions(driver);
	    builder.sendKeys(Keys.CONTROL).click(ele1).click(ele2).click(ele3).click(ele4).perform();
	    System.out.println("Items are selected");
	    driver.close();
	    
	    
	   
	    
		
		
		

	}

}
