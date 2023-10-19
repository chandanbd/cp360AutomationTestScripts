package org.livesettings.pomclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobTypePomClass extends BaseClass{
	
	public JobTypePomClass()
	{
		PageFactory.initElements(driver, this);  

	}

	@CacheLookup 
	@FindBy(xpath="//div[text()='Settings']") 
	private WebElement settings;
	
	@CacheLookup 
	@FindBy(xpath="//div[text()='Job Type']") 
	private WebElement jobtype;

	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Add Job type']") 
	private WebElement addjobtype;

	@CacheLookup 
	@FindBy(xpath="//label[text()='Job type']/following::input") 
	private WebElement inputjobtype;

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
	@FindBy(xpath="//input[@value='SomeAutomationJobtype']") 
	private WebElement cleardata;
	
	@CacheLookup 
	@FindBy(xpath="//label[text()='Job type']/following::input") 
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

	public WebElement getJobtype() {
		return jobtype;
	}

	public WebElement getAddjobtype() {
		return addjobtype;
	}

	public WebElement getInputjobtype() {
		return inputjobtype;
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
