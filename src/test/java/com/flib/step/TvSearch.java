package com.flib.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.flib.resoures.CommonAction;
import com.flip.objectrepositroy.TvPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TvSearch extends CommonAction {
	CommonAction c=new CommonAction();
	TvPage t=new TvPage();
	@Given("user login to flipkart2")
	public void user_login_to_flipkart2() throws InterruptedException {
		
		
			c.wait(30);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
			System.out.println("Login not required");
	}
        
   

	@When("user search Tv")
	public void user_search_Tv() {
		WebElement search=t.getSearch();

		c.insertTextEnter(search, "mi tv");
		WebElement mobileClick = t.getClicktv();
		System.out.println(c.getValue(t.getClicktv()));
        //String mName=c.getValue(mobileClick);
        mobileClick.click();
       
	    }
	

	@When("user choose the Tv")
	public void user_choose_the_Tv() {
		c.windowHandling();
	    
	}

	@When("user doing payment by using UPI2")
	public void user_doing_payment_by_using_UPI2() {
		WebElement buy=t.getBuybutton();
          c.scrolldown(buy);
	     buy.click();
	}

	@Then("user receives confirmation message2")
	public void user_receives_confirmation_message2() {
	    
	}
	
}



