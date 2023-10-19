package org.livesettings.pomclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DepartmentPomClass extends BaseClass{
	
	public DepartmentPomClass()
	{
		PageFactory.initElements(driver, this);  

	}

	@CacheLookup 
	@FindBy(xpath="//div[text()='Settings']") 
	private WebElement settings;
	
	@CacheLookup 
	@FindBy(xpath="//div[text()='Department']") 
	private WebElement department;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Add Department']") 
	private WebElement adddepartment;
	
	@CacheLookup 
	@FindBy(xpath="//label[text()='Department']/following::input") 
	private WebElement departmentinput;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Submit']") 
	private WebElement departmentsubmit;

	public WebElement getSettings() {
		return settings;
	}

	public WebElement getDepartment() {
		return department;
	}

	public WebElement getAdddepartment() {
		return adddepartment;
	}

	public WebElement getDepartmentinput() {
		return departmentinput;
	}

	public WebElement getDepartmentsubmit() {
		return departmentsubmit;
	}
	
	@CacheLookup 
	@FindBy(xpath="//input[@placeholder='Search...']") 
	private WebElement searchbar;
	
	@CacheLookup 
	@FindBy(xpath="//button[@aria-label='Edit']") 
	private WebElement edit;
	
	@CacheLookup 
	@FindBy(xpath="//input[@value='AutomationtestDept']") 
	private WebElement cleardata;
	
	
	
	@CacheLookup 
	@FindBy(xpath="//label[text()='Department']/following::input") 
	private WebElement editinput;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Submit']") 
	private WebElement editsubmit;
	
	@CacheLookup 
	@FindBy(xpath="//button[@aria-label='Deactivate']") 
	private WebElement deactivate;
	

	@CacheLookup 
	@FindBy(xpath="//button[text()='Submit']") 
	private WebElement deactivatesubmit;
	
	@CacheLookup 
	@FindBy(xpath="//button[@aria-label='Active']") 
	private WebElement activate;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Submit']") 
	private WebElement activatesubmit;
	
	@CacheLookup 
	@FindBy(xpath="//div[text()='Active']") 
	private WebElement active;
	
	@CacheLookup 
	@FindBy(xpath="//li[text()='Inactive']") 
	private WebElement inactive;

	public WebElement getSearchbar() {
		return searchbar;
	}

	public WebElement getEdit() {
		return edit;
	}

	public WebElement getCleardata() {
		return cleardata;
	}

	public WebElement getEditinput() {
		return editinput;
	}

	public WebElement getEditsubmit() {
		return editsubmit;
	}

	public WebElement getDeactivate() {
		return deactivate;
	}

	public WebElement getDeactivatesubmit() {
		return deactivatesubmit;
	}

	public WebElement getActivate() {
		return activate;
	}

	public WebElement getActivatesubmit() {
		return activatesubmit;
	}

	public WebElement getActive() {
		return active;
	}

	public WebElement getInactive() {
		return inactive;
	}
	
	

}
