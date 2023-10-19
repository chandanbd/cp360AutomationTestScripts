package org.livesettings.pomclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientPomClass extends BaseClass {
	
	public ClientPomClass()
	{
		PageFactory.initElements(driver, this);  

	}

	@CacheLookup 
	@FindBy(xpath="//div[text()='Settings']") 
	private WebElement settings;
	
	@CacheLookup 
	@FindBy(xpath="//div[text()='Client']") 
	private WebElement client;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Add Client']") 
	private WebElement adddclient;
	
	@CacheLookup 
	@FindBy(xpath="//label[text()='Client']/following::input") 
	private WebElement clientinput;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Submit']") 
	private WebElement submit;
	
	@CacheLookup 
	@FindBy(xpath="//input[@placeholder='Search...']") 
	private WebElement searchbar;
	
	@CacheLookup 
	@FindBy(xpath="//button[@aria-label='Edit']") 
	private WebElement edit;
	
	@CacheLookup 
	@FindBy(xpath="//input[@value='AutomationtestDept']") 
	private WebElement cleardata;
	
	
	
	@CacheLookup 
	@FindBy(xpath="//label[text()='Department']/following::input") 
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

	public WebElement getSettings() {
		return settings;
	}

	public WebElement getClient() {
		return client;
	}

	public WebElement getAdddclient() {
		return adddclient;
	}

	public WebElement getClientinput() {
		return clientinput;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getSearchbar() {
		return searchbar;
	}

	public WebElement getEdit() {
		return edit;
	}

	public WebElement getCleardata() {
		return cleardata;
	}

	public WebElement getEditinput() {
		return editinput;
	}

	public WebElement getEditsubmit() {
		return editsubmit;
	}

	public WebElement getDeactivate() {
		return deactivate;
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
