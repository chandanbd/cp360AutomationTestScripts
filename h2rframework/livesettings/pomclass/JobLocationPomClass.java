package org.livesettings.pomclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobLocationPomClass extends BaseClass {
	
	public JobLocationPomClass()
	{
		PageFactory.initElements(driver, this);  

	}
	
	@CacheLookup 
	@FindBy(xpath="//div[text()='Settings']") 
	private WebElement settings;

	public WebElement getSettings() {
		return settings;
	}

	@CacheLookup 
	@FindBy(xpath="//div[text()='Job Location']") 
	private WebElement joblocation;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Add Job Location']") 
	private WebElement addjoblocation;
	
	@CacheLookup 
	@FindBy(xpath="//input[@name='job_location_name']") 
	private WebElement inputjoblocationname;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Save']") 
	private WebElement save;
	
	@CacheLookup 
	@FindBy(xpath="//button[@aria-label='Edit']") 
	private WebElement edit;
	
	@CacheLookup 
	@FindBy(xpath="//input[@placeholder='Search...']") 
	private WebElement searchbar;
	
	@CacheLookup 
	@FindBy(xpath="//button[@aria-label='Delete']") 
	private WebElement delete;
	
	@CacheLookup 
	@FindBy(xpath="//input[@value='automation']") 
	private WebElement cleardata;
	
	@CacheLookup 
	@FindBy(xpath="(//label[text()='Job Location']/following::input)[1]") 
	private WebElement editinput;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Save']") 
	private WebElement editsave;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Submit']") 
	private WebElement deletesave;

	
	
	
	
	public WebElement getDeletesave() {
		return deletesave;
	}

	public WebElement getJoblocation() {
		return joblocation;
	}

	public WebElement getAddjoblocation() {
		return addjoblocation;
	}

	public WebElement getInputjoblocationname() {
		return inputjoblocationname;
	}

	public WebElement getSave() {
		return save;
	}

	public WebElement getEdit() {
		return edit;
	}

	public WebElement getSearchbar() {
		return searchbar;
	}

	public WebElement getDelete() {
		return delete;
	}

	public WebElement getCleardata() {
		return cleardata;
	}

	public WebElement getEditinput() {
		return editinput;
	}

	public WebElement getEditsave() {
		return editsave;
	}
	
	
	

}
