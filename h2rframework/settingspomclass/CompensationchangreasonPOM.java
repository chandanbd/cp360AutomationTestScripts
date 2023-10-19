package org.settingspomclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompensationchangreasonPOM extends BaseClass {
	
	
	public CompensationchangreasonPOM()
	{
		PageFactory.initElements(driver, this);  //create a constructor

	}
	
	@CacheLookup 
	@FindBy(xpath="//div[text()='Settings']") // 
	private WebElement settings;
	
	@CacheLookup 
	@FindBy(xpath="//div[contains(text(),'Compensation Change Reason')]") // 
	private WebElement compensationchangereason;
	
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
	@FindBy(xpath="(//button[@aria-label='Edit'])[4]") // 
	private WebElement ccreditbutton;
	
	@CacheLookup 
	@FindBy(xpath="//input[@value='autotestt']") // 
	private WebElement ccrcleaarinput;
	
	@CacheLookup 
	@FindBy(xpath="//div[@role='dialog']//div//div//div//input[@type='text']") // 
	private WebElement inputeditreason;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Submit']") // 
	private WebElement editsubmit;
	
	@CacheLookup 
	@FindBy(xpath="(//button[@aria-label='Delete'])[4]") // 
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

	public  WebElement getCcreditbutton() {
		return ccreditbutton;
	}

	public WebElement getCcrcleaarinput() {
		return ccrcleaarinput;
	}

	public WebElement getInputeditreason() {
		return inputeditreason;
	}

	public WebElement getEditsubmit() {
		return editsubmit;
	}

	public WebElement getSettings() {
		return settings;
	}

	public WebElement getCompensationchangereason() {
		return compensationchangereason;
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
