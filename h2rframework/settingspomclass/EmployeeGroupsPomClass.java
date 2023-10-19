package org.settingspomclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeGroupsPomClass extends BaseClass {
	
	public  EmployeeGroupsPomClass()
	{
		PageFactory.initElements(driver, this);  //create a constructor

	}

	@CacheLookup 
	@FindBy(xpath="//div[text()='Settings']") // xpath and should make it private
	private WebElement settings;
	
	@CacheLookup 
	@FindBy(xpath="//div[contains(text(),'Employee Group')]") // xpath and should make it private
	private WebElement employeegrp;
	@CacheLookup 
	
	@FindBy(xpath="//a[normalize-space()='Add Employee Group']") // xpath and should make it private
	private WebElement addemployeegrp;
	@CacheLookup 
	
	@FindBy(xpath="//input[@name='groupName']") // xpath and should make it private
	private WebElement inputgrpname;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Save']") // xpath and should make it private
	private WebElement newemployeesave;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Add Row']") // xpath and should make it private
	private WebElement addrow;
	
	
	@CacheLookup 
	@FindBy(xpath="//button[@aria-label='Open']") // xpath and should make it private
	private WebElement employeedrpdwn1;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Add Row']") // xpath and should make it private
	private WebElement addrow2;
	
	@CacheLookup 
	@FindBy(xpath="(//button[@title='Open'])[2]") // xpath and should make it private
	private WebElement employeedrpdwn2;
	
	
	
	

	public WebElement getSettings() {
		return settings;
	}

	public WebElement getEmployeegrp() {
		return employeegrp;
	}

	public WebElement getAddemployeegrp() {
		return addemployeegrp;
	}

	public WebElement getInputgrpname() {
		return inputgrpname;
	}

	public WebElement getNewemployeesave() {
		return newemployeesave;
	}

	public WebElement getAddrow() {
		return addrow;
	}

	public WebElement getEmployeedrpdwn1() {
		return employeedrpdwn1;
	}

	public WebElement getAddrow2() {
		return addrow2;
	}

	public WebElement getEmployeedrpdwn2() {
		return employeedrpdwn2;
	}
	
	//button[normalize-space()='Add Row']
	
	
	

}
