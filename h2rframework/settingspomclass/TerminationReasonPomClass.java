package org.settingspomclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TerminationReasonPomClass extends BaseClass {
	
	public TerminationReasonPomClass()
	{
		PageFactory.initElements(driver, this);  //create a constructor

	}
	
	@CacheLookup 
	@FindBy(xpath="//div[text()='Settings']") // 
	private WebElement settings;
	
	@CacheLookup 
	@FindBy(xpath="//div[contains(text(),'Termination Reason')]") // 
	private WebElement terminationreason;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Add Reason']") // 
	private WebElement addreason;
	
	@CacheLookup 
	@FindBy(xpath="//div[@role='dialog']//div//div//div//input[@type='text']") // 
	private WebElement inputreason;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Submit']") // 
	private WebElement reasonsubmit;
	
	@CacheLookup 
	@FindBy(xpath="(//button[@aria-label='Edit'])[2]") // 
	private WebElement editbutton;
	
	@CacheLookup 
	@FindBy(xpath="//input[@value='automation']") // 
	private WebElement clearinput;
	
	@CacheLookup 
	@FindBy(xpath="//div[@role='dialog']//div//div//div//input[@type='text']") // 
	private WebElement inputedit;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Submit']") // 
	private WebElement editsubmit;
	
	@CacheLookup 
	@FindBy(xpath="(//button[@aria-label='Delete'])[2]") // 
	private WebElement deletebutton;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Submit']") // 
	private WebElement deletesubmit;
	
	
	

	public WebElement getDeletebutton() {
		return deletebutton;
	}

	public WebElement getDeletesubmit() {
		return deletesubmit;
	}

	public WebElement getEditbutton() {
		return editbutton;
	}

	public WebElement getClearinput() {
		return clearinput;
	}

	public WebElement getInputedit() {
		return inputedit;
	}

	public WebElement getEditsubmit() {
		return editsubmit;
	}

	public WebElement getSettings() {
		return settings;
	}

	public WebElement getTerminationreason() {
		return terminationreason;
	}

	public WebElement getAddreason() {
		return addreason;
	}

	public WebElement getInputreason() {
		return inputreason;
	}

	public WebElement getReasonsubmit() {
		return reasonsubmit;
	}

}
