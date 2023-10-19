package org.settingspomclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobtypePomClass extends BaseClass{
	
	public JobtypePomClass()
	{
		PageFactory.initElements(driver, this);  //create a constructor 

	}


	@FindBy(xpath="//div[text()='Settings']") 
	private WebElement settings;
	

	@FindBy(xpath="//div[text()='Job Type']") 
	private WebElement jobtype;
	

	@FindBy(xpath="//a[contains(text(),'Add New Job Type')]") 
	private WebElement addnewjobtype;
	

	@FindBy(xpath="//label[text()='Search:']/following::input") 
	private WebElement inputjobtype;
	

	@FindBy(xpath="//button[text()='Save']") 
	private WebElement jobtypesave;
	

	@FindBy(xpath="//input[@type='search']") 
	private WebElement searchbar;
	
	@FindBy(xpath="//button[@title='Search']") 
	private WebElement searchbutton;
	
	

	public WebElement getSettings() {
		return settings;
	}

	public WebElement getJobtype() {
		return jobtype;
	}

	public WebElement getAddnewjobtype() {
		return addnewjobtype;
	}

	public WebElement getInputjobtype() {
		return inputjobtype;
	}

	public WebElement getJobtypesave() {
		return jobtypesave;
	}

	public WebElement getSearchbar() {
		return searchbar;
	}

	public WebElement getSearchbutton() {
		return searchbutton;
	}
	
	
	
	

}
