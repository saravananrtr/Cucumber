package com.flip.objectrepositroy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flib.resoures.CommonAction;

public class MobilePage extends CommonAction {
	public MobilePage() {
		PageFactory.initElements(driver,this);
		}
	@FindBy(name="q")
	private WebElement search;
	
	public WebElement getSearch() {
		return search;
	}

	
	@FindBy(xpath="//button[@type='button']")
	private WebElement buybutton;
	

	public WebElement getBuybutton() {
		return buybutton;
	}
	@FindBy(xpath="(//div[@class='_4rR01T'])[3]")
	private WebElement clickmobile;

	public WebElement getClickmobile() {
		return clickmobile;
	}
	
	
	
}
