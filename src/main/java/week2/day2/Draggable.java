package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Draggable {
@Test
	public void main() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A K ANAND\\Desktop\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Draggable")).click();
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		int x=drag.getLocation().x;
		int y=drag.getLocation().y;
		System.out.println(drag.getSize());
		Actions builder=new Actions(driver);
		System.out.println(x);
		System.out.println(y);
		builder.dragAndDropBy(drag, 30, 30).perform();
		System.out.println("drag around me element is dragged");
		
		driver.close();

	}

}
