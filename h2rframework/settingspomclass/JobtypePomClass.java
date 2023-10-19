package org.settingspomclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobtypePomClass extends BaseClass{
	
	public JobtypePomClass()
	{
		PageFactory.initElements(driver, this);  //create a constructor

	}
	
	@CacheLookup 
	@FindBy(xpath="//div[text()='Settings']") // xpath and should make it private
	private WebElement Settings;
	
	@CacheLookup 
	@FindBy(xpath="//div[contains(text(),'Job Type')]") // xpath and should make it private
	private WebElement jobtype;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Add Job type']") // xpath and should make it private
	private WebElement addjobtype;
	
	@CacheLookup 
	@FindBy(xpath="//div[@role='dialog']//div//div//div//input[@type='text']") // xpath and should make it private
	private WebElement inputjobtype;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Submit']") // xpath and should make it private
	private WebElement submitjobtype;
	
	@CacheLookup 
	@FindBy(xpath="(//button[@aria-label='Edit'])[2]") // xpath and should make it private
	private WebElement editjobtype;
	
	@CacheLookup 
	@FindBy(xpath="//input[@value='dd']") // xpath and should make it private
	private WebElement inputeditjobtype;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Submit']") // xpath and should make it private
	private WebElement inputeditsubmit;

	public WebElement getSettings() {
		return Settings;
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

	public WebElement getSubmitjobtype() {
		return submitjobtype;
	}

	public WebElement getEditjobtype() {
		return editjobtype;
	}

	public WebElement getInputeditjobtype() {
		return inputeditjobtype;
	}

	public WebElement getInputeditsubmit() {
		return inputeditsubmit;
	}
	
	
	
	
	//input[@value='dd'] //button[normalize-space()='Submit']
	
	

}
