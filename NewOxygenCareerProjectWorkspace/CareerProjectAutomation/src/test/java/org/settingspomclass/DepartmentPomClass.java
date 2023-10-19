package org.settingspomclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DepartmentPomClass extends BaseClass {
	
	public DepartmentPomClass()
	{
		PageFactory.initElements(driver, this);  //create a constructor 

	}
	
	@FindBy(xpath="//div[text()='Settings']") 
	private WebElement settings;


	@FindBy(xpath="//div[text()='Department']") 
	private WebElement department;
	
	@FindBy(xpath="//a[contains(text(),'Add New Department')]") 
	private WebElement addnewdeptnmt;
	
	@FindBy(xpath="//label[text()='Search:']/following::input") 
	private WebElement inputnewdept;
	
	@FindBy(xpath="//button[text()='Save']") 
	private WebElement newdeptsave;
	
	@FindBy(xpath="//label[text()='Show']/following::input") 
	private WebElement searchbar;
	
	@FindBy(xpath="//button[@title='Search']") 
	private WebElement searchbutton;
	
	

	public WebElement getSettings() {
		return settings;
	}

	public WebElement getDepartment() {
		return department;
	}

	public WebElement getAddnewdeptnmt() {
		return addnewdeptnmt;
	}

	public WebElement getInputnewdept() {
		return inputnewdept;
	}

	public WebElement getNewdeptsave() {
		return newdeptsave;
	}

	public WebElement getSearchbar() {
		return searchbar;
	}

	public WebElement getSearchbutton() {
		return searchbutton;
	}
	
	
	@FindBy(xpath="//a[@title='Edit Department']") 
	private WebElement editdepartment;
	
	@FindBy(xpath="//input[@value='Somedepartment']") 
	private WebElement cleardata;
	
	@FindBy(xpath="//label[text()='Search:']/following::input") 
	private WebElement editinput;
	
	@FindBy(xpath="//button[text()='Save']") 
	private WebElement editsave;
	
	@FindBy(xpath="//a[@title='Deactivate Department']") 
	private WebElement deactivatedeptmnt;



	public WebElement getEditdepartment() {
		return editdepartment;
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

	public WebElement getDeactivatedeptmnt() {
		return deactivatedeptmnt;
	}
	
	
	
	
	
	

}
