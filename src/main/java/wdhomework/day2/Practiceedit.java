package wdhomework.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practiceedit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\A K ANAND\\\\Desktop\\\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath("//img[@alt='Edit / Text Fields']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("email")).sendKeys("sonianand12345@gmail.com");
		WebElement txtbox = driver.findElement(By.xpath("//input[@value='Append ']"));
		txtbox.sendKeys("Leaf");
		txtbox.sendKeys(Keys.TAB);
		txtbox.sendKeys(Keys.ENTER);
		String text = driver.findElement(By.xpath("//input[@value='TestLeaf']")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		WebElement txtbox1 = driver.findElement(By.xpath("//input[@disabled='true']"));
		if(txtbox1.isEnabled())
		{
			System.out.println("textbox is enabled");
			
		}
		else 
			System.out.println("textbox is disabled");
		driver.close();
	}
}