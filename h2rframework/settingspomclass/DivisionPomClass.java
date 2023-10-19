package org.settingspomclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DivisionPomClass extends BaseClass{
	
	public DivisionPomClass()
	{
		PageFactory.initElements(driver, this);  //create a constructor

	}
	
	@CacheLookup 
	@FindBy(xpath="//div[text()='Settings']") // 
	private WebElement settings;
	
	@CacheLookup 
	@FindBy(xpath="//div[contains(text(),'Division')]") // 
	private WebElement division;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Add Division']") // 
	private WebElement adddivision;
	
	@CacheLookup 
	@FindBy(xpath="//div[@role='dialog']//div//div//div//input[@type='text']") // 
	private WebElement inputadddivision;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Submit'] ") // 
	private WebElement divisionsubmit;
	
	@CacheLookup 
	@FindBy(xpath="//div[normalize-space()='Active']") // 
	private WebElement statusbutton;
	
	@CacheLookup 
	@FindBy(xpath="//li[normalize-space()='All']") // 
	private WebElement statusall;
	
	@CacheLookup 
	@FindBy(xpath="(//button[@aria-label='Edit'])[2]") // 
	private WebElement edit;
	
	@CacheLookup 
	@FindBy(xpath="//input[@value='0abcd']") // 
	private WebElement cleareditinput;
	
	@CacheLookup 
	@FindBy(xpath="//div[@role='dialog']//div//div//div//input[@type='text']") // 
	private WebElement inputedit;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Submit']") // 
	private WebElement editsubmit;
	
	@CacheLookup 
	@FindBy(xpath="(//button[@aria-label='Deactivate'])[1]") // 
	private WebElement deactivate;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Submit']") // 
	private WebElement deactivatesubmit;
	
	
	
	
	
	

	public WebElement getDeactivate() {
		return deactivate;
	}

	public WebElement getDeactivatesubmit() {
		return deactivatesubmit;
	}

	public WebElement getStatusbutton() {
		return statusbutton;
	}

	public WebElement getStatusall() {
		return statusall;
	}

	public WebElement getEdit() {
		return edit;
	}

	public WebElement getCleareditinput() {
		return cleareditinput;
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

	public WebElement getDivision() {
		return division;
	}

	public WebElement getAdddivision() {
		return adddivision;
	}

	public WebElement getInputadddivision() {
		return inputadddivision;
	}

	public WebElement getDivisionsubmit() {
		return divisionsubmit;
	}
	
	
	
	

	

}
