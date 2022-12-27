package com.flib.step;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.flib.resoures.CommonAction;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends CommonAction {
	CommonAction c = new CommonAction();
	
	
   
	@Before
	public void beforesenario() throws IOException, InterruptedException {
		c.launch1("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	}
	
	@After
	public void aftersenorio(Scenario scenario) {
		if(scenario.isFailed()) {
			final byte[]screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
		}else {
			final byte[]screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
		}
		//MobileSteps.driver.quit();

	}

}
