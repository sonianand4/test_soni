package week2.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A K ANAND\\Desktop\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement ele = driver.findElementById("twotabsearchtextbox");
		ele.sendKeys("vivo v9");
		ele.sendKeys(Keys.TAB);
		ele.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//h2[@data-attribute='Vivo V9 (19:9 FullView Display, Pearl Black - Gold) with Offers']")).click();
		Set<String> allwin = driver.getWindowHandles();
		List<String> alllist=new ArrayList<String>();
		alllist.addAll(allwin);
		driver.switchTo().window(alllist.get(1));
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.findElement(By.id("hlb-ptc-btn-native")).click();
		System.out.println(driver.getTitle());
		driver.quit();
		

	}

}
