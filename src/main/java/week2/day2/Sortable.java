package week2.day2;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A K ANAND\\Desktop\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://jqueryui.com/sortable/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement ele1 = driver.findElement(By.xpath("(//li[@class='ui-state-default ui-sortable-handle'])[1]"));
		WebElement ele2 = driver.findElement(By.xpath("(//li[@class='ui-state-default ui-sortable-handle'])[4]"));
		int y=ele2.getLocation().getY();
		Actions builder=new Actions(driver);
		builder.dragAndDropBy(ele1, 0, y).release().perform();
		System.out.println("Ele1 is moved");
		File scr = driver.getScreenshotAs(OutputType.FILE);
		File des=new File("/.snaps/img2.png");
		FileUtils.copyFile(scr,des);
		driver.close();

	}

}
