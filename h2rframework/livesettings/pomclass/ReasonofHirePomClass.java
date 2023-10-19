package org.livesettings.pomclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReasonofHirePomClass extends BaseClass {
	
	public ReasonofHirePomClass()
	{
		PageFactory.initElements(driver, this);  

	}

	@CacheLookup 
	@FindBy(xpath="//div[text()='Settings']") 
	private WebElement settings;
	
	@CacheLookup 
	@FindBy(xpath="//div[text()='Reason Of Hire']") 
	private WebElement reasonofhire;

	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Add Reason of hire']") 
	private WebElement addreasonofhire;

	@CacheLookup 
	@FindBy(xpath="//label[text()='Reason of hire']/following::input") 
	private WebElement inputreasonofhire;

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
	@FindBy(xpath="//input[@value='SomeAutomationreason']") 
	private WebElement cleardata;
	
	@CacheLookup 
	@FindBy(xpath="//label[text()='Reason of hire']/following::input") 
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

	public WebElement getReasonofhire() {
		return reasonofhire;
	}

	public WebElement getAddreasonofhire() {
		return addreasonofhire;
	}

	public WebElement getInputreasonofhire() {
		return inputreasonofhire;
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
