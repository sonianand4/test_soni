package wdhomework.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Homeworkdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A K ANAND\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[5]/a")).click();
		WebElement drp = driver.findElement(By.id("dropdown1"));
		Select sel=new Select(drp);
		sel.selectByIndex(1);
		WebElement drp1 = driver.findElement(By.name("dropdown2"));
		Select sel1= new Select(drp1);
		sel1.selectByVisibleText("Appium");
		WebElement drp2 = driver.findElement(By.id("dropdown3"));
		Select  sel2=new Select(drp2);
		sel2.selectByValue("0");
		WebElement drp3 = driver.findElement(By.className("dropdown"));
		Select sel3=new Select (drp3);
		List<WebElement> alloptions = sel3.getOptions();
		for(WebElement myoption:alloptions)
		{System.out.println(myoption.getText());
		
		}
		driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/select")).sendKeys("Loadrunner");
		//multiple select
		WebElement drp4=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[6]/select"));
		Select sel4=new Select(drp4);
		sel4.selectByValue("1");
		sel4.selectByVisibleText("Appium");
		sel4.selectByIndex(4);
		//deselectAll();
		driver.close();

	}

}
