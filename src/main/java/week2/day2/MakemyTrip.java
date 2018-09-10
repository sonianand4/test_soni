package week2.day2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakemyTrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A K ANAND\\Desktop\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		WebElement fromele = driver.findElementById("hp-widget__sfrom");
		fromele.sendKeys("kolk");
		fromele.sendKeys(Keys.TAB);
		fromele.sendKeys(Keys.ENTER);
		WebElement toele = driver.findElementById("hp-widget__sTo");
		toele.sendKeys("banga");
		toele.sendKeys(Keys.TAB);
		toele.sendKeys(Keys.ENTER);
		driver.findElementByClassName("ui-state-default ui-state-highlight ui-state-active").click();
		driver.findElementById("searchBtn");
		
		
		

	}

}
