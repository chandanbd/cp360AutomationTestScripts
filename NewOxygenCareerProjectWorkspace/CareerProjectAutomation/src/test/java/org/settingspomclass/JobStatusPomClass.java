package org.settingspomclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobStatusPomClass extends BaseClass {
	
	public JobStatusPomClass()
	{
		PageFactory.initElements(driver, this);  //create a constructor 

	}


	@FindBy(xpath="//div[text()='Settings']") 
	private WebElement settings;
	
	@FindBy(xpath="//a[@title='Add Job Status']") 
	private WebElement addjobstatus;
	
	@FindBy(xpath="//div[text()='Job Status']") 
	private WebElement jobstatus;
	
	@FindBy(xpath="//label[text()='Search:']/following::input") 
	private WebElement jobstatusinput;
	
	@FindBy(xpath="//button[text()='Save']") 
	private WebElement jobstatussave;
	
	@FindBy(xpath="//input[@type='search']") 
	private WebElement searchbar;
	
	@FindBy(xpath="//button[@title='Search']") 
	private WebElement searchbutton;

	public WebElement getSettings() {
		return settings;
	}

	public WebElement getJobstatus() {
		return jobstatus;
	}

	public WebElement getJobstatusinput() {
		return jobstatusinput;
	}

	public WebElement getJobstatussave() {
		return jobstatussave;
	}

	public WebElement getSearchbar() {
		return searchbar;
	}

	public WebElement getSearchbutton() {
		return searchbutton;
	}

	public WebElement getAddjobstatus() {
		return addjobstatus;
	}
	
	
	

	@FindBy(xpath="//a[@title='Edit Job Status']") 
	private WebElement editjobstatus;
	
	
	@FindBy(xpath="//a[@title='Deactivate Job Status']") 
	private WebElement deactivatejobstatus;
	
	
	@FindBy(xpath="//input[@value='Somejobstatus']") 
	private WebElement cleardata;
	
	@FindBy(xpath="//label[text()='Search:']/following::input") 
	private WebElement jobstatusinput1;
	
	@FindBy(xpath="//button[@type='submit']") 
	private WebElement submit;

	public WebElement getEditjobstatus() {
		return editjobstatus;
	}

	public WebElement getDeactivatejobstatus() {
		return deactivatejobstatus;
	}

	public WebElement getCleardata() {
		return cleardata;
	}

	public WebElement getJobstatusinput1() {
		return jobstatusinput1;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	
	
	
	
	
	
	

}
