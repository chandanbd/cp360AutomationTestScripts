package org.settingspomclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StatusPomClass extends BaseClass {
	
	public StatusPomClass()
	{
		PageFactory.initElements(driver, this);  //create a constructor 

	}


	@FindBy(xpath="//div[text()='Settings']") 
	private WebElement settings;
	
	@FindBy(xpath="//div[text()='Status']") 
	private WebElement status;
	
	@FindBy(xpath="//a[contains(text(),'Add New Status')]") 
	private WebElement addnewstatus;
	
	@FindBy(xpath="//label[text()='Search:']/following::input") 
	private WebElement statusinput;
	
	
	
	@FindBy(xpath="//button[text()='Save']") 
	private WebElement save;
	
	@FindBy(xpath="//input[@type='search']") 
	private WebElement searchinput;
	
	@FindBy(xpath="//button[@title='Search']") 
	private WebElement searchbutton;
	
	@FindBy(xpath="//a[@title='Edit Status']") 
	private WebElement editstatus;
	
	@FindBy(xpath="//a[@title='Deactivate Status']") 
	private WebElement deactivatestatus;
	
	@FindBy(xpath="//input[@value='Somestatus']") 
	private WebElement clearstatus;
	
	

	public WebElement getClearstatus() {
		return clearstatus;
	}

	public WebElement getStatusinput() {
		return statusinput;
	}

	public WebElement getSettings() {
		return settings;
	}

	public WebElement getStatus() {
		return status;
	}

	public WebElement getAddnewstatus() {
		return addnewstatus;
	}

	public WebElement getSave() {
		return save;
	}

	public WebElement getSearchinput() {
		return searchinput;
	}

	public WebElement getSearchbutton() {
		return searchbutton;
	}

	public WebElement getEditstatus() {
		return editstatus;
	}

	public WebElement getDeactivatestatus() {
		return deactivatestatus;
	}
	
	

}
