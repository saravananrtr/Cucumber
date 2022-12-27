 package com.flib.step;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.flib.resoures.CommonAction;
import com.flip.objectrepositroy.MobilePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MobileSearch extends CommonAction {
	//public static  WebDriver driver;


	CommonAction c= new CommonAction();
	MobilePage m= new MobilePage();
	
	@Given("user login to flipkart")
	public void user_login_to_flipkart() throws InterruptedException {
         //c.launch1("https://www.flipkart.com/");
       
//		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
//        c.implicityWaits(30);
           }

	@When("user search mobile")
	public void user_search_mobile() {
//      c.search("Readmi mobiles");
		WebElement search=m.getSearch();
	
//		c.insertText(search, "Readmi mobiles");
//		search.click();
		c.insertTextEnter(search, "Readmi mobiles");
		WebElement mobileClick = m.getClickmobile();
 //     String mName = mobileClick.getText();
        String mName=c.getValue(mobileClick);
        mobileClick.click();
	    }
	

	@When("user choose the mobile")
	public void user_choose_the_mobile() {
		c.windowHandling();
	    
	}

	@When("user doing payment by using UPI")
	public void user_doing_payment_by_using_UPI() {
		WebElement buy=m.getBuybutton();
          c.scrolldown(buy);
	     buy.click();
	}

	@Then("user receives confirmation message")
	public void user_receives_confirmation_message() {
	    
	}
	
}
