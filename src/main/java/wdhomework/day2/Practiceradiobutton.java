package wdhomework.day2;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.apache.commons.io.FileUtils;


public class Practiceradiobutton {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A K ANAND\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//img[@alt='Radio Button']")).click();
        String title = driver.getTitle();
        System.out.println(title);
        driver.findElement(By.id("yes")).click();
        driver.findElement(By.name("news")).click();
        driver.findElement(By.name("age")).click();
        File src1 = ((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
        File dec1=new File("./snaps/img.png");
        FileUtils.copyFile(src1, dec1);
        driver.close();
	}


}
