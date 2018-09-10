package week2.day2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LearnChildWindowConcept {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A K ANAND\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://legacy.crystalcruises.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.linkText("GUEST CHECK-IN")).click();
		Set<String> allwin = driver.getWindowHandles();
		List<String> allopt=new ArrayList<String>();
		allopt.addAll(allwin);
		driver.switchTo().window(allopt.get(1));
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("View Offer»")).click();
		allwin = driver.getWindowHandles();
		allopt=new ArrayList<String>();
		allopt.addAll(allwin);
		driver.switchTo().window(allopt.get(2));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		File scr = ((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
		File des=new File("./snaps/img1.png");
		FileUtils.copyFile(scr,des);
		driver.quit();
		
		

	}

}
