package org.settingspomclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DepartmentPomClass  extends BaseClass {
	
	public DepartmentPomClass()
	{
		PageFactory.initElements(driver, this);  //create a constructor

	}
	
	@CacheLookup 
	@FindBy(xpath="//div[text()='Settings']") // 
	private WebElement settings;
	
	@CacheLookup 
	@FindBy(xpath="//div[contains(text(),'Department')]") // 
	private WebElement department;
	
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Add Department']") // 
	private WebElement adddept;
	
	@CacheLookup 
	@FindBy(xpath="//div[@role='dialog']//div//div//div//input[@type='text']") // 
	private WebElement inputdept;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Submit']") // 
	private WebElement deptsubmit;
	
	@CacheLookup 
	@FindBy(xpath="//div[normalize-space()='Active']") // 
	private WebElement statusbutton;
	
	@CacheLookup 
	@FindBy(xpath="//li[normalize-space()='All']") // 
	private WebElement statusall;
	
	@CacheLookup 
	@FindBy(xpath="(//button[@aria-label='Edit'])[1]") // 
	private WebElement editbutton;
	
	

	@CacheLookup 
	@FindBy(xpath="//input[@value='1']") // 
	private WebElement clearinputedit;
	
	
	public WebElement getClearinputedit() {
		return clearinputedit;
	}

	@CacheLookup 
	@FindBy(xpath="(//input[@type='text'])[3]") // 
	private WebElement inputedit;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Submit']") // 
	private WebElement editsubmit;
	
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Submit']") // 
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

	public WebElement getEditbutton() {
		return editbutton;
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

	public WebElement getDepartment() {
		return department;
	}

	public WebElement getAdddept() {
		return adddept;
	}

	public WebElement getInputdept() {
		return inputdept;
	}

	public WebElement getDeptsubmit() {
		return deptsubmit;
	}

}
