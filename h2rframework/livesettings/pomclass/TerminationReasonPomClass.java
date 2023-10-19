package org.livesettings.pomclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TerminationReasonPomClass extends BaseClass{
	
	public TerminationReasonPomClass()
	{
		PageFactory.initElements(driver, this);  

	}

	@CacheLookup 
	@FindBy(xpath="//div[text()='Settings']") 
	private WebElement settings;
	
	@CacheLookup 
	@FindBy(xpath="//div[text()='Termination Reason']") 
	private WebElement terminationreason;

	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Add Reason']") 
	private WebElement traddreason;

	@CacheLookup 
	@FindBy(xpath="//label[text()='Reason']/following::input") 
	private WebElement inputreason;

	@CacheLookup 
	@FindBy(xpath="//button[text()='Submit']") 
	private WebElement submit;
	
	@CacheLookup 
	@FindBy(xpath="//input[@placeholder='Search...']") 
	private WebElement searchbar;
	
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

	public WebElement getSettings() {
		return settings;
	}

	public WebElement getTerminationreason() {
		return terminationreason;
	}

	public WebElement getTraddreason() {
		return traddreason;
	}

	public WebElement getInputreason() {
		return inputreason;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getSearchbar() {
		return searchbar;
	}

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
