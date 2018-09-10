package wdMethods;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.junit.Test;

import javax.sound.midi.SysexMessage;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import testcases.Reports;
import wdMethodsAndTestcases.wdMethods.WdMethods;

public class SeMethods extends Reports implements WdMethods{
        public int i=1;
	public RemoteWebDriver driver;
	public void startApp(String browser, String url) {
		
			try {
				if(browser.equalsIgnoreCase("chrome")){
					System.setProperty("webdriver.chrome.driver", "C:\\Users\\A K ANAND\\Desktop\\chromedriver.exe");
					driver = new ChromeDriver();
				} else if (browser.equalsIgnoreCase("firefox")){
					System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
					driver = new FirefoxDriver();
				}
				driver.get(url);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				System.out.println("The Browser "+browser+" Launched Successfully");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				takeSnap();
			}
			

			
		
	}

	
	public WebElement locateElement(String locator, String locValue) {
		
			try {
				switch(locator) {
				case "id"	 : return driver.findElementById(locValue);
				case "class" : return driver.findElementByClassName(locValue);
				case "xpath" : return driver.findElementByXPath(locValue);
				case "linkText" :return driver.findElement(By.linkText(locValue));
				}
return null;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
	}

	@Override
	public WebElement locateElement(String locValue) {
		//driver.findElement(By.)
		return null;
	}

	
	public void type(WebElement ele, String data) {
		
			ele.sendKeys(data);
			System.out.println("The data "+data+" is Entered Successfully");
		
	}

	
	public void clickWithNoSnap(WebElement ele) {
		
			ele.click();
			System.out.println("The Element "+ele+" Clicked Successfully");
		
	}
	
	
	@Override
	public void click(WebElement ele) {
		
			ele.click();
			System.out.println("The Element "+ele+" Clicked Successfully");
		
	}

	
	public String getText(WebElement ele) {
		//ele.getText();
		//System.out.println("The element "+ele" text is retrieved");
		return null;
	}

	
	public void selectDropDownUsingText(WebElement ele, String value) {
		Select ele1=new Select(ele);
		ele1.selectByVisibleText(value);
		
		

	}

	
	public void selectDropDownUsingIndex(WebElement ele, int index) {
		Select obj=new Select(ele);
		obj.selectByIndex(index);

	}

	@Override
	public boolean verifyTitle(String expectedTitle) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void verifyExactText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub

	}

	@Override
	public void switchToWindow(int index) {
		// TODO Auto-generated method stub

	}

	@Override
	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub

	}

	@Override
	public void acceptAlert() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dismissAlert() {
		// TODO Auto-generated method stub

	}

	@Override
	public String getAlertText() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void takeSnap() {
		try {
			File src = driver.getScreenshotAs(OutputType.FILE);
			File des = new File("./snaps/img"+i+".png");
			try {
				FileUtils.copyFile(src, des);
			} catch (IOException e) {
				System.err.println("IOException");
			}
			i++;
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void closeBrowser() {
		driver.close();
	}

	
	public void closeAllBrowsers() {
		driver.quit();

	}

}
