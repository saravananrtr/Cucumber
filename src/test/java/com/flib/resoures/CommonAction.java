package com.flib.resoures;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonAction {
	public static  WebDriver driver;
//url launch
	
	
	public void launch1(String url) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
//		FileReader fr=new FileReader("C:\\Users\\Windows 11\\eclipse-workspace\\Cucumber-new\\src\\test\\resources\\Credentials.properties");
//		Properties p=new Properties();
//        p.load(fr);
   
		
//		ChromeOptions opt=new ChromeOptions();
//		opt.addArguments("--start-maximized");
//		opt.addArguments("--pop-up-blocking");
//		opt.addArguments("--headless");
        

		driver= new ChromeDriver();
		driver.get(url);
//		String y = "https://www.flipkart.com";
//		String x = p.getProperty("url");
//		System.out.println(x);
//		Thread.sleep(2000);
//		driver.get(x);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();

		}
	//searchBox sendkeys 
	public void search(String input) {
		driver.findElement(By.name("q")).sendKeys(input,Keys.ENTER); 
		
}
	
	//windowhandling
	public void windowHandling() {
		String parent= driver.getWindowHandle();
    	Set<String> child = driver.getWindowHandles();
    	for(String x:child) {
    		if(!x.equals(child)) {
    			driver.switchTo().window(x);
    		}
    	}

	}
	
	
	
	//getText
	public String getValue(WebElement element) {
		String text=element.getText();
		return text;
     }
	
	//scrolldown
	public void scrolldown(WebElement element) {
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	
	
	//sendkeys
	public void insertText(WebElement element,String value) {
          element.sendKeys(value);
	}
	
	//sendkeys with click
	public void insertTextEnter(WebElement element,String value) {
        element.sendKeys(value,Keys.ENTER);
	}
	
	//sendkeys by action
	public void insertText(String value) {
         Actions a= new Actions(driver);
         a.sendKeys(value).build().perform();
	}
	
	
	//implicity wait
	public void implicityWaits(int sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
        }
	

	

	

	

	
	
	

}
