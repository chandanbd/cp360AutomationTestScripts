package org.pomclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePomClass extends BaseClass
{
	public HomePomClass()
	{
		PageFactory.initElements(driver, this);  //create a constructor 
		
	}
	
	@CacheLookup 
	@FindBy(xpath="//div[text()='Home']") // xpath and should make it private
	private WebElement home;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Manage Widgets']") // xpath and should make it private
	private WebElement mwdg;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Close']") // xpath and should make it private
	private WebElement close;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Save']") // xpath and should make it private
	private WebElement save;
	
	@CacheLookup 
	@FindBy(xpath="//p[text()='View Announcements']") // xpath and should make it private
	private WebElement ancmnts;
	
	//p[text()='View Links']
	@CacheLookup 
	@FindBy(xpath="//p[text()='View Links']") // xpath and should make it private
	private WebElement vwlnks;
	
	@CacheLookup 
	@FindBy(xpath="(//*[name()='svg'][@role='img'])[28]") // xpath and should make it private
	private WebElement newtm;
	
	

	public WebElement getNewtm() {
		return newtm;
	}

	public WebElement getAncmnts() {
		return ancmnts;
	}

	public WebElement getVwlnks() {
		return vwlnks;
	}

	public WebElement getHome() {
		return home;
	}

	public WebElement getMwdg() {
		return mwdg;
	} 

	public WebElement getClose() {
		return close;
	}

	public WebElement getSave() {
		return save;
	}
	
	
	

}
