package org.settingspomclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectsPomClass extends BaseClass{
	
	public ProjectsPomClass()
	{
		PageFactory.initElements(driver, this);  //create a constructor

	}
	
	@CacheLookup 
	@FindBy(xpath="//div[text()='Settings']") 
	private WebElement settings;
	
	@CacheLookup 
	@FindBy(xpath="//div[contains(text(),'Projects')]") 
	private WebElement projects;
	
	@CacheLookup 
	@FindBy(xpath="//button[normalize-space()='Add Project']") 
	private WebElement addproject;
	
	@CacheLookup 
	@FindBy(xpath="//label[text()='Project']/following::input") 
	private WebElement projectinput;
	
	@CacheLookup 
	@FindBy(xpath="//button[text()='Submit']") 
	private WebElement projectsubmit;
	
	@CacheLookup 
	@FindBy(xpath="//tbody/tr[5]/td[5]/h6[1]/div[1]/button[2]") 
	private WebElement addemployeesbutton;
	
	@CacheLookup 
	@FindBy(xpath="//button[@title='Open']") 
	private WebElement addemployeesbuttondrpdwn;
	
	

	public WebElement getAddemployeesbuttondrpdwn() {
		return addemployeesbuttondrpdwn;
	}

	public WebElement getAddemployeesbutton() {
		return addemployeesbutton;
	}

	public WebElement getSettings() {
		return settings;
	}

	public WebElement getProjects() {
		return projects;
	}

	public WebElement getAddproject() {
		return addproject;
	}

	public WebElement getProjectinput() {
		return projectinput;
	}

	public WebElement getProjectsubmit() {
		return projectsubmit;
	}

	
	

}
