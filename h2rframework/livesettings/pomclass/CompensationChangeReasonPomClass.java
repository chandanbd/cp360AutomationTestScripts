package org.livesettings.pomclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompensationChangeReasonPomClass extends BaseClass {
	
	public CompensationChangeReasonPomClass()
	{
		PageFactory.initElements(driver, this);  

	}

	@CacheLookup 
	@FindBy(xpath="//div[text()='Settings']") 
	private WebElement settings;
	
	@CacheLookup 
	@FindBy(xpath="//div[text()='Compensation Change Reason']") 
	private WebElement compensationchangereason;

	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Add Reason']") 
	private WebElement ccraddreason;

	@CacheLookup 
	@FindBy(xpath="//label[text()='Reason']/following::input") 
	private WebElement inputccreason;

	@CacheLookup 
	@FindBy(xpath="//button[text()='Submit']") 
	private WebElement submit;
	
	@CacheLookup 
	@FindBy(xpath="//input[@placeholder='Search...']") 
	private WebElement searchbar;

	public WebElement getSettings() {
		return settings;
	}

	public WebElement getCompensationchangereason() {
		return compensationchangereason;
	}

	public WebElement getCcraddreason() {
		return ccraddreason;
	}

	public WebElement getInputccreason() {
		return inputccreason;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getSearchbar() {
		return searchbar;
	}
	
	
	@CacheLookup 
	@FindBy(xpath="//button[@aria-label='Edit']") 
	private WebElement editbutton;
	
	@CacheLookup 
	@FindBy(xpath="//input[@value='SomeAutomationReason']") 
	private WebElement cleardata;
	
	@CacheLookup 
	@FindBy(xpath="//label[text()='Reason']/following::input") 
	private WebElement inputedit;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Submit']") 
	private WebElement editsubmit;
	
	@CacheLookup 
	@FindBy(xpath="//button[@aria-label='Delete']") 
	private WebElement deletebutton;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Submit']") 
	private WebElement deletesubmit;

	public WebElement getEditbutton() {
		return editbutton;
	}

	public WebElement getCleardata() {
		return cleardata;
	}

	public WebElement getInputedit() {
		return inputedit;
	}

	public WebElement getEditsubmit() {
		return editsubmit;
	}

	public WebElement getDeletebutton() {
		return deletebutton;
	}

	public WebElement getDeletesubmit() {
		return deletesubmit;
	}
	
	
	
	


}
