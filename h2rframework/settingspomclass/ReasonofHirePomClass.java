package org.settingspomclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReasonofHirePomClass extends BaseClass{
	
	
	public ReasonofHirePomClass()
	{
		PageFactory.initElements(driver, this);  //create a constructor

	}
	
	@CacheLookup 
	@FindBy(xpath="//div[text()='Settings']") 
	private WebElement settings;
	
	@CacheLookup 
	@FindBy(xpath="//div[contains(text(),'Reason Of Hire')]") // 
	private WebElement reasonofhire;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Add Reason of hire']") // 
	private WebElement addreasonofhire;
	
	@CacheLookup 
	@FindBy(xpath="//div[@role='dialog']//div//div//div//input[@type='text']") // 
	private WebElement inputreason;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Submit']") // 
	private WebElement reasonsubmit;
	
	@CacheLookup 
	@FindBy(xpath="(//button[@aria-label='Edit'])[9]") 
	private WebElement editbutton;
	
	@CacheLookup 
	@FindBy(xpath="//input[@value='somereason12345']") 
	private WebElement cleartext;
	
	@CacheLookup 
	@FindBy(xpath="//div[@role='dialog']//div//div//div//input[@type='text']") 
	private WebElement inputedit;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Submit']") 
	private WebElement editsubmit;
	
	@CacheLookup 
	@FindBy(xpath="(//button[@aria-label='Delete'])[9]") 
	private WebElement deletebutton;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Submit']") 
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

	public WebElement getCleartext() {
		return cleartext;
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

	public WebElement getReasonofhire() {
		return reasonofhire;
	}

	public WebElement getAddreasonofhire() {
		return addreasonofhire;
	}

	public WebElement getInputreason() {
		return inputreason;
	}

	public WebElement getReasonsubmit() {
		return reasonsubmit;
	}
	

}
