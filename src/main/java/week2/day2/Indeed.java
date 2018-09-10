package week2.day2;

import java.util.ArrayList;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Indeed {
	ChromeDriver driver;
	Actions builder;
	@Test
	public void indeed()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A K ANAND\\Desktop\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.indeed.co.in/Fresher-jobs");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		List<WebElement> joblinks = driver.findElements(By.xpath("(//td[@id='resultsCol'])//a[@data-tn-element='jobTitle']"));
		System.out.println(joblinks.size());
		for (WebElement clickonebyone:joblinks)
		{
			openInNewTab(clickonebyone);
			switchToWindow(1);
			System.out.println(driver.getTitle() +"\n");
			driver.close();
			switchToWindow(0);
		}
		
driver.quit();
}
	public void switchToWindow(int index)
	{
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> allHandles=new ArrayList<String>();
		allHandles.addAll(windowHandles);
		driver.switchTo().window(allHandles.get(index));
}
	public void openInNewTab(WebElement ele)
	{
		builder= new Actions(driver);
		((Actions) builder).sendKeys(ele,Keys.CONTROL).click(ele).perform();
	}
	}
