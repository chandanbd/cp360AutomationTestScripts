package org.settingspomclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobLocationPomClass extends BaseClass{
	
	public  JobLocationPomClass()
	{
		PageFactory.initElements(driver, this);  //create a constructor

	}
	
	@CacheLookup 
	@FindBy(xpath="//div[text()='Settings']") 
	private WebElement settings;
	
	@CacheLookup 
	@FindBy(xpath="//div[contains(text(),'Job Location')]") 
	private WebElement joblocation;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Add Job Location']") 
	private WebElement addjoblocation;
	
	@CacheLookup 
	@FindBy(xpath="//input[@name='job_location_name']") 
	private WebElement inputjoblocation;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Save']") 
	private WebElement jblocationsave;
	
	@CacheLookup 
	@FindBy(xpath="//input[@placeholder='Search...']") 
	private WebElement searchbar;
	
	@CacheLookup 
	@FindBy(xpath="//button[@aria-label='Edit']") 
	private WebElement editbutton;
	
	@CacheLookup 
	@FindBy(xpath="//input[@value='somelocation']") 
	private WebElement cleartext;
	
	@CacheLookup 
	@FindBy(xpath="//input[@name='job_location_name']") 
	private WebElement inputtext;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Save']") 
	private WebElement editsave;
	
	
	
	
	
	
	
	
	

	public WebElement getSearchbar() {
		return searchbar;
	}

	public WebElement getEditbutton() {
		return editbutton;
	}

	public WebElement getCleartext() {
		return cleartext;
	}

	public WebElement getInputtext() {
		return inputtext;
	}

	public WebElement getEditsave() {
		return editsave;
	}

	public WebElement getSettings() {
		return settings;
	}

	public WebElement getJoblocation() {
		return joblocation;
	}

	public WebElement getAddjoblocation() {
		return addjoblocation;
	}

	public WebElement getInputjoblocation() {
		return inputjoblocation;
	}

	public WebElement getJblocationsave() {
		return jblocationsave;
	}

}
