package org.settingspomclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobTitlePomClass extends BaseClass{
	
	public JobTitlePomClass()
	{
		PageFactory.initElements(driver, this);  //create a constructor

	}
	
	@CacheLookup 
	@FindBy(xpath="//div[text()='Settings']") // 
	private WebElement Settings;
	
	@CacheLookup 
	@FindBy(xpath="//div[contains(text(),'Job Title')]") // 
	private WebElement jobtitle;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Add Job title']") // 
	private WebElement addjobtitle;
	
	@CacheLookup 
	@FindBy(xpath="//div[@role='dialog']//div//div//div//input[@type='text']") // 
	private WebElement inputjobtitle;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Submit']") // 
	private WebElement jobsubmit;
	
	
	@CacheLookup 
	@FindBy(xpath="(//button[@aria-label='Edit'])[2]") // 
	private WebElement jobtitleedit;
	
	@CacheLookup 
	@FindBy(xpath="//input[@value='123edw']") // 
	private WebElement clearjobtitleedit;
	
	
	@CacheLookup 
	@FindBy(xpath="(//input[@type='text'])[3]") // 
	private WebElement inputjobtitleedit;
	
	@CacheLookup 
	@FindBy(xpath="//*[text()='Submit']") //
	private WebElement editsubmit;
	
	@CacheLookup 
	@FindBy(xpath="//div[normalize-space()='Active']") // 
	private WebElement Statusbutton;
	
	@CacheLookup 
	@FindBy(xpath="//li[normalize-space()='All']") // 
	private WebElement allstatus;
	
	@CacheLookup 
	@FindBy(xpath="(//button[@aria-label='Deactivate'])[2]") // 
	private WebElement deactivatebutto;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Submit']") // 
	private WebElement deactivatesubmit;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
			
			public WebElement getStatusbutton() {
		return Statusbutton;
	}



	public WebElement getAllstatus() {
		return allstatus;
	}



	public WebElement getDeactivatebutto() {
		return deactivatebutto;
	}



	public WebElement getDeactivatesubmit() {
		return deactivatesubmit;
	}



			public WebElement getInputjobtitleedit() {
		return inputjobtitleedit;
	}
		
			
			
	public WebElement getClearjobtitleedit() {
		return clearjobtitleedit;
	}

	
	

	public WebElement getJobtitleedit() {
		return jobtitleedit;
	}

	public WebElement getEditsubmit() {
		return editsubmit;
	}

	public WebElement getSettings() {
		return Settings;
	}

	public WebElement getJobtitle() {
		return jobtitle;
	}

	public WebElement getAddjobtitle() {
		return addjobtitle;
	}

	public WebElement getInputjobtitle() {
		return inputjobtitle;
	}

	public WebElement getJobsubmit() {
		return jobsubmit;
	}

}
