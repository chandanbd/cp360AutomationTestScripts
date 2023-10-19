package org.livesettings.pomclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobTitlePomClass extends BaseClass{
	
	public JobTitlePomClass()
	{
		PageFactory.initElements(driver, this);  

	}

	@CacheLookup 
	@FindBy(xpath="//div[text()='Settings']") 
	private WebElement settings;
	
	@CacheLookup 
	@FindBy(xpath="//div[text()='Job Title']") 
	private WebElement jobtitle;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Add Job title']") 
	private WebElement addjobtitle;
	
	@CacheLookup 
	@FindBy(xpath="//label[text()='Job title']/following::input") 
	private WebElement jobtitleinput;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Submit']") 
	private WebElement jobtitlesubmit;

	public WebElement getSettings() {
		return settings;
	}

	public WebElement getJobtitle() {
		return jobtitle;
	}

	public WebElement getAddjobtitle() {
		return addjobtitle;
	}

	public WebElement getJobtitleinput() {
		return jobtitleinput;
	}

	public WebElement getJobtitlesubmit() {
		return jobtitlesubmit;
	}
	
	
	@CacheLookup 
	@FindBy(xpath="//input[@placeholder='Search...']") 
	private WebElement searchbar;
	
	@CacheLookup 
	@FindBy(xpath="//button[@aria-label='Edit']") 
	private WebElement edit;
	
	@CacheLookup 
	@FindBy(xpath="//input[@value='SomeAutomationTesting']") 
	private WebElement cleardata;
	
	
	
	@CacheLookup 
	@FindBy(xpath="//label[text()='Job title']/following::input") 
	private WebElement editinput;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Submit']") 
	private WebElement editsubmit;
	
	@CacheLookup 
	@FindBy(xpath="//button[@aria-label='Deactivate']") 
	private WebElement deactivate;
	

	@CacheLookup 
	@FindBy(xpath="//button[text()='Submit']") 
	private WebElement deactivatesubmit;
	
	@CacheLookup 
	@FindBy(xpath="//button[@aria-label='Active']") 
	private WebElement activate;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Submit']") 
	private WebElement activatesubmit;
	
	@CacheLookup 
	@FindBy(xpath="//div[text()='Active']") 
	private WebElement active;
	
	@CacheLookup 
	@FindBy(xpath="//li[text()='Inactive']") 
	private WebElement inactive;
	

	public WebElement getSearchbar() {
		return searchbar;
	}

	public WebElement getEdit() {
		return edit;
	}

	public WebElement getCleardata() {
		return cleardata;
	}

	public WebElement getEditsubmit() {
		return editsubmit;
	}

	public WebElement getDeactivate() {
		return deactivate;
	}

	public WebElement getEditinput() {
		return editinput;
	}

	public WebElement getDeactivatesubmit() {
		return deactivatesubmit;
	}

	public WebElement getActivate() {
		return activate;
	}

	public WebElement getActivatesubmit() {
		return activatesubmit;
	}

	public WebElement getActive() {
		return active;
	}

	public WebElement getInactive() {
		return inactive;
	}
	
	
	
	
	
	
	
	
	

}
