package org.settingspomclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientPomClass extends BaseClass{
	

	public ClientPomClass()
	{
		PageFactory.initElements(driver, this);  //create a constructor

	}
	
	@CacheLookup 
	@FindBy(xpath="//div[text()='Settings']") 
	private WebElement settings;
	
	@CacheLookup 
	@FindBy(xpath="//div[contains(text(),'Client')]") 
	private WebElement client;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Add Client']") 
	private WebElement addclient;
	
	@CacheLookup 
	@FindBy(xpath="//div[@role='dialog']//div//div//div//input[@type='text']") 
	private WebElement clientinput;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Submit']") 
	private WebElement clientsubmit;
	
	@CacheLookup 
	@FindBy(xpath="(//button[@aria-label='Edit'])[9]") 
	private WebElement editbutton;
	
	
	@CacheLookup 
	@FindBy(xpath="(//button[@aria-label='Deactivate'])[9]") 
	private WebElement deactivate;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Submit']") 
	private WebElement deactivatesubmit;
	
	
	
	public WebElement getDeactivate() {
		return deactivate;
	}

	public WebElement getDeactivatesubmit() {
		return deactivatesubmit;
	}

	public WebElement getEditbutton() {
		return editbutton;
	}

	public WebElement getCleartext() {
		return cleartext;
	}

	public WebElement getInputedit() {
		return inputedit;
	}

	public WebElement getEditsubmit() {
		return editsubmit;
	}

	@CacheLookup 
	@FindBy(xpath="//input[@value='Automation']") 
	private WebElement cleartext;
	
	@CacheLookup 
	@FindBy(xpath="//div[@role='dialog']//div//div//div//input[@type='text']") 
	private WebElement inputedit;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Submit']") 
	private WebElement editsubmit;
	
	
	
	
	
	
	
	
	
	
	
	
	

	public WebElement getSettings() {
		return settings;
	}

	public WebElement getClient() {
		return client;
	}

	public WebElement getAddclient() {
		return addclient;
	}

	public WebElement getClientinput() {
		return clientinput;
	}

	public WebElement getClientsubmit() {
		return clientsubmit;
	}

}
